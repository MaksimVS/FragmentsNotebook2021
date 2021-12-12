package com.example.fragmentsnotebook2021;

/*  16 создаем вторую активити для отдельного вывода fragment2*/
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

            /*  17 Получим индекс из первой активити */
            Intent intent = getIntent();
            int buttonIndex = intent.getIntExtra("buttonIndex", -1);
            if (buttonIndex != -1) {
                FragmentManager fm = getSupportFragmentManager();
                Fragment2 fragment2 = (Fragment2) fm
                        .findFragmentById(R.id.fragment2_container);
                fragment2.setDescription(buttonIndex);
            }
    }
}
