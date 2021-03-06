package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_fin_dia extends AppCompatActivity {
    private Button btnvaldia;
    private Button btnprecfindia;
    private Button btnretourfindia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_dia);


        btnretourfindia=(Button) findViewById(R.id.button_retourfindia);
        btnretourfindia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                BackToMenu();
            }
        });

        btnvaldia=(Button) findViewById(R.id.button_valdia);
        btnprecfindia=(Button) findViewById(R.id.button_precfindia);

        btnprecfindia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                BackToCircuit();
            }
        });
        btnvaldia.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GoToMenu();
                                 }
                             }
        );
    }

    private void GoToMenu() {
        Intent intentGoToMenu = new Intent();
        intentGoToMenu.setClass(this, activity_menu.class);
        startActivity(intentGoToMenu);
    }

    private void BackToCircuit() {
        Intent intent4 = new Intent();
        intent4.setClass(this, activity_circuit_dia.class);
        startActivity(intent4);
    }
    private void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }


}
