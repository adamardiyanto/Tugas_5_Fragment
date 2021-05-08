package com.example.tugas5_fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class CallFragment extends Fragment {

    private Button btn_call;
    private EditText et_number;
    private static final int PHONE_REQUEST_CODE = 986;


    public CallFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_call,container,false);
        btn_call = view.findViewById(R.id.btn_call);
        et_number = view.findViewById(R.id.et_number);

        btn_call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nomor = et_number.getText().toString();

                if (!TextUtils.isEmpty(nomor)){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel:" + nomor));
                    startActivity(call);
                } else {
                    Toast.makeText(getContext() , "Masukan Nomor Telepon", Toast.LENGTH_SHORT).show();
                }
            }
        });


        return view;
    }
}