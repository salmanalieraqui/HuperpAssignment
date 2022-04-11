package com.example.huperpassignment.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.huperpassignment.MainActivity;
import com.example.huperpassignment.R;
import com.example.huperpassignment.model.PersonDetails;

import java.util.ArrayList;

public class PersonDetailAdapter extends RecyclerView.Adapter<PersonDetailAdapter, RecyclerView.ViewHolder> {
    public PersonDetailAdapter(MainActivity mainActivity, ArrayList<PersonDetails> value) {
    }

    @NonNull
    @Override
    public PersonDetailAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new RecyclerView.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonDetailAdapter holder, int position) {
        holder.itemv
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class Viewholder extends RecyclerView.ViewHolder {
        TextView name, email, phone;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            email = itemView.findViewById(R.id.email);
            phone = itemView.findViewById(R.id.phone);
        }
    }
}
