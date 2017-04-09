package com.dce.puja.myintent;
import android.app.Activity;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
        import android.provider.ContactsContract;
        import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import android.widget.EditText;

public class implicitintentactivity extends AppCompatActivity {
    Button read;
    EditText phone;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        read=(Button)findViewById(R.id.read);
        read.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent read1=new Intent();
                read1.setAction(android.content.Intent.ACTION_VIEW);
                read1.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(read1);
            }
        });



            }



}