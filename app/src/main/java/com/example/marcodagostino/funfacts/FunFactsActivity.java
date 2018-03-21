package com.example.marcodagostino.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook factBook = new FactBook();
    //Declaring the View Variables
    private TextView factTextView;
    private Button showFactButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assigning the views from layout to variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = factBook.getFact();

                //Update the screen with a new fact
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
