package com.juncodde.inv.Utils;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

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

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_chemise_h:
                r = R.drawable.c_chemise;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_tirantes_m:
                r = R.drawable.c_tirantes_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_vestir_h:
                r = R.drawable.c_vestir;

                break;



            case ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_deportiva_h:
                r = R.drawable.c_deportivas;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_vestir_m:
                r = R.drawable.c_vestir_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Vestido_SubTipo_corto_m:
                r = R.drawable.corta;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Vestido_SubTipo_largo_m:
                r = R.drawable.larga;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Medias_SubTipo_m:
                r = R.drawable.medias_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Medias_SubTipo_h:
                r = R.drawable.medias_h;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Pantalon_SubTipo_jean_m:
                r = R.drawable.jeans_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Pantalon_SubTipo_jean_h:
                r = R.drawable.jeans_h;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Pantalon_SubTipo_short_h:
                r = R.drawable.shorts_h;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Pantalon_SubTipo_short_m:
                r = R.drawable.shorts_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Pijama_SubTipo_h:
                r = R.drawable.pijama_h;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Pijama_SubTipo_m:
                r = R.drawable.pijama_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_R_Interior_SubTipo_m:
                r = R.drawable.ropa_interior_mujer;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_R_Interior_SubTipo_h:
                r = R.drawable.ropa_interior_hombre;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_R_Interior_SubTipo_Sosten_m:
                r = R.drawable.sosten;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Sueter_SubTipo_sueter_m:
                r = R.drawable.sueter_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Sueter_SubTipo_sueter_h:
                r = R.drawable.sueter_h;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Sueter_SubTipo_chaqueta_m:
                r = R.drawable.chaqueta_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Zapatos_SubTipo_deportivo_m:
                r = R.drawable.deportivo_m;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Zapatos_SubTipo_deportivo_h:
                r = R.drawable.deportivo_h;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Zapatos_SubTipo_vestir_h:
                r = R.drawable.vestir_h;

                break;

            case ConstantesSeccion.Ropa_ID_Ropa_ID_Zapatos_SubTipo_vestir_m:
                r = R.drawable.tacones_m;

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

    public static void makToast(Activity ctx,String mensaje){

        Toast.makeText(ctx, mensaje, Toast.LENGTH_SHORT).show();

    }

    public static ArrayList<TipoSeccion> getSubTipos(String id){
        ArrayList<TipoSeccion> tipos = new ArrayList<>();

        switch (id){

            case ConstantesSeccion.Ropa_ID_Camisa:

                tipos.add(new TipoSeccion("Chemise", ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_chemise_h, false));
                tipos.add(new TipoSeccion("Blusa", ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_tirantes_m, false));
                tipos.add(new TipoSeccion("de Vestir", ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_vestir_h, false));
                tipos.add(new TipoSeccion("de Vestir", ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_vestir_m, false));
                tipos.add(new TipoSeccion("Deportiva", ConstantesSeccion.Ropa_ID_Ropa_ID_Camisa_SubTipo_deportiva_h, false));

                break;

            case ConstantesSeccion.Ropa_ID_Chaqueta:

                tipos.add(new TipoSeccion("Sudadera", ConstantesSeccion.Ropa_ID_Ropa_ID_Sueter_SubTipo_sueter_m, false));
                tipos.add(new TipoSeccion("Sudadera", ConstantesSeccion.Ropa_ID_Ropa_ID_Sueter_SubTipo_sueter_h, false));
                tipos.add(new TipoSeccion("con Capucha", ConstantesSeccion.Ropa_ID_Ropa_ID_Sueter_SubTipo_chaqueta_m, false));

                break;

            case ConstantesSeccion.Ropa_ID_Falda:

                tipos.add(new TipoSeccion("Corta", ConstantesSeccion.Ropa_ID_Ropa_ID_Falda_SubTipo_corta_m, false));
                tipos.add(new TipoSeccion("Larga", ConstantesSeccion.Ropa_ID_Ropa_ID_Falda_SubTipo_larga_m, false));

                break;

            case ConstantesSeccion.Ropa_ID_Media:

                tipos.add(new TipoSeccion("Largas", ConstantesSeccion.Ropa_ID_Ropa_ID_Medias_SubTipo_m, false));
                tipos.add(new TipoSeccion("Largas", ConstantesSeccion.Ropa_ID_Ropa_ID_Medias_SubTipo_h, false));

                break;

            case ConstantesSeccion.Ropa_ID_Pantalon:

                tipos.add(new TipoSeccion("Jean", ConstantesSeccion.Ropa_ID_Ropa_ID_Pantalon_SubTipo_jean_m, false));
                tipos.add(new TipoSeccion("Jean", ConstantesSeccion.Ropa_ID_Ropa_ID_Pantalon_SubTipo_jean_h, false));
                tipos.add(new TipoSeccion("Short", ConstantesSeccion.Ropa_ID_Ropa_ID_Pantalon_SubTipo_short_m, false));
                tipos.add(new TipoSeccion("Short", ConstantesSeccion.Ropa_ID_Ropa_ID_Pantalon_SubTipo_short_h, false));

                break;

            case ConstantesSeccion.Ropa_ID_Pijama:

                tipos.add(new TipoSeccion("Conjunto", ConstantesSeccion.Ropa_ID_Ropa_ID_Pijama_SubTipo_h, false));
                tipos.add(new TipoSeccion("Conjunto", ConstantesSeccion.Ropa_ID_Ropa_ID_Pijama_SubTipo_m, false));

                break;

            case ConstantesSeccion.Ropa_ID_R_Interior:

                tipos.add(new TipoSeccion("Boxer", ConstantesSeccion.Ropa_ID_Ropa_ID_R_Interior_SubTipo_h, false));
                tipos.add(new TipoSeccion("Panties", ConstantesSeccion.Ropa_ID_Ropa_ID_R_Interior_SubTipo_m, false));
                tipos.add(new TipoSeccion("Sosten", ConstantesSeccion.Ropa_ID_Ropa_ID_R_Interior_SubTipo_Sosten_m, false));

                break;

            case ConstantesSeccion.Ropa_ID_Vestido:

                tipos.add(new TipoSeccion("Corto", ConstantesSeccion.Ropa_ID_Ropa_ID_Vestido_SubTipo_corto_m, false));
                tipos.add(new TipoSeccion("Largo", ConstantesSeccion.Ropa_ID_Ropa_ID_Vestido_SubTipo_largo_m, false));

                break;

            case ConstantesSeccion.Ropa_ID_Zapatos:

                tipos.add(new TipoSeccion("Deportivos", ConstantesSeccion.Ropa_ID_Ropa_ID_Zapatos_SubTipo_deportivo_m, false));
                tipos.add(new TipoSeccion("Deportivos", ConstantesSeccion.Ropa_ID_Ropa_ID_Zapatos_SubTipo_deportivo_h, false));
                tipos.add(new TipoSeccion("Vestir", ConstantesSeccion.Ropa_ID_Ropa_ID_Zapatos_SubTipo_vestir_h, false));
                tipos.add(new TipoSeccion("Tacones", ConstantesSeccion.Ropa_ID_Ropa_ID_Zapatos_SubTipo_vestir_m, false));

                break;

            default:

                tipos.add(new TipoSeccion("Nada para mostrar", ConstantesSeccion.Ropa_ID_Camisa, false));

                break;

        }



        return tipos;
    }

    public static int generarID(){
        int matricula = 0;

        for (int i = 0; i < 16; i++) {
            matricula=(int) (Math.random()*9999+1);
            System.out.print(matricula+"  ");
        }

        return matricula;
    }

}
