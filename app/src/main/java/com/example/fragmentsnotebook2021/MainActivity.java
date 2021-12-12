package com.example.fragmentsnotebook2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
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
        FragmentManager fm = getSupportFragmentManager();

        // Получаем ссылку на второй фрагмент по ID
        Fragment2 fragment2 = (Fragment2) fm.findFragmentById(R.id.fragment2_container);

        //  18 если фрагмента не существует или он невидим, запускаем вторую активити
        if (fragment2 == null || !fragment2.isVisible()) { //фрагмент видим в горизонтальной активити-там работает по старому.
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("buttonIndex", buttonIndex);
            startActivity(intent);
        } else {
            // Выводим нужную информацию
            fragment2.setDescription(buttonIndex);
        }
    }  /* 14 Активити получает доступ к своим фрагментам через специальный менеджер фрагментов FragmentManager*/
}