package com.juncodde.inv.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.juncodde.inv.AddSeccionActivity;
import com.juncodde.inv.Modelo.Talla;
import com.juncodde.inv.R;

import java.util.ArrayList;

public class AdapterSeccionTalla extends RecyclerView.Adapter<AdapterSeccionTalla.AdapterSeccionTallaHolder>{

    ArrayList<Talla> tallas;
    Activity activity;

    public AdapterSeccionTalla(ArrayList<Talla> tallas, Activity activity) {
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
    public void onBindViewHolder(@NonNull final AdapterSeccionTallaHolder holder, int position) {

        final Talla talla = tallas.get(position);

        holder.tv_talla.setText(talla.getTalla());

        holder.cv_talla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(activity instanceof AddSeccionActivity){
                    ((AddSeccionActivity)activity).idTallaSelected = talla.getTalla();
                }

                if(talla.isEneabled()){

                    CheckEn();
                    talla.setEneabled(false);

                }

            }
        });

        if(talla.isEneabled()){

            holder.cv_talla.setCardBackgroundColor(activity.getResources().getColor(R.color.cardview_light_background));

        }else{
            holder.cv_talla.setCardBackgroundColor(activity.getResources().getColor(R.color.cardview_shadow_start_color));

        }

    }

    private void CheckEn(){

        for (int i = 0; i < tallas.size(); i++) {

            Talla talla = tallas.get(i);

            talla.setEneabled(true);

        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return tallas.size();
    }

    public static class AdapterSeccionTallaHolder extends RecyclerView.ViewHolder{

        private TextView tv_talla;
        private CardView cv_talla;

        public AdapterSeccionTallaHolder(View itemView) {
            super(itemView);

            tv_talla = (TextView) itemView.findViewById(R.id.tv_talla);
            cv_talla = (CardView) itemView.findViewById(R.id.cv_talla);
        }
    }
}
