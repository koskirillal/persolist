package com.example.parallel;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parallel.databinding.PetslayoutBinding;

public class PetsViewHolder extends RecyclerView.ViewHolder{
    private PetslayoutBinding binding;
    public PetsViewHolder(PetslayoutBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind(Pet item){
        binding.name.setText(item.getName() + "\n");
        binding.id.setText(String.valueOf(item.getId()) + " ");
        binding.type.setText(item.getType() + " ");

    }

}
