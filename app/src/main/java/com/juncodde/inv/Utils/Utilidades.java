package com.juncodde.inv.Utils;

import android.app.Activity;
import android.content.Intent;

import com.juncodde.inv.Constantes.ConstantesSeccion;
import com.juncodde.inv.Modelo.TipoSeccion;
import com.juncodde.inv.R;

import java.util.ArrayList;

public class Utilidades {

    public static int getImagen(String id){
        int r = 0;

        switch (id){

            case ConstantesSeccion.Ropa_ID_Camisa:
                r = R.drawable.camisa;
                    break;

            case ConstantesSeccion.Ropa_ID_Chaqueta:
                r = R.drawable.chaqueta;

                break;

            case ConstantesSeccion.Ropa_ID_Falda:
                r = R.drawable.falda;

                break;

            case ConstantesSeccion.Ropa_ID_Media:
                r = R.drawable.medias;

                break;

            case ConstantesSeccion.Ropa_ID_Pantalon:
                r = R.drawable.pantalones;

                break;

            case ConstantesSeccion.Ropa_ID_Pijama:
                r = R.drawable.pijamas;

                break;

            case ConstantesSeccion.Ropa_ID_R_Interior:
                r = R.drawable.ropa_interior_hombre;

                break;

            case ConstantesSeccion.Ropa_ID_Vestido:
                r = R.drawable.vestidos;

                break;

            case ConstantesSeccion.Ropa_ID_Zapatos:
                r = R.drawable.zapatos;

                break;

            default:
                r = R.drawable.camisa;

                break;

        }

        return r;

    }

    public static void makeIntent(Activity desde, Class hacia){

        Intent i = new Intent(desde, hacia).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        desde.startActivity(i);
        desde.finish();

    }

    private ArrayList<TipoSeccion> getSubTipos(String id){
        ArrayList<TipoSeccion> tipos = new ArrayList<>();

        switch (id){

            case ConstantesSeccion.Ropa_ID_Camisa:

                break;

            case ConstantesSeccion.Ropa_ID_Chaqueta:


                break;

            case ConstantesSeccion.Ropa_ID_Falda:


                break;

            case ConstantesSeccion.Ropa_ID_Media:


                break;

            case ConstantesSeccion.Ropa_ID_Pantalon:


                break;

            case ConstantesSeccion.Ropa_ID_Pijama:


                break;

            case ConstantesSeccion.Ropa_ID_R_Interior:


                break;

            case ConstantesSeccion.Ropa_ID_Vestido:


                break;

            case ConstantesSeccion.Ropa_ID_Zapatos:


                break;

            default:


                break;

        }

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
