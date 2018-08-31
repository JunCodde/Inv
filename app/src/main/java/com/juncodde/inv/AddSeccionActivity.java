package com.juncodde.inv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageButton;

import com.juncodde.inv.Adapter.AdapterSeccionTalla;
import com.juncodde.inv.Adapter.AdapterSeccionType;
import com.juncodde.inv.Constantes.ConstantesSeccion;
import com.juncodde.inv.Modelo.TipoSeccion;

import java.util.ArrayList;

public class AddSeccionActivity extends AppCompatActivity {

    private RecyclerView rv_addSeccionHorizontal, rv_addTallaHorizontal;
    private ImageButton imgBtn_SeccionHombre, imgBtn_SeccionMujer;
    private EditText et_Marca, et_PrecioVenta, et_PrecioCompra, et_CantInventario;

    LinearLayoutManager lManager;
    AdapterSeccionType adapterType;
    AdapterSeccionTalla adapterTalla;




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

        ponerRVSeccion();
        ponerRVTalla();


    }

    private void ponerRVSeccion(){

        lManager = new LinearLayoutManager(this);
        lManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        rv_addSeccionHorizontal.setLayoutManager(lManager);

        adapterType = new AdapterSeccionType(getTipos(), this);
        rv_addSeccionHorizontal.setAdapter(adapterType);


    }

    private void ponerRVTalla(){

        ArrayList<String> tallas = new ArrayList<>();

        for (int i = 12; i < 54; i++) {
            tallas.add((String.valueOf(i)));
            i++;

        }

        lManager = new LinearLayoutManager(this);
        lManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        rv_addTallaHorizontal.setLayoutManager(lManager);

        adapterTalla = new AdapterSeccionTalla(tallas, this);
        rv_addTallaHorizontal.setAdapter(adapterTalla);


    }

    private ArrayList<TipoSeccion> getTipos(){
        ArrayList<TipoSeccion> tipos = new ArrayList<>();

        tipos.add(new TipoSeccion("Camisas", ConstantesSeccion.Ropa_ID_Camisa));
        tipos.add(new TipoSeccion("Pantalones", ConstantesSeccion.Ropa_ID_Pantalon));
        tipos.add(new TipoSeccion("Chaquetas", ConstantesSeccion.Ropa_ID_Chaqueta));
        tipos.add(new TipoSeccion("Faldas", ConstantesSeccion.Ropa_ID_Falda));
        tipos.add(new TipoSeccion("Medias", ConstantesSeccion.Ropa_ID_Media));
        tipos.add(new TipoSeccion("Ropa Interior", ConstantesSeccion.Ropa_ID_R_Interior));
        tipos.add(new TipoSeccion("Vestidos", ConstantesSeccion.Ropa_ID_Vestido));
        tipos.add(new TipoSeccion("Zapatos", ConstantesSeccion.Ropa_ID_Zapatos));

        return tipos;
    }
}
