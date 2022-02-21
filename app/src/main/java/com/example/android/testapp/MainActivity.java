package com.example.android.testapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static int counter;
    public static int counterR;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate ------ ", "MainActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ","MainActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        this.counterR++;
        TextView textView = (TextView) findViewById(R.id.textViewR);
        textView.setText("OnResume Counter: " + counterR);
        Log.e("onResume ------ ","MainActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ","MainActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ","MainActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ","MainActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        this.counter++;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("OnRestart Counter: " + counter);
        Log.e("onRestart ------ ","MainActivity: onRestart()");

    }


    public void switchActivity(View view){
        Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
        startActivity(intent);
    }


    public void finishActivityA(View view) {
        MainActivity.this.finish();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("MyInt", counter);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void openDialog(View view) {
        Log.e("Open", "open");
        //ExampleDialog exampleDialog=new ExampleDialog();
        //ExampleDialogexampleDialogmpleDialog.show(getSupportFragmentManager(),"example dialog");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.activity_dialog);
        dialog.show();
    }

}
