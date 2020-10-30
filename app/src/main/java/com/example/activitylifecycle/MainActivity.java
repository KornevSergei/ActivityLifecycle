package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;



//В данном сучае сохраняем данные только когда приложение запущено, после закрытия всё удаляется
public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //связываем
        textView = findViewById(R.id.textView);


        //проверяем если не текст не равен null то помещаем текст
        if (savedInstanceState != null){
            textView.setText(savedInstanceState.getString("textToBundle"));

        }


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

    //переопределяем метод для сохранения информации при перевороте активити
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        //исзвлекаем созраненный текст и вставляем в Бандл
        outState.putString("textToBundle", textView.getText().toString());

        //смотрим в лог
        Log.d("onSaveInstanceState: ", "onSaveInstanceState() ");
        //добавляем текс к существующему
        textView.append("onSaveInstanceState() " + "\n");
    }
}