package com.example.huperpassignment.repositories;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.example.huperpassignment.model.PersonDetails;

import java.util.ArrayList;

public class Repo {
    private static  Repo instance;
    private ArrayList<PersonDetails> arrayList = new ArrayList<>();
    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    public static Repo getInstance(Context context) {
        if (instance == null) {
            instance = new Repo();
        }
        return  instance;
    }

    public MutableLiveData<ArrayList<PersonDetails>> getPersonDetails() {
        loadPersonDetails();
        MutableLiveData<ArrayList<PersonDetails>> data = new MutableLiveData<>();
        data.setValue(arrayList);
        return data;
    }

    //get data from database
    private void loadPersonDetails() {
        db.collection("Phone").get().add
    }

}
