package com.test;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;


public class MyFragment extends Fragment implements View.OnClickListener {
    private static final String TAG = MyFragment.class.getSimpleName();
    private EditText text;

    public MyFragment() {
        // Required empty public constructor
    }


    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        text = view.findViewById(R.id.editText);
        Button fragment_my = view.findViewById(R.id.myButton);
        fragment_my.setOnClickListener(this);
        return view;
    }

    private void handleMyButton(View view) {
        Log.i(TAG, "Sending msg");
        Log.i(TAG, String.format("EditText value: %s", text.getText().toString()));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.myButton:
                handleMyButton(v);
                break;
            default:
                break;
        }
    }
}