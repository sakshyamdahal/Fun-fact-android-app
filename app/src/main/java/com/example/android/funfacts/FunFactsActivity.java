package com.example.android.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    // not declaring inside onCreate method because we don't want to create it every time but just once
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // declare our view variables and assign them the views from layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.factsRLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // the button is clicked, so update the fact label with a new fact
                int color = mColorWheel.getColor();
                layout.setBackgroundColor(color);
                String fact = mFactBook.getFact();
                factLabel.setText(fact);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);

        // make and show toast messages
        // Toast.makeText(this, "Yay! OUr activity was created.", Toast.LENGTH_LONG).show();

        // Log.d(TAG, "Logging from onCreate Method");






    }

}
