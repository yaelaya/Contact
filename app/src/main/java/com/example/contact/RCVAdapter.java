package com.example.contact;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import com.example.contact.databinding.ItemContactBinding;


public class RCVAdapter extends RecyclerView.Adapter<RCVAdapter.MyViewHolder> {

    private final ArrayList<ContactModel> contactList;

    public RCVAdapter(ArrayList<ContactModel> contactList) {
        this.contactList = contactList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ItemContactBinding binding;

        public MyViewHolder(ItemContactBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemContactBinding binding = ItemContactBinding.inflate(inflater, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ContactModel item = contactList.get(position);
        holder.binding.nameTV.setText(item.getDisplayName());
        holder.binding.numberTV.setText(item.getNumber());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
