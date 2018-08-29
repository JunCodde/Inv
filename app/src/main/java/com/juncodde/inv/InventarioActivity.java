package com.juncodde.inv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.juncodde.inv.Adapter.AdapterInvSeccion;
import com.juncodde.inv.Modelo.Seccion;

import java.util.ArrayList;

public class InventarioActivity extends AppCompatActivity {

    private RecyclerView rv_Inventario_Secciones;
    private Button btn_NuevaSeccion;
    private ArrayList<Seccion> seccions = new ArrayList<>();

    private AdapterInvSeccion adapter;
    private GridLayoutManager gManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);

        rv_Inventario_Secciones = (RecyclerView) findViewById(R.id.rv_Inventario_Secciones);
        btn_NuevaSeccion = (Button) findViewById(R.id.btn_NuevaSeccion);

        for (int i = 0; i < 10; i++) {

            Seccion s = new Seccion("Nombres " + i, "200", i);
            seccions.add(s);

        }

        ponerRV();


    }

    private void ponerRV(){

        gManager = new GridLayoutManager(this, 2);
        gManager.setOrientation(LinearLayoutManager.VERTICAL);

        rv_Inventario_Secciones.setLayoutManager(gManager);

        adapter = new AdapterInvSeccion(seccions, this);
        rv_Inventario_Secciones.setAdapter(adapter);


    }
}
