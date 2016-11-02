package com.marrog.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        ImageView photo = (ImageView)findViewById(R.id.photo);
        TextView name = (TextView)findViewById(R.id.name);
        TextView description = (TextView)findViewById(R.id.description);

        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);


        Drink drink = Drink.drinks[drinkNo];

        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        name.setText(drink.getName());
        description.setText(drink.getDescription());


    }
}
