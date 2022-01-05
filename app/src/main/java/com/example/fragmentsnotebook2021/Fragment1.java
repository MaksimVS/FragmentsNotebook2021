package com.example.fragmentsnotebook2021;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class Fragment1 extends Fragment implements View.OnClickListener {

    static final String ARG_INDEX_BUTTON = "indexButton";

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        Button button1 = (Button) view.findViewById(R.id.button1);
        Button button2 = (Button) view.findViewById(R.id.button2);
        Button button3 = (Button) view.findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int buttonIndex = translateIdToIndex(view.getId());

        OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
        assert listener != null;
        listener.onButtonSelected(buttonIndex);
    }

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

    public interface OnSelectedButtonListener {
        void onButtonSelected(int buttonIndex);
    }

//    public static Fragment1 newInstance(int index) {
//        Fragment1 F1 = new Fragment1();
//        Bundle args = new Bundle();
//        args.putInt(ARG_INDEX_BUTTON, index);
//        F1.setArguments(args);
//        return F1;
//    }
}
