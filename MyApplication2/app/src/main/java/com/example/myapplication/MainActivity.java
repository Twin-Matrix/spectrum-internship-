package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button buSubmit;
    TextView txResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etID =findViewById(R.id.etID);
        buSubmit = findViewById(R.id.buSubmit);
        txResult = findViewById(R.id.txResult);
        buSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buSubmit.setBackgroundColor(R.color.colorprimaryLight);
                String idNumber = etID.getText().toString().trim();
                String Name;
                if(idNumber =="18001006017")
                    Name = "Abhisek kumar";
                else
                    Name=null;
                txResult.setText("Abhisek kumar");


            }
        });
    }
}
