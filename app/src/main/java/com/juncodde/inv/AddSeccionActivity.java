package com.juncodde.inv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.juncodde.inv.Adapter.AdapterSeccionTalla;
import com.juncodde.inv.Adapter.AdapterSeccionType;
import com.juncodde.inv.BaseDatos.BaseDatos;
import com.juncodde.inv.Constantes.ConstantesSeccion;
import com.juncodde.inv.Modelo.Prenda;
import com.juncodde.inv.Modelo.Talla;
import com.juncodde.inv.Modelo.TipoSeccion;
import com.juncodde.inv.Utils.Utilidades;

import java.util.ArrayList;

public class AddSeccionActivity extends AppCompatActivity {

    private static final String TAG = "AddSeccionActivity";
    private RecyclerView rv_addSeccionHorizontal, rv_addTallaHorizontal, rv_addSubTipoHorizontal;
    private ImageButton imgBtn_SeccionHombre, imgBtn_SeccionMujer;
    private EditText et_Marca, et_PrecioVenta, et_PrecioCompra, et_CantInventario;
    private Button btn_GuardarSeccion;

    LinearLayoutManager lManager;
    AdapterSeccionType adapterType;
    AdapterSeccionTalla adapterTalla;

    public String genero = "h";
    String idSelected = "";

    public String idTipoSelected = "";
    public String idSubTipoSelected = "";
    public String idTallaSelected = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_seccion);

        rv_addSeccionHorizontal = (RecyclerView) findViewById(R.id.rv_addSeccionHorizontal);
        rv_addTallaHorizontal = (RecyclerView) findViewById(R.id.rv_addTallaHorizontal);
        rv_addSubTipoHorizontal = (RecyclerView) findViewById(R.id.rv_addSubTipoHorizontal);

        imgBtn_SeccionHombre = (ImageButton) findViewById(R.id.imgBtn_SeccionHombre);
        imgBtn_SeccionMujer = (ImageButton) findViewById(R.id.imgBtn_SeccionMujer);

        et_Marca = (EditText) findViewById(R.id.et_Marca);
        et_PrecioVenta = (EditText) findViewById(R.id.et_PrecioVenta);
        et_PrecioCompra = (EditText) findViewById(R.id.et_PrecioCompra);
        et_CantInventario = (EditText) findViewById(R.id.et_CantInventario);

        btn_GuardarSeccion = (Button) findViewById(R.id.btn_GuardarSeccion);

        ponerRVSeccion();
        ponerRVTalla();
        ponerRVSubSeccion(idSelected);
        checkGenero();

        imgBtn_SeccionMujer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genero = "m";
                checkGenero();
                ponerRVSubSeccion(idSelected);
            }
        });

        imgBtn_SeccionHombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genero = "h";
                checkGenero();
                ponerRVSubSeccion(idSelected);
            }
        });

        btn_GuardarSeccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(idTipoSelected.isEmpty()){
                    Toast.makeText(AddSeccionActivity.this, "Seleccione el tipo de ropa", Toast.LENGTH_SHORT).show();
                }else if(idSubTipoSelected.isEmpty()){
                    Toast.makeText(AddSeccionActivity.this, "Seleccione el tipo de " + idTipoSelected, Toast.LENGTH_SHORT).show();
                }else if(idTallaSelected.isEmpty()){
                    Toast.makeText(AddSeccionActivity.this, "Seleccione la talla", Toast.LENGTH_SHORT).show();
                }else if(et_Marca.getText().toString().isEmpty()){
                    Toast.makeText(AddSeccionActivity.this, "Ingrese su marca", Toast.LENGTH_SHORT).show();
                }else if(et_PrecioVenta.getText().toString().isEmpty()){
                    Toast.makeText(AddSeccionActivity.this, "Ingrese el precio de venta", Toast.LENGTH_SHORT).show();
                }else if(et_PrecioCompra.getText().toString().isEmpty()){
                    Toast.makeText(AddSeccionActivity.this, "Ingrese el precio de compra", Toast.LENGTH_SHORT).show();
                }else if(et_CantInventario.getText().toString().isEmpty()){
                    Toast.makeText(AddSeccionActivity.this, "Ingrese la cantidad en el Inventario", Toast.LENGTH_SHORT).show();
                }else if(!isNumber(et_CantInventario.getText().toString())){
                    Toast.makeText(AddSeccionActivity.this, "Cantidad de inventario debe ser en numeros", Toast.LENGTH_SHORT).show();
                } else if(!isNumber(et_PrecioVenta.getText().toString())){
                    Toast.makeText(AddSeccionActivity.this, "Precio de venta debe ser en numeros", Toast.LENGTH_SHORT).show();
                }else if(!isNumber(et_PrecioCompra.getText().toString())){
                    Toast.makeText(AddSeccionActivity.this, "Precio de campra debe ser en numeros", Toast.LENGTH_SHORT).show();
                }else{

                    Prenda p = new Prenda(idTipoSelected, idSubTipoSelected, genero, et_Marca.getText().toString(), Utilidades.generarID(),  Integer.valueOf(et_PrecioVenta.getText().toString()),
                            Integer.valueOf(et_PrecioCompra.getText().toString()),Integer.valueOf(idTallaSelected), Integer.valueOf(et_CantInventario.getText().toString()));

                    //esa prenda es un objeto listo para guardar en Base de datos // TODO





                }

            }
        });



    }

    private boolean isNumber(String num){
        try {
            double d = Double.parseDouble(num);
        }
        catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    private void ponerRVSeccion(){

        lManager = new LinearLayoutManager(this);
        lManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        rv_addSeccionHorizontal.setLayoutManager(lManager);

        adapterType = new AdapterSeccionType(getTipos(), this);
        rv_addSeccionHorizontal.setAdapter(adapterType);


    }

    public void ponerRVSubSeccion(String id){

        idSelected = id;

        ArrayList<TipoSeccion> listaGenero = new ArrayList<>();
        ArrayList<TipoSeccion> lista = Utilidades.getSubTipos(id);

        if(checkGenero().equals("h")){

            for (int i = 0; i < lista.size(); i++) {

                TipoSeccion tipoCurrent = lista.get(i);

                if(tipoCurrent.getId().contains("_h")){
                    listaGenero.add(tipoCurrent);

                }else if(tipoCurrent.getId().contains("_m")){
                }else {
                    listaGenero = lista;
                }

            }

        }else if(checkGenero().equals("m")){

            for (int i = 0; i < lista.size(); i++) {

                TipoSeccion tipoCurrent = lista.get(i);

                if(tipoCurrent.getId().contains("_m")){
                    listaGenero.add(tipoCurrent);

                }else if(tipoCurrent.getId().contains("_h")){
                }else {
                    listaGenero = lista;
                }

            }

        }

        lManager = new LinearLayoutManager(this);
        lManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        rv_addSubTipoHorizontal.setLayoutManager(lManager);

        adapterType = new AdapterSeccionType(listaGenero, this);
        rv_addSubTipoHorizontal.setAdapter(adapterType);


    }

    public String checkGenero(){

        if(genero.equals("h")){

            imgBtn_SeccionHombre.setEnabled(false);
            imgBtn_SeccionMujer.setEnabled(true);

        }else if(genero.equals("m")){

            imgBtn_SeccionHombre.setEnabled(true);
            imgBtn_SeccionMujer.setEnabled(false);

        }

        return genero;

    }


    private void ponerRVTalla(){

        ArrayList<Talla> tallas = new ArrayList<>();

        for (int i = 12; i < 44; i++) {
            tallas.add(new Talla(String.valueOf(i)));
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
