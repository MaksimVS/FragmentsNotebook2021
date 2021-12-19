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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1, container, false);

        Button button1 = (Button) rootView.findViewById(R.id.button1);
        Button button2 = (Button) rootView.findViewById(R.id.button2);
        Button button3 = (Button) rootView.findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        return rootView;
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
}
