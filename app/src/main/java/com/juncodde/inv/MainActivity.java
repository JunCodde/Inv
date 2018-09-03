package com.juncodde.inv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.juncodde.inv.Utils.Utilidades;

public class MainActivity extends AppCompatActivity {

    CardView cv_Inventario, cv_ventas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv_Inventario = (CardView) findViewById(R.id.cv_Inventario);
        cv_ventas = (CardView) findViewById(R.id.cv_ventas);


        cv_Inventario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Utilidades.makeIntent(MainActivity.this, InventarioActivity.class);

            }
        });

    }
}
