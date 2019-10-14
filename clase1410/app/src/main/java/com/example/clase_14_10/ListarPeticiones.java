package com.example.clase_14_10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class ListarPeticiones extends AppCompatActivity {
    private RecyclerView rvPeticiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_peticiones);

        rvPeticiones = findViewById(R.id.rvPeticiones);
        rvPeticiones.setLayoutManager(new LinearLayoutManager(this));
        rvPeticiones.setHasFixedSize(true);
        rvPeticiones.setItemViewCacheSize(20);
        rvPeticiones.setDrawingCacheEnabled(true);
        rvPeticiones.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        ArrayList<Voluntario> listaVoluntarios = new ArrayList<Voluntario>();
        Voluntario v1 = new Voluntario("12345678k","pepe@eppe.cl","Pepe");
        Voluntario v2 = new Voluntario("236548790","pepa@asd.cl","Pepa");
        Voluntario v3 = new Voluntario("196783459","kurt@asd.cl","Kurt");
        listaVoluntarios.add(v1);
        listaVoluntarios.add(v2);
        listaVoluntarios.add(v3);

        //Instancia adaptador
        AdaptadorPeticiones adaptadorPeticiones = new AdaptadorPeticiones(this, listaVoluntarios );
        rvPeticiones.setAdapter(adaptadorPeticiones);
    }
}
