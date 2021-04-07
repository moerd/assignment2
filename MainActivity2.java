package edu.cs.birzeit.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String getName = intent.getStringExtra("Name");
        String getGender = intent.getStringExtra("Gender");
        String getEmail = intent.getStringExtra("Email");
        String getPassID = intent.getStringExtra("Password");
        String getPhone = intent.getStringExtra("Phone");


        TextView name1txt = findViewById(R.id.name);
        TextView emailtxt = findViewById(R.id.mail);
        TextView passIDtxt = findViewById(R.id.password);
        TextView phonetxt = findViewById(R.id.num);
        TextView gendertxt = findViewById(R.id.gender);

        name1txt.setText(getName);
        emailtxt.setText(getEmail);
        passIDtxt.setText(getPassID);
        phonetxt.setText(getPhone);
        gendertxt.setText(getGender);
    }
}