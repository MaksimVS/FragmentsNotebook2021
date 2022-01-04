package com.example.fragmentsnotebook2021;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.EventLogTags;
import android.view.ContextMenu;
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
    static final String ARG_INDEX_DESCRIPTION = "indexDescription";

    TextView InfoTextView;
    String[] DescriptionArray;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int buttonIndex = arguments.getInt(ARG_INDEX_DESCRIPTION);
            InfoTextView = (TextView) view.findViewById(R.id.textViewDescription);
            DescriptionArray = getResources().getStringArray(R.array.notes);
            setDescription(buttonIndex);
        }
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

    public static Fragment2 newInstance(int buttonIndex) {
        Fragment2 F2 = new Fragment2();
        Bundle args = new Bundle();
        args.putInt(ARG_INDEX_DESCRIPTION, buttonIndex);
        F2.setArguments(args);
        return F2;
    }

}

