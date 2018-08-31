package com.juncodde.inv.Utils;

import android.app.Activity;
import android.content.Intent;

import com.juncodde.inv.Constantes.ConstantesSeccion;
import com.juncodde.inv.R;

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

}
