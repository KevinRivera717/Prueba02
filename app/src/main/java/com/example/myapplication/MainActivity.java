package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    final String[] datos = new String[]{"Dolar", "Euro", "Colones"};

    private Spinner monedaActualSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tbhConversores = (TabHost) findViewById(R.id.tabConversores);
        tbhConversores.setup();

        tbhConversores.addTab(tbhConversores.newTabSpec("Moneda").setContent(R.id.Moneda).setIndicator("Moneda", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Longitud").setContent(R.id.Longitud).setIndicator("Longitud", null));

        ArrayAdapter<String> adactador = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, datos);

        monedaActualSP = (Spinner) findViewById(R.id.MonedaActualSP);
        monedaActualSP.setAdapter(adactador);
    }
}