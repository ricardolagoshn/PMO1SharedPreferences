package com.aplicacion.pm01preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityPreferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        LoadPreferences();
        SavePreferences();
    }

    private void SavePreferences()
    {
        SharedPreferences claves = getSharedPreferences("info", Context.MODE_PRIVATE);
        String nombre = "Ricardo Lagos";
        String username = "rlagos";
        String password = "HONDURASx2001";


        SharedPreferences.Editor editor = claves.edit();
        editor.putString("nombre", nombre);
        editor.putString("username", username);
        editor.putString("password", password);

        editor.commit();

        Toast.makeText(getApplicationContext(), nombre, Toast.LENGTH_LONG).show();
    }


    private void LoadPreferences()
    {
        SharedPreferences claves = getSharedPreferences("info", Context.MODE_PRIVATE);
        String nombre =  claves.getString("nombre", "Nombre no set");
        String username =claves.getString("username", "username no set");
        String password = claves.getString("password", "password no set");

        Toast.makeText(getApplicationContext(), nombre, Toast.LENGTH_LONG).show();
    }
}