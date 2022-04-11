package com.example.huperpassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.huperpassignment.adapters.PersonDetailAdapter;
import com.example.huperpassignment.model.PersonDetails;
import com.example.huperpassignment.viewmodel.PersonDetailViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<PersonDetails> arrayList = new ArrayList<>();
    private PersonDetailAdapter personDetailAdapter;
    private RecyclerView recyclerView;
    private PersonDetailViewModel personDetailViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        personDetailViewModel = ViewModelProviders.of(this).get(PersonDetailViewModel.class);
        personDetailViewModel.init(this);
        personDetailViewModel.getPersonDetails().observe(this, new Observer<ArrayList<PersonDetails>>() {
            @Override
            public void onChanged(ArrayList<PersonDetails> personDetails) {
                personDetailAdapter.notifyDataSetChanged();
            }
        });

        initRecyclerView();


    }

    private void initRecyclerView() {
        personDetailAdapter = new PersonDetailAdapter(this, personDetailViewModel.getPersonDetails().getValue());
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(personDetailAdapter);
    }
}