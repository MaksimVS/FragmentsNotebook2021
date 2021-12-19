package com.example.fragmentsnotebook2021;

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

public class Fragment2 extends Fragment {

    private TextView InfoTextView;
    private String[] DescriptionArray;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);

        InfoTextView = (TextView) rootView.findViewById(R.id.textViewDescription);

        DescriptionArray = getResources().getStringArray(R.array.notes);
        return rootView;
    }

    public void setDescription(int buttonIndex) {
        String Description = DescriptionArray[buttonIndex];
        InfoTextView.setText(Description);

        switch (buttonIndex) {
            case 1:
                Toast.makeText(getActivity(), "Вы нажали на кнопку 1",
                        Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getActivity(), "Вы нажали на кнопку 2",
                        Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getActivity(), "Вы нажали на кнопку 3",
                        Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}

