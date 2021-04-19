package com.example.tablemaker;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Print extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "At Home", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(view.getContext(), MainActivity.class));
            }
        });

        // Get the Intent that started this activity
        Intent intent = getIntent();
        String task = intent.getStringExtra("task");
        String xq = intent.getStringExtra("q");
        int q = 0;
        q = Integer.parseInt(xq);
        int count = 10;
        TextView xOutput = (TextView) findViewById(R.id.outText);
        TextView displayTextView = (TextView) findViewById(R.id.outText);

        switch (task) {
            case "add":
                Toast.makeText(getApplicationContext(), "Additions Table", Toast.LENGTH_SHORT).show();
                displayTextView.setText("Table " + q + "\n ------------------- \n");
                for (int i = 1; i <= count; i++) {
                    int additions = (q + 1);
                    displayTextView.append(q + " + " + i + " = " + additions + "\n");
                }
                break;
            case "sub":
                Toast.makeText(getApplicationContext(), "Subtraction Table", Toast.LENGTH_SHORT).show();
                displayTextView.setText("Table " + q + "\n ------------------- \n");
                for (int i = 1; i <= count; i++) {
                    int minus = (q - i);
                    displayTextView.append(q + " - " + i + " = " + minus + "\n");
                }
                break;
            case "multi":
                Toast.makeText(getApplicationContext(), "Multiplication Table", Toast.LENGTH_SHORT).show();
                displayTextView.setText("Table " + q + "\n ------------------- \n");
                for (int i = 1; i <= count; i++) {
                    displayTextView.append(q + " X " + i + " = " + q * i + "\n");
                }
                break;
            case "div":
                Toast.makeText(getApplicationContext(), "Divisions Table", Toast.LENGTH_SHORT).show();
                displayTextView.setText("Table " + q + "\n ------------------- \n");
                for (int i = 1; i <= count; i++) {
                    float divisions = (q / i);
                    displayTextView.append(q + " / " + i + " = " + divisions + "\n");
                }
                break;
            case "per":
                Toast.makeText(getApplicationContext(), "Percentage Table", Toast.LENGTH_SHORT).show();
                displayTextView.setText("Table " + q + "\n ------------------- \n");
                for (int i = 1; i <= count; i++) {
                    float per = (q % i);
                    displayTextView.append(q + " % " + i + " = " + per + "\n");
                }
                break;
            default:
                displayTextView.setText("No Table " + q + "\n ------------------- \n");
        }
    }


}