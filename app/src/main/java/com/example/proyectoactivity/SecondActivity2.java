package com.example.proyectoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        getParametros();
    }

    public void goToActivityMain(View view) {
        Intent newIntent = new Intent(this, MainActivity.class);

        newIntent.putExtra("name", "Hello Main");

        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(newIntent);
    }

    public void getParametros() {
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("msg");
        int year = extras.getInt("year");
        Toast.makeText(this, msg + " " + year, Toast.LENGTH_SHORT).show();
    }

}


