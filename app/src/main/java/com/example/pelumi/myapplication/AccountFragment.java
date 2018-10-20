package com.example.pelumi.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pelumi.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class AccountFragment extends Fragment{
    private ListView lv;
    private static final String TAG = "AccountFragment";

    public AccountFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_account, container, false);
        lv = (ListView) rootView.findViewById(R.id.list);
        List<String> array_list = new ArrayList<>();
        array_list.add("foo");
        array_list.add("bar");
        array_list.add("bar");
        array_list.add("bar");
        array_list.add("bar");
        array_list.add("bar");
        array_list.add("bar");
        array_list.add("bar");
        array_list.add("bar");
        array_list.add("bar");
        array_list.add("bar");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_1,
                array_list );

        Log.e(TAG, "onCreateView: size of list = " + array_list.size() );
        lv.setAdapter(arrayAdapter);
        return rootView;
    }

}