package com.company.teffcode.database_creation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 22/04/17.
 */

public class DB_Students extends SQLiteOpenHelper {


    // CONSTRUCTOR
    public DB_Students(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // MÉTODO onCREATE
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    // MÉTODO onUPGRADE
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
