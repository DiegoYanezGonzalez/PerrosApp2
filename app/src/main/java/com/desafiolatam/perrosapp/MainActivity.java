package com.desafiolatam.perrosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.desafiolatam.perrosapp.view.FragmentDetail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    instanceDetailFragment();

    }
    private void instanceDetailFragment(String name,String url){

        FragmentDetail detailFragment = FragmentDetail.newInstance().newInstance(name,url);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameLayout,detailFragment,"DetailFragment")
                .addToBackStack("DetailFragment")
                .commit();
    }
}
