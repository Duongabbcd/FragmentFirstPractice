package com.example.fragmentfirstpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    private FragmentManager manager;
    private Button bta,btb;
    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        bta = findViewById(R.id.bta);
        btb = findViewById(R.id.btb);
        manager = getSupportFragmentManager();
        bta.setOnClickListener(this);
        btb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == bta){
            FragmentTransaction transaction = manager.beginTransaction();
            fragment = new FragmentA();
            transaction.replace(R.id.frame,fragment);
            transaction.commit();
        }
        if(v == btb){
            FragmentTransaction transaction = manager.beginTransaction();
            fragment = new FragmentB();
            transaction.replace(R.id.frame,fragment);
            transaction.commit();
        }
    }
}