package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //связываем
        textView = findViewById(R.id.textView);
        //смотрим в лог
        Log.d("Lifecycle method: ", "onCreate()");
        //добавляем текс к существующему
        textView.append("onCreate()" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();

        //смотрим в лог
        Log.d("Lifecycle method: ", "onStart()");
        //добавляем текс к существующему
        textView.append("onStart()" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //смотрим в лог
        Log.d("Lifecycle method: ", "onResume()");
        //добавляем текс к существующему
        textView.append("onResume()" + "\n");
    }

    @Override
    protected void onPause() {
        super.onPause();

        //смотрим в лог
        Log.d("Lifecycle method: ", "onPause()");
        //добавляем текс к существующему
        textView.append("onPause()" + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();

        //смотрим в лог
        Log.d("Lifecycle method: ", "onStop()");
        //добавляем текс к существующему
        textView.append("onStop()" + "\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //смотрим в лог
        Log.d("Lifecycle method: ", "onDestroy() ");
        //добавляем текс к существующему
        textView.append("onDestroy() " + "\n");
    }
}