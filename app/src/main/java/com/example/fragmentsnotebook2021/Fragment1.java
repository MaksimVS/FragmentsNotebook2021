package com.example.fragmentsnotebook2021;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/* 2  Создаем класс для первого фрагмента */
public class Fragment1 extends Fragment implements View.OnClickListener {

    /*  3  Подключаем разметку (из fragment1) к фрагменту (Fragment1) */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1, container, false);/* Получили обьект */

        Button button1 = (Button) rootView.findViewById(R.id.button1); /*  6 подключаем кнопки */
        Button button2 = (Button) rootView.findViewById(R.id.button2);
        Button button3 = (Button) rootView.findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        return rootView; /* вернули обьект */
    }

    @Override /* 5 обработаем нажатие кнопок */
    public void onClick(View view) {

        int buttonIndex = translateIdToIndex(view.getId()); /*  8 Временный код для получения индекса нажатой кнопки*/

        OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
        listener.onButtonSelected(buttonIndex); /*  15 получаем доступ к слушателю активности*/


//        Toast.makeText(getActivity(), "Вы нажали на кнопку", /* 5 заглушка в виде всплывающего сообщения */
//                Toast.LENGTH_SHORT).show();
    }

    /*  7 создадим отдельный метод, который на основании идентификатора кнопки создаст нужный индекс */
    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.button1:
                index = 1;
                break;
            case R.id.button2:
                index = 2;
                break;
            case R.id.button3:
                index = 3;
                break;
        }
        return index;
    }

    /*  9 Создаем интерфейс */
    public interface OnSelectedButtonListener {
        void onButtonSelected(int buttonIndex); /* интерфейс дает имя методу */
    }
}
