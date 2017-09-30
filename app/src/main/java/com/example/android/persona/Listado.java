package com.example.android.persona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {
private TableLayout tabla;
    private ArrayList<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        tabla = (TableLayout)findViewById(R.id.tbllistado);
        personas = Datos.ObtenerPersonas();

        for (int i = 0; i < personas.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView no = new TextView(this);
            TextView nombre = new TextView(this);
            TextView apellido = new TextView(this);
            TextView cedula = new TextView(this);

            no.setText((i + 1)+"");
            nombre.setText(personas.get(i).getNombre());
            apellido.setText(personas.get(i).getApellido());
            cedula.setText(personas.get(i).getCedula());
            fila.addView(no);
            fila.addView(nombre);
            fila.addView(apellido);
            fila.addView(cedula);
            tabla.addView(fila);
        }
    }
}
