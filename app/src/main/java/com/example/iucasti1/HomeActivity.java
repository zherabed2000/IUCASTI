package com.example.iucasti1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private  static final String TAG = "NewNoteDialog";
    private EditText mTitle,mContent;
    private TextView mCreate,mCancle;
    Button AddNewTask;


    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int style = DialogFragment.STYLE_NORMAL;
        int theme= android.R.style.Theme_Holo_Light_Dialog;
       // setStyle(style,theme);
        setContentView(R.layout.activity_home);
        AddNewTask = findViewById(R.id.addtask_btn);


    }
    @Nullable
    @Override
 public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        boolean attachRoot;
        View view = inflater.inflate(R.layout.dialog_new_note, container,attachRoot false);
        mTitle=view.findViewById((R.id.note_title);
        mContent=view.findViewById(R.id.note_content);
        mCreate=view.findViewById(R.id.create);
        mCancle=view.findViewById(R.id.cancle);
        mCancle.setOnClickListener(this);
        mCreate.setOnClickListener(this);

        //getDialog().setTitle("New Note");

        return view;


    }


    @Override
    public void  onClick(View view){
        switch (view.getId()){
            case R.id.create:{
                String title=mTitle.getText().toString();
                String content=mContent.getText().toString();
                if (!title.equals("")){
                    getDialoge().dismiss();
                }
                else{
                   // Toast.makeText(getActivity(),text"Enter a title",Toast.LENGTH_SHORT).show();
                    Toast.makeText(this, "Enter a title", Toast.LENGTH_LONG).show();
                }
                break;

            }
            case R.id.cancel:{
                getDialog().dismiss();
                break;
            }
        }
    }


}