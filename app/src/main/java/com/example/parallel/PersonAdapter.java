package com.example.parallel;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parallel.databinding.PersonlayoutBinding;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private List<Person2> personList;
    public PersonAdapter(List<Person2> personList){
        this.personList=personList;
    }


    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PersonlayoutBinding binding = PersonlayoutBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new PersonViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.bind(personList.get(position));

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
