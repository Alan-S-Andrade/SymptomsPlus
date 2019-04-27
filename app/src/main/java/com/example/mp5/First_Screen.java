package com.example.mp5;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

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
        if (!(header.getText().toString().equals(chooseSymptoms))) {
            startActivity(new Intent(getApplicationContext(), Return_Screen.class));
        }
    }
    public boolean onClickFever(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Fever chosen");
            return true;
        } else {
            secondHeader.setText("Fever chosen");
            return true;
        }
    }
    public void onClickHeadache(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Headache chosen");
        } else {
            secondHeader.setText("Headache chosen");
        }
    }
    public void onClickCough(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Cough chosen");
        } else {
            secondHeader.setText("Cough chosen");
        }
    }

    public void onClickDiarrhea(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Diarrhea chosen");
        } else {
            secondHeader.setText("Diarrhea chosen");
        }
    }
    public void onClickCramps(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Cramps chosen");
        } else {
            secondHeader.setText("Cramps chosen");
        }
    }
    public void onClickDizziness(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Dizziness chosen");
        } else {
            secondHeader.setText("Dizziness chosen");
        }
    }
    public void onClickCongestion(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Congestion chosen");
        } else {
            secondHeader.setText("Congestion chosen");
        }
    }
    public void onClickAppetiteLoss(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Appetite Loss chosen");
        } else {
            secondHeader.setText("Appetite Loss chosen");
        }
    }
    public void onClickHeartburn(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Heartburn chosen");
        } else {
            secondHeader.setText("Heartburn chosen");
        }
    }
    public void onClickVomiting(View view) {
        TextView header = findViewById(R.id.heading);
        TextView secondHeader = findViewById(R.id.secondHeading);
        if (header.getText().toString().equals(chooseSymptoms)){
            header.setText("Vomiting chosen");
        } else {
            secondHeader.setText("Vomiting chosen");
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