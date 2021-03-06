package com.example.proyectoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.i("informacion", "onCreate: o");

    }

    public void goToActivitySecond(View view){
        Intent newIntent = new Intent( this,SecondActivity2.class);

        newIntent.putExtra("name", "Hello activity 2");

        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        newIntent.putExtra("msg","Hola");

        newIntent.putExtra("year",2021);

        startActivity(newIntent);

    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStar", Toast.LENGTH_SHORT).show();
        Log.i("informacion", "onStart: ");
    };

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.i("informacion", "onResume: ");
    };
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.i("informacion", "onPause: ");
    };
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.i("informacion", "onStop: ");
    };
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();

    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("informacion", "onDestroy: ");
    };


}