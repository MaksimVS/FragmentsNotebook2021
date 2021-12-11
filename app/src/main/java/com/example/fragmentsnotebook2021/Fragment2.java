package com.example.fragmentsnotebook2021;

/* 2  Создаем класс для второго фрагмента */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment{

    private TextView InfoTextView;
    private String PositionDescript;
    private String[] DescriptionArray;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);

        InfoTextView = (TextView) rootView.findViewById(R.id.textView); /* 10 объявим */
        PositionDescript = getResources().getString(R.string.app_name);

        //  11 загружаем массив из ресурсов (создаем его там, это может быть текст или картинки)
        DescriptionArray = getResources().getStringArray(R.array.notes);

        return rootView;
    }

    public void setDescription(int buttonIndex) {
        String Description = DescriptionArray[buttonIndex];
        InfoTextView.setText(Description);

        /* 12 меняем содержимое фрагмента(с помощью метода в пункте 9-13), в зависимости от индекса (пункт 7) нажатой кнопки */
        switch (buttonIndex) {
            case 1:
                Toast.makeText(getActivity(), "Вы нажали на кнопку 1", /*здесь могли быть картинки или текст из ресурсов*/
                        Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getActivity(), "Вы нажали на кнопку 2",
                        Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getActivity(), "Вы нажали на кнопку 3", /* заглушка в виде всплывающего сообщения */
                        Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}

