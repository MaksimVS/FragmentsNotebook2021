package com.example.fragmentsnotebook2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.OnSelectedButtonListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onButtonSelected(int buttonIndex) {

        FragmentManager fm = getSupportFragmentManager();

        Fragment2 fragment2 = (Fragment2) fm.findFragmentById(R.id.fragment2_container);

        if (fragment2 == null || !fragment2.isVisible()) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("buttonIndex", buttonIndex);
            startActivity(intent);
        } else {
            fragment2.setDescription(buttonIndex);
        }
    }
}