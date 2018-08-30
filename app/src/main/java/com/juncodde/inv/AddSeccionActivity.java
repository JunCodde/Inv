package com.juncodde.inv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddSeccionActivity extends AppCompatActivity {

    private RecyclerView rv_addSeccionHorizontal, rv_addTallaHorizontal;
    private ImageButton imgBtn_SeccionHombre, imgBtn_SeccionMujer;
    private EditText et_Marca, et_PrecioVenta, et_PrecioCompra, et_CantInventario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_seccion);

        rv_addSeccionHorizontal = (RecyclerView) findViewById(R.id.rv_addSeccionHorizontal);
        rv_addTallaHorizontal = (RecyclerView) findViewById(R.id.rv_addTallaHorizontal);

        imgBtn_SeccionHombre = (ImageButton) findViewById(R.id.imgBtn_SeccionHombre);
        imgBtn_SeccionMujer = (ImageButton) findViewById(R.id.imgBtn_SeccionMujer);

        et_Marca = (EditText) findViewById(R.id.et_Marca);
        et_PrecioVenta = (EditText) findViewById(R.id.et_PrecioVenta);
        et_PrecioCompra = (EditText) findViewById(R.id.et_PrecioCompra);
        et_CantInventario = (EditText) findViewById(R.id.et_CantInventario);



    }
}
