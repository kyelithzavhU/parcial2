package com.example.operaciones_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pantalla_principal extends AppCompatActivity {

    Button botonopcion;
    EditText usuariou;
    EditText passwordu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);
        usuariou=findViewById(R.id.campo_u);
        passwordu=findViewById(R.id.campo_pass);
        botonopcion=findViewById(R.id.boton_op);
        botonopcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cambiarpantalla();
            }
        });
    }
    public void cambiarpantalla() {
        String usuario_u = String.valueOf(Integer.parseInt(usuariou.getText().toString()));
        String password_u = String.valueOf(Integer.parseInt(passwordu.getText().toString()));
        if ((usuario_u == "Usuario") && (password_u == "Password")) {
            Intent pant_ubi = new Intent(this, Ubicacion_u.class);
            startActivity(pant_ubi);
        }else{
            Intent pant = new Intent(this, pantalla_principal.class);
            startActivity(pant);
        }
    }
    }