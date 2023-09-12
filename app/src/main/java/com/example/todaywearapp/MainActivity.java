package com.example.todaywearapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = (TextView) findViewById(R.id.date);

        Date today = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d - yyyy");

        date.setText("Today is "+ dateFormat.format(today));

    }
}