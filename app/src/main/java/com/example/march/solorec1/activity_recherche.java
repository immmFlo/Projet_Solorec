package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_recherche extends AppCompatActivity {

    private Button btnrec ;
    private Button btnprecrec;
    private Button btnretourrec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);

      btnrec = (Button) findViewById(R.id.button_rec);
        btnrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendRecherche();
            }
        });

        btnprecrec = (Button) findViewById(R.id.button_precrec);
        btnprecrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToMenu();
            }
        });

        btnretourrec = (Button) findViewById(R.id.button_retourrec);
        btnretourrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToMenu();
            }
        });
    }

    private void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }

    private void SendRecherche() {
        Intent intentSendRecherche = new Intent();
        intentSendRecherche.setClass(this, activity_menu.class);
        startActivity(intentSendRecherche);
    }


}
