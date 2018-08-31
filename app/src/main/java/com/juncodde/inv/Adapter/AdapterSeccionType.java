package com.juncodde.inv.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.juncodde.inv.Modelo.TipoSeccion;
import com.juncodde.inv.R;
import com.juncodde.inv.Utils.Utilidades;

import java.util.ArrayList;

public class AdapterSeccionType extends RecyclerView.Adapter<AdapterSeccionType.AdapterSeccionTypeHolder> {

    private ArrayList<TipoSeccion> tipos;
    private Activity activity;

    public AdapterSeccionType(ArrayList<TipoSeccion> tipos, Activity activity) {
        this.tipos = tipos;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AdapterSeccionTypeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_seccion_tipos, parent, false);

        return new AdapterSeccionTypeHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSeccionTypeHolder holder, int position) {

        TipoSeccion tipo = tipos.get(position);

        holder.tv_seccionTipo.setText(tipo.getNombre());

        holder.img_seccionTipo.setImageDrawable(activity.getResources().getDrawable(Utilidades.getImagen(tipo.getId())));

    }

    @Override
    public int getItemCount() {
        return tipos.size();
    }

    public static class AdapterSeccionTypeHolder extends RecyclerView.ViewHolder{

        private ImageView img_seccionTipo;
        private TextView tv_seccionTipo;

        public AdapterSeccionTypeHolder(View itemView) {
            super(itemView);

            img_seccionTipo = (ImageView) itemView.findViewById(R.id.img_seccionTipo);
            tv_seccionTipo = (TextView) itemView.findViewById(R.id.tv_seccionTipo);
        }
    }
}
