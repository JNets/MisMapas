package com.jormelcn.coursera.semaa3.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verMapa1(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("latitud", 9.402403774219282);
        intent.putExtra("longitud", -75.67770139721074);
        intent.putExtra("titulo", "Coveñas");
        startActivity(intent);
    }

    public void verMapa2(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("latitud", 8.764779513594423);
        intent.putExtra("longitud", -75.88304059055486);
        intent.putExtra("titulo", "Ronda del Rio");
        startActivity(intent);
    }

    public void verMapa3(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("latitud", 11.27027976091942);
        intent.putExtra("longitud", -74.19619934108891);
        intent.putExtra("titulo", "Playa Grande");
        startActivity(intent);
    }

    public void verMapa4(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("latitud", 9.241752914034615);
        intent.putExtra("longitud", -75.67935363796391);
        intent.putExtra("titulo", "House :D");
        startActivity(intent);
    }
}
