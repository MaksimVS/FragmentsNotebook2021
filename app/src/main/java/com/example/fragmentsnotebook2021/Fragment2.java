package com.example.fragmentsnotebook2021;

/* 2  Создаем класс для второго фрагмента */

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment{

    private static final String ARG_FR1 = "ARG_FR1";

//    public static Fragment2 newInstance(Fragment1 fragment1){
//        Fragment2 fragment = new Fragment2();
//        Bundle args = new Bundle();
//        args.putParcelable(ARG_FR1,fragment1);
//        fragment.setArguments(args);
//        return fragment;
//    }

//    public Fragment2(){
//        super(R.layout.fragment2);
//    }

    private TextView InfoTextView;
    private String[] DescriptionArray;
    private LinearLayout fragment2Container;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);

        InfoTextView = (TextView) rootView.findViewById(R.id.textViewDescription); /* 10 объявим */

        //  11 загружаем массив из ресурсов (создаем его там, это может быть текст или картинки)
        DescriptionArray = getResources().getStringArray(R.array.notes);
        return rootView;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        Fragment1 fragment1 = requireArguments().getParcelable(ARG_FR1);
//
//        TextView textView = view.findViewById(R.id.textViewDescription);
//        textView.setText(R.string.app_name2);
//    }

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

//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//    }
}

