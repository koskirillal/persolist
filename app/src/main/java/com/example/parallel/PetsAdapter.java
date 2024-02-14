package com.example.parallel;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parallel.databinding.PersonlayoutBinding;
import com.example.parallel.databinding.PetslayoutBinding;

import java.util.List;

public class PetsAdapter extends  RecyclerView.Adapter<PetsViewHolder>{
    private List<Pet> petList;
    /*public PersonAdapter(List<Person2> personList){
        this.personList=personList;
    }*/
    public PetsAdapter(List<Pet> petList){
        this.petList=petList;
    }
    @NonNull
    @Override
    public PetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PetslayoutBinding binding = PetslayoutBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new PetsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PetsViewHolder holder, int position) {
        holder.bind(petList.get(position));

    }

    @Override
    public int getItemCount() {
        return petList.size();
    }
}
