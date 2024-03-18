package com.example.contactapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    Context context;
    ArrayList<Container> arrItems;
    RecycleAdapter(Context context,ArrayList<Container> arr)
    {
        this.context=context;
        this.arrItems=arr;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.contact_card,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(arrItems.get(position).img);
        holder.name.setText(arrItems.get(position).name);
        holder.number.setText(arrItems.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,number;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            number=itemView.findViewById(R.id.number);
            img=itemView.findViewById(R.id.imgContact);
        }
    }
}
