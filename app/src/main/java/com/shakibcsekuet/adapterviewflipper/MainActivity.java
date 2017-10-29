package com.shakibcsekuet.adapterviewflipper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterViewFlipper;

public class MainActivity extends AppCompatActivity {

    private AdapterViewFlipper simpleAdapterViewFlipper;
    int[] fruitImages = {R.drawable.apple, R.drawable.pineapple, R.drawable.litchi, R.drawable.mango, R.drawable.banana};     // array of images
    String fruitNames[] = {"Apple", "Pine Apple", "Litchi", "Mango", "Banana"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleAdapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.simpleAdapterViewFlipper); // get the reference of AdapterViewFlipper
// Custom Adapter for setting the data in Views
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), fruitNames, fruitImages);
        simpleAdapterViewFlipper.setAdapter(customAdapter); // set adapter for AdapterViewFlipper
// set interval time for flipping between views
        simpleAdapterViewFlipper.setFlipInterval(3000);
// set auto start for flipping between views
        simpleAdapterViewFlipper.setAutoStart(true);
    }
}