package com.juncodde.inv.BaseDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.juncodde.inv.Constantes.ConstantesDB;

public class BaseDatos extends SQLiteOpenHelper {

    private Context context;

    public BaseDatos(Context context) {
        super(context, ConstantesDB.DATABASE_NAME, null, ConstantesDB.DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String queryCrearTablaSeccion = "CREATE TABLE " + ConstantesDB.TABLA_SECCION + " (" +
                ConstantesDB.TABLA_SECCION_ID           + " TEXT, " +
                ConstantesDB.TABLA_SECCION_NOMBRE       + " TEXT, " +
                ConstantesDB.TABLA_SECCION_PRECIO       + " INTEGER, " +
                ConstantesDB.TABLA_SECCION_FOTO         + " INTEGER " +
                ") ";
        db.execSQL(queryCrearTablaSeccion);

        String queryCrearTablaPrenda = "CREATE TABLE " + ConstantesDB.TABLA_PRENDA + " (" +
                ConstantesDB.TABLA_PRENDA_ID           + " TEXT, " +
                ConstantesDB.TABLA_PRENDA_TIPO         + " TEXT, " +
                ConstantesDB.TABLA_PRENDA_SUBTIPO      + " TEXT, " +
                ConstantesDB.TABLA_PRENDA_GENERO       + " TEXT, " +
                ConstantesDB.TABLA_PRENDA_MARCA        + " TEXT, " +
                ConstantesDB.TABLA_PRENDA_TIME         + " TEXT, " +
                ConstantesDB.TABLA_PRENDA_PRECIO_VENTA + " INTEGER, " +
                ConstantesDB.TABLA_PRENDA_PRECIO_COMPRA+ " INTEGER, " +
                ConstantesDB.TABLA_PRENDA_CANT_INV     + " INTEGER, " +
                ConstantesDB.TABLA_PRENDA_TALLA        + " INTEGER " +
                ") ";
        db.execSQL(queryCrearTablaPrenda);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + ConstantesDB.TABLA_SECCION);
        db.execSQL("DROP TABLE IF EXISTS " + ConstantesDB.TABLA_PRENDA);
    }

    //Inicio de metodos de Acceso para la tabla de Secciones


    public void insertarSeccion(ContentValues cv){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesDB.TABLA_SECCION, null, cv);
        db.close();
    }

    //Fin de metodos de Acceso para la tabla de Secciones



    //Inicio de metodos de Acceso para la tabla de Prendas

    public void insertarPrenda(ContentValues cv){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesDB.TABLA_PRENDA, null, cv);
        db.close();
    }

    //Fin de metodos de Acceso para la tabla de Secciones


}
