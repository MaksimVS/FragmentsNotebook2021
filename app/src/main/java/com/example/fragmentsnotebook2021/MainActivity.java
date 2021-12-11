package com.example.fragmentsnotebook2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity /* 9 */ implements Fragment1.OnSelectedButtonListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override /* 9 */
    public void onButtonSelected(int buttonIndex) {

        /*  13 получаем от первого фрагмента индекс нажатой кнопки и передаем его второму фрагменту*/
        // подключаем FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Получаем ссылку на второй фрагмент по ID
        Fragment2 fragment2 = (Fragment2) fragmentManager.findFragmentById(R.id.fragment2);

        // Выводим нужную информацию
        if (fragment2 != null)
            fragment2.setDescription(buttonIndex);
    }  /* 14 Активити получает доступ к своим фрагментам через специальный менеджер фрагментов FragmentManager*/
}