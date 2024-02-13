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
    private List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
        PersonAdapter adapter = new PersonAdapter(personList);
        binding.recycle.setAdapter(adapter);

    }
    public void init(){
        personList = new ArrayList<>();
        personList.add(new Person(12 , "Imya" , "Telephone" , "Type" , "Cl"));
        personList.add(new Person(53 , "Pave" , "13" , "1ty" , "pi"));
        personList.add(new Person(34 , "Gen" , "14" , "2ty" , "mo"));
        personList.add(new Person(15 , "Ole" , "15" , "3ty" , "fas"));
        personList.add(new Person(16 , "Iva" , "16" , "4ty" , "she"));
        personList.add(new Person(49 , "Kir" , "17" , "5ty" , "ipo"));
        personList.add(new Person(45, "Pet" , "18" , "6ty" , "so"));
        personList.add(new Person(43, "Vas", "19" , "7ty" , "ri"));
        personList.add(new Person(44, "Lev" , "20" , "8ty" , "sl"));
        personList.add(new Person(47, "Kol" , "31" , "9ty" , "dob"));
        personList.add(new Person(50 , "Eg" , "32" , "10ty" , "mal"));
    }
    /*personList.add(new Person(123 , "Imya" , "Telephone" , "Type" , "Clichka"));
        personList.add(new Person(53 , "Pavel" , "123" , "dolmotinets" , "pitno"));
        personList.add(new Person(34 , "Genadi" , "124" , "zhihuahua" , "monster"));
        personList.add(new Person(15 , "Oleg" , "125" , "ovcharka" , "fashist"));
        personList.add(new Person(16 , "Ivan" , "126" , "delterer" , "sherst"));
        personList.add(new Person(49 , "Kirill" , "127" , "sibu" , "iponec"));
        personList.add(new Person(45, "Petr" , "128" , "taksa" , "sosiska"));
        personList.add(new Person(43, "Vasili" , "129" , "korgi" , "rigii"));
        personList.add(new Person(44, "Lev" , "130" , "pudel" , "sluni"));
        personList.add(new Person(47, "Kolya" , "131" , "buldog" , "dobryk"));
        personList.add(new Person(50 , "Egor" , "132" , "alabay" , "malish"));*/
}