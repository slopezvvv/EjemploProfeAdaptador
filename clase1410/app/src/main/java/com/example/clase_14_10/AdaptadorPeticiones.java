package com.example.clase_14_10;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorPeticiones extends RecyclerView.Adapter<AdaptadorPeticiones.ViewHolderPeticion> {

    private final Context context;
    private final ArrayList<Voluntario> listaVoluntarios;

    public AdaptadorPeticiones(Context context, ArrayList<Voluntario> listaVoluntarios) {
        this.context = context;
        this.listaVoluntarios = listaVoluntarios;
    }

    @NonNull
    @Override
    public ViewHolderPeticion onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.adapter_listar_peticiones, null);
        return new ViewHolderPeticion(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPeticion holder, int position) {
        Voluntario voluntario = listaVoluntarios.get(position);
        holder.tvRut.setText(String.valueOf(voluntario.getRut()));
        holder.tvEmail.setText(voluntario.getEmail());
        holder.tvNombre.setText(voluntario.getNombre());
    }

    @Override
    public int getItemCount() {

        return listaVoluntarios.size();
    }

    class ViewHolderPeticion extends RecyclerView.ViewHolder {
        protected ImageView imgPeticion;
        protected TextView tvRut;
        protected TextView tvEmail;
        protected TextView tvNombre;

        public ViewHolderPeticion(View itemView) {
            super(itemView);
            imgPeticion = itemView.findViewById(R.id.ivImagen);
            tvRut = itemView.findViewById(R.id.tvRut);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvNombre = itemView.findViewById(R.id.tvNombre);
        }
    }
}
