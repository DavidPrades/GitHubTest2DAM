package org.ieselcaminas.pmdm.githubtest2dam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout gridLayput = findViewById(R.id.gridLayput);

        for (int i=0; i < 20; i++) {
            Button b = new Button(this);
            b.setText("b " + i);
            gridLayput.addView(b);
        }
    }

    private void b1_method_Victor() {
        Toast.makeText(this, "Victor Alonso Barberan", Toast.LENGTH_LONG).show();
    }

    private void b2_method_Alejandro() {

    }


    private void b3_method_Alex() {
        Toast.makeText(this, "Alex Bogdan", Toast.LENGTH_LONG).show();
    }

    private void b4_method_Sergi() {
        Toast.makeText(this, "Sergi Cornelles Aguilar", Toast.LENGTH_LONG).show();
    }

    private void b5_method_Agustin() {
        Toast.makeText(this, "Agustin Domingo", Toast.LENGTH_LONG).show();
    }

    private void b6_method_Jonatan() {
        Toast.makeText(this, "Jonatan Escrig", Toast.LENGTH_LONG).show();

    }

    private void b7_method_Adrian() {

    }

    private void b8_method_Lidia() {

    }

    private void b9_method_Reza() {

    }

    private void b10_method_Marc() {

    }

    private void b11_method_Bruno() {

    }

    private void b12_method_Petru() {
        Toast.makeText(this, "Alex Petru", Toast.LENGTH_LONG).show();

    }

    private void b13_method_David() {

        Toast.makeText(this, "David Prades", Toast.LENGTH_LONG).show();
    }

    private void b14_method_Francesc() {

    }

    private void b15_method_Ferran() {
        Toast.makeText(this, "Ferran",Toast.LENGTH_SHORT).show();
    }
}
