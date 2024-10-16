package com.example.gslc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText NameET,binusID, RoleET;

   Button RegisterBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        NameET = findViewById(R.id.NameET);
        binusID= findViewById(R.id.binusid);
        RoleET = findViewById(R.id.RoleET);
        RegisterBtn = findViewById(R.id.RegisterBtn);
        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = NameET.getText().toString();
                String id = binusID.getText().toString();
                String role = RoleET.getText().toString();

                Intent pindahIntent = new Intent(MainActivity.this, HomeActivity.class);
                pindahIntent.putExtra("InputName",name);
                pindahIntent.putExtra("InputID",id);
                pindahIntent.putExtra("InputRole",role);
                startActivity(pindahIntent);
            }

        });



    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "activity resumed");
    };

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "activity paused");
    };

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "activity stopped");
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "activity destroyed");
    };
}