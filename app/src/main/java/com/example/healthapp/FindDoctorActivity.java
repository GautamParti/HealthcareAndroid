package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);
        CardView exit=findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(FindDoctorActivity.this,loginActivity.class));
            }
        });

    CardView familyphysician=findViewById(R.id.cardFDfamilyPhysican);
        familyphysician.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent it =new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
            it.putExtra("title","family physicans");
            startActivity(it);
        }
    });
        CardView Dentist=findViewById(R.id.cardFDDentist);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","Dentist");
                startActivity(it);
            }
        });
        CardView surgean=findViewById(R.id.cardFDSurgeon);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","Surgean");
                startActivity(it);
            }
        });
        CardView cardiologist=findViewById(R.id.cardFDCardiologists);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","Cardiologists");
                startActivity(it);
            }
        });
        CardView dietician=findViewById(R.id.cardFDdietician);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it =new Intent(FindDoctorActivity.this,DoctorDetailsActivity.class);
                it.putExtra("title","dietician");
                startActivity(it);
            }
        });

}
}