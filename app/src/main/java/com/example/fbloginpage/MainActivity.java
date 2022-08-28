package com.example.fbloginpage;

import

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button reg = findViewById(R.id.reg);
        @Override
   public void onClick(View view){
            Intent intent = new Intent( packageContext: MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        }
    };

    }

