package com.example.srn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<IsotoposVo> listaIsotopos;

    public AdapterDatos(ArrayList<IsotoposVo> listaIsotopos) {
        this.listaIsotopos = listaIsotopos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {

        holder.bselblan.setText(listaIsotopos.get(position).getNombre());
        holder.simblan.setText(listaIsotopos.get(position).getSimbolo());
        holder.ablan.setText(listaIsotopos.get(position).getA());
        holder.zblan.setText(listaIsotopos.get(position).getZ());
    }

    @Override
    public int getItemCount() {

        return listaIsotopos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder{

        TextView simblan,zblan,ablan;
        Button bselblan;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            simblan = (TextView) itemView.findViewById(R.id.simblan);
            zblan = (TextView) itemView.findViewById(R.id.zblan);
            ablan = (TextView) itemView.findViewById(R.id.ablan);
            bselblan = (Button) itemView.findViewById(R.id.bselblan);
        }
    }
}
