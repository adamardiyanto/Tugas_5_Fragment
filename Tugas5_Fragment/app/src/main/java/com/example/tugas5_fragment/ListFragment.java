package com.example.tugas5_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ListFragment extends Fragment {

    private RecyclerView rvOlshop;
    private ArrayList<OlshopModel> listOlshop = new ArrayList<>();

    public ListFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);

        

        rvOlshop = view.findViewById(R.id.rv_list);
        rvOlshop.setHasFixedSize(true);
        listOlshop.addAll(OlshopData.getListData());

        showRecyclerList();
        return view;
    }

    private void showRecyclerList() {
        rvOlshop.setLayoutManager(new LinearLayoutManager(getContext()));
        OlshopAdapter olshopAdapter = new OlshopAdapter(getContext());
        olshopAdapter.setOlshopModels(listOlshop);
        rvOlshop.setAdapter(olshopAdapter);
    }
}