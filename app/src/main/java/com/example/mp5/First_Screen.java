package com.example.mp5;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class First_Screen extends AppCompatActivity {

    String chooseSymptoms = "Choose your Symptoms:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onClickReset(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        header.setText(chooseSymptoms);
        secondHeader.setText("");
    }
    public void onClickNext(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (!(header.getText().toString().equals(chooseSymptoms))) {
            String first_sypm = (header.getText().toString());
            String second_symp = (secondHeader.getText().toString());
            Intent primero = new Intent(getApplicationContext(), Return_Screen.class);
            primero.putExtra("Second", second_symp);
            primero.putExtra("First", first_sypm);
            startActivity(primero);
        }
    }
    public void onClickFever(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Fever");
        } else {
            secondHeader.setText("Fever");
        }
    }
    public void onClickHeadache(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Headache");
        } else {
            secondHeader.setText("Headache");
        }
    }
    public void onClickCough(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Cough");
        } else {
            secondHeader.setText("Cough");
        }
    }

    public void onClickDiarrhea(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Diarrhea");
        } else {
            secondHeader.setText("Diarrhea");
        }
    }
    public void onClickCramps(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Cramps");
        } else {
            secondHeader.setText("Cramps");
        }
    }
    public void onClickDizziness(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Dizziness");
        } else {
            secondHeader.setText("Dizziness");
        }
    }
    public void onClickCongestion(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Congestion");
        } else {
            secondHeader.setText("Congestion");
        }
    }
    public void onClickAppetiteLoss(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Appetite Loss");
        } else {
            secondHeader.setText("Appetite Loss");
        }
    }
    public void onClickHeartburn(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Heartburn");
        } else {
            secondHeader.setText("Heartburn");
        }
    }
    public void onClickVomiting(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Vomiting");
        } else {
            secondHeader.setText("Vomiting");
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}