package com.example.huperpassignment.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.huperpassignment.model.PersonDetails;
import com.example.huperpassignment.repositories.Repo;

import java.util.ArrayList;

public class PersonDetailViewModel extends ViewModel {
    MutableLiveData<ArrayList<PersonDetails>> liveData;
    private Repo repo;
    public void init(Context context) {
        if (liveData != null) {
            return;
        }
        repo = Repo.getInstance();
        liveData = repo.getPersonDetails();

    }

    public LiveData<ArrayList<PersonDetails>> getPersonDetails() {
        return liveData;
    }
}
