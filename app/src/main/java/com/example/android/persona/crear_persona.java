package com.example.android.persona;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class crear_persona extends AppCompatActivity {
   Resources resources;
    EditText nombre ;
    EditText apellido;
    EditText cedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_persona);
        resources = this.getResources();
        cedula = (EditText) findViewById(R.id.txtcedula);
        nombre = (EditText) findViewById(R.id.txtnombre);
        apellido = (EditText) findViewById(R.id.txtapellido);
    }

    public void Guardar(View v){
        String ced,nom,apel;
        ced = cedula.getText().toString().trim();
        nom = nombre.getText().toString().trim();
        apel = apellido.getText().toString().trim();

        Persona p = new Persona(nom,apel,ced);

        p.Guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();
limpiar();
    }
    public void Limpiar(View v){
       limpiar();
    }
    private  void limpiar(){
        cedula.setText("");
        apellido.setText("");
        nombre.setText("");
        nombre.requestFocus();
    }
}
