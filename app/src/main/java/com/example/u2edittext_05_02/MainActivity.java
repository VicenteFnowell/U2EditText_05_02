package com.example.u2edittext_05_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNombre,etApellido, etNombrecompleto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.etnombre);
        etApellido = (EditText)findViewById(R.id.etapellido);
        etNombrecompleto = (EditText)findViewById(R.id.etnombrecompleto);






    }//Fin ONCreate


    public void obtenerNombreCompleto (View view){

        //Recogemos el valor de los etnombre y apellidos
        String nombre = etNombre.getText().toString();
        String apellidos = etApellido.getText().toString();

        if(nombre.equals("")&& apellidos.equals("")){
            Toast.makeText(getApplicationContext(),"Debes rellenar nombres y apellidos",Toast.LENGTH_LONG).show();
        }else {
            etNombrecompleto.setText(nombre+" "+apellidos);
        }


    }




}
