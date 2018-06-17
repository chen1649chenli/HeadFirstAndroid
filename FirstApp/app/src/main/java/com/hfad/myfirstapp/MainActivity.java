package com.hfad.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){
        //Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText("Gottle of gear");

        //get the reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //Get the recommendation from the Bear Expert
        List<String> brandsList  = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList){
            brandsFormatted.append(brand).append("\n");
        }

        //Display the beer
        brands.setText(brandsFormatted.toString());


    }
}
