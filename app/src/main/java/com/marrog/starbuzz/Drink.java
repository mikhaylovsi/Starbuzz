package com.marrog.starbuzz;

/**
 * Created by user on 31.10.2016.
 */

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    public Drink[] drinks = {
//        new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
//        new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.capuccino),
//        new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
        new Drink("Latte", "A couple of espresso shots with steamed milk", 1),
        new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", 2),
        new Drink("Filter", "Highest quality beans roasted and brewed fresh", 3)

    };

     public Drink(String name, String description, int imageResourceId){

         this.name = name;
         this.description = description;
         this.imageResourceId = imageResourceId;

     }

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }


}
