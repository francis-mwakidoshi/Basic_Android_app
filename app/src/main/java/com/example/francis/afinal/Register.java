package com.example.francis.afinal;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Register extends AppCompatActivity {

    //Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        //login_btn = (Button)findViewById(R.id.button3);

        //implement Onclick event for Explicit Intent

        //login_btn.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {

                //Intent intent = new  Intent(getBaseContext(), Home.class);
               // startActivity(intent);

        Button showdialog = (Button)findViewById(R.id.button3);

        showdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Register.this);
                mBuilder.setMessage(R.string.registered);
                mBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()  {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new  Intent(getBaseContext(), Home.class);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = mBuilder.create();
                alertDialog.show();


            }
        });
    }


}
