package com.example.parallel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.parallel.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    private ActivityMainBinding binding;
    private List<Person2> personList;
    private List<Pet> petList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
        initpet();
        PetsAdapter petsAdapter=new PetsAdapter(petList);
        PersonAdapter adapter = new PersonAdapter(personList);

        binding.rvPets.setAdapter(petsAdapter);
        binding.rvPerson.setAdapter(adapter);

    }
    public void init(){
        personList = new ArrayList<>();
        personList.add(new Person2(01 , "name" ,"tel"));
        personList.add(new Person2(1 , "E1" , "t1"));
        personList.add(new Person2(2 , "E2" , "t2"));
        personList.add(new Person2(3 , "F3" , "t3"));
        personList.add(new Person2(4 , "F4" , "t4"));
        personList.add(new Person2(5 , "E5" , "t5"));
        personList.add(new Person2(6 , "F6" , "t6"));
        personList.add(new Person2(7 , "F7" , "t7"));
        personList.add(new Person2(8 , "E8" , "t8"));
        personList.add(new Person2(9 , "E9" , "t9"));
        personList.add(new Person2(0 , "E0" , "t0"));
    }
    public void initpet(){
        petList=new ArrayList<>();
        petList.add(new Pet(01 , "type" , "name"));
        petList.add(new Pet(1 , "si" , "a"));
        petList.add(new Pet(2 , "si" , "b"));
        petList.add(new Pet(3 , "si" , "c"));
        petList.add(new Pet(4 , "si" , "d"));
        petList.add(new Pet(5 , "si" , "e"));
        petList.add(new Pet(6 , "si" , "f"));
        petList.add(new Pet(6 , "si" , "g"));
        petList.add(new Pet(7 , "si" , "h"));
        petList.add(new Pet(8 , "si" , "k"));
        petList.add(new Pet(9 , "si" , "c"));
        petList.add(new Pet(7 , "si" , "c"));
    }

}