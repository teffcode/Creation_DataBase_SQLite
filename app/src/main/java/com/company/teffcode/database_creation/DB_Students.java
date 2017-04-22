package com.company.teffcode.database_creation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 22/04/17.
 */

public class DB_Students extends SQLiteOpenHelper {

    String sqlCreate = "CREATE TABLE Students (code INTEGER, name TEXT)";
    String sqlCreate2 = "CREATE TABLE Students (code INTEGER, name TEXT, address TEXT )";

    /*

     CONSTRUCTOR: tiene 4 parámetros

     1. Context: Contexto de nuestra app - referencia de activity
     2. Name: De la base de datos
     3. Objeto que no se usa
     4. Versión de la BD que posteriormente se va actualizando

    */

    public DB_Students(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /*

    MÉTODO onCREATE

    contruye los datos por primera vez en la BD

    */

    @Override
    public void onCreate(SQLiteDatabase db) {

        // si no existe la base de datos, la crea y la ejecuta los siguientes comandos
        db.execSQL(sqlCreate);

    }

    // MÉTODO onUPGRADE


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // se elimina la versión anterior de la tabla
        db.execSQL("DROP TABLE IF EXIST Students");

        // Se crea la nueva versión de la tabla
        db.execSQL(sqlCreate2);
    }
}
