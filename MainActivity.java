package edu.cs.birzeit.regestration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText name1;
    private EditText name2;
    private EditText email;
    private EditText passID;
    private EditText phone;
    private RadioButton male;
    private RadioButton female;
    private Button buttonSpenner;
    private EditText textform;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);
        email = findViewById(R.id.email);
        passID = findViewById(R.id.passID);
        phone = findViewById(R.id.phone);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        spinner = findViewById(R.id.spineer);
        textform = findViewById(R.id.textform);
        buttonSpenner = findViewById(R.id.buttonSpenner);
        final List<String> list = new ArrayList<>();

        // Initializing an ArrayAdapter
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this, R.layout.support_simple_spinner_dropdown_item, list);

        spinnerArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);
        buttonSpenner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                list.add(textform.getText().toString());
                spinnerArrayAdapter.notifyDataSetChanged();
            }
        });


    }

    public void save_onclick(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        String name1txt = name1.getText().toString() + " " + name2.getText().toString();
        String emailtxt = email.getText().toString();
        String passIDtxt = passID.getText().toString();
        String phonetxt = phone.getText().toString();

        if(male.isSelected())
            female.setSelected(false);
        String gend = "Male";
        intent.putExtra("Name",name1txt);
        intent.putExtra("Email",emailtxt);
        intent.putExtra("Password",passIDtxt);
        intent.putExtra("Phone",phonetxt);
        intent.putExtra("Male",gend);

        startActivity(intent);
    }

    public void malebtn(View view) {
        if(male.isSelected())
            female.setSelected(false);
        String gend = "Male";

    }

    public void femalebtn(View view) {
        if(female.isSelected())
            male.setSelected(false);
        String gend = "Female";
    }
}