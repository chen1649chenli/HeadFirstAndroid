package duck.hfad.com.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        //Get the drink from the intent
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);

        Drink drink = Drink.drinks[drinkId];

        //populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        //populate the drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());

        //populate the drink name
        ImageView image = (ImageView) findViewById(R.id.photo);
        image.setImageResource(drink.getImageResourceId());
        image.setContentDescription(drink.getName());
    }
}

