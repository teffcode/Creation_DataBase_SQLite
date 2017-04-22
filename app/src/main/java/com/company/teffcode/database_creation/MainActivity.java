package com.company.teffcode.database_creation;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // INSTANCIAR. Abrimos la base de datos "DB_Students" en modo escritura

        DB_Students students = new DB_Students(this, "DB_Students", null, 1);
        SQLiteDatabase db = students.getWritableDatabase();

        // Compruebo que la DB se abre correctamente

        if(db != null){

            // crear 10 datos de prueba
            for (int i=1; i<=10; i++){

                // Generar valores
                int cod = i;
                String nameStudent = "Student" + i; // Student1, Student2... bla bla

                // Datos de prueba
                db.execSQL("INSERT INTO Students (code, name)" +
                            "VALUES (" + cod + ", " +
                            nameStudent + ")" );
            }

            // Cerrar DB
            db.close();
        }


    }
}
