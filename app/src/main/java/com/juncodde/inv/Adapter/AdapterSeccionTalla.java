package com.juncodde.inv.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.juncodde.inv.R;

import java.util.ArrayList;

public class AdapterSeccionTalla extends RecyclerView.Adapter<AdapterSeccionTalla.AdapterSeccionTallaHolder>{

    ArrayList<String> tallas;
    Activity activity;

    public AdapterSeccionTalla(ArrayList<String> tallas, Activity activity) {
        this.tallas = tallas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AdapterSeccionTallaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_talla, parent, false);

        return new AdapterSeccionTallaHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSeccionTallaHolder holder, int position) {

        String act = tallas.get(position);

        holder.tv_talla.setText(act);

    }

    @Override
    public int getItemCount() {
        return tallas.size();
    }

    public static class AdapterSeccionTallaHolder extends RecyclerView.ViewHolder{

        private TextView tv_talla;

        public AdapterSeccionTallaHolder(View itemView) {
            super(itemView);

            tv_talla = (TextView) itemView.findViewById(R.id.tv_talla);
        }
    }
}
