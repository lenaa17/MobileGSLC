package com.example.gslc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    TextView Inputname, InputID, InputRole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Inputname = findViewById(R.id.Inputname);
        InputID = findViewById(R.id.InputID);
        InputRole = findViewById(R.id.InputRole);

        Intent terimaIntent = getIntent();

        String name = terimaIntent.getStringExtra("InputName");
        String id = terimaIntent.getStringExtra("InputID");
        String role = terimaIntent.getStringExtra("InputRole");

        Inputname.setText(name);
        InputID.setText(id);
        InputRole.setText(role);


    }
}