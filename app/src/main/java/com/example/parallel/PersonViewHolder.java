package com.example.parallel;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parallel.databinding.PersonlayoutBinding;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private PersonlayoutBinding binding;
    public PersonViewHolder(PersonlayoutBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Person item){
        binding.fullname.setText(item.getFullname());
        binding.id.setText(String.valueOf(item.getId()));
        binding.petsname.setText(item.getPetsname());
        binding.type.setText(item.getPettype());
        binding.telephone.setText(item.getTelephone());

    }


}
