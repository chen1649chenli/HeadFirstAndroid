package duck.hfad.com.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        //This populates the list view with data from the drinks array
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks, View view, int position, long id) {
                        //pass the drink the user clicks on to Drink Activity
                        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                        intent.putExtra(DrinkActivity.EXTRA_DRINKID, (int)id);
                        startActivity(intent);

                    }
                };
        //Add the listener to the list view
        listDrinks.setOnItemClickListener(itemClickListener);
    }

}
