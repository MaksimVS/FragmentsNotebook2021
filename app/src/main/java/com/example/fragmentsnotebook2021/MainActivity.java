package com.example.fragmentsnotebook2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.OnSelectedButtonListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonSelected(int buttonIndex) {

        Fragment2 fragment2 = Fragment2.newInstance(buttonIndex);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
           getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment1_container, new Fragment1())
                    .replace(R.id.fragment2_container, fragment2)
                    .commit();
        } else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment1_container, fragment2)
                    .addToBackStack(null)
                    .commit();
        }
    }
}