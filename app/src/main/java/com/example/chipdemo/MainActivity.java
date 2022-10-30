package com.example.chipdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {

    ChipGroup cg;
    Chip chip;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        cg=findViewById(R.id.chipGroup);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chip = findViewById(cg.getCheckedChipId());
                if(chip.isCheckable()){
                    Toast.makeText(getApplicationContext(), chip.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}