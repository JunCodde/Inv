package com.juncodde.inv.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.juncodde.inv.Modelo.Seccion;
import com.juncodde.inv.R;

import java.util.ArrayList;

public class AdapterInvSeccion extends  RecyclerView.Adapter<AdapterInvSeccion.AdapterInvSeccionHolder>{

    private static final String TAG = "AdapterInvSeccion";
    ArrayList<Seccion> seccions = new ArrayList<>();
    Activity activity;

    public AdapterInvSeccion(ArrayList<Seccion> seccions, Activity activity) {
        this.seccions = seccions;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AdapterInvSeccionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_inventario_seccion, parent, false);

        return new AdapterInvSeccionHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterInvSeccionHolder holder, int position) {

        final Seccion s = seccions.get(position);

        holder.tv_seccion_precio.setText("$ " + s.getPrecio());
        holder.tv_seccion_nombre.setText(s.getNombre());

    }

    @Override
    public int getItemCount() {
        return seccions.size();
    }

    public static class AdapterInvSeccionHolder extends RecyclerView.ViewHolder{

        private ImageView img_seccion;
        private TextView tv_seccion_nombre, tv_seccion_precio;

        public AdapterInvSeccionHolder(View itemView) {
            super(itemView);

            img_seccion = (ImageView) itemView.findViewById(R.id.img_seccion);

            tv_seccion_nombre = (TextView) itemView.findViewById(R.id.tv_seccion_nombre);
            tv_seccion_precio = (TextView) itemView.findViewById(R.id.tv_seccion__precio);
        }
    }
}
