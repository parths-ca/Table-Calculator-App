package com.example.tablemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText getnum;
    TextView displayTextView;
    int count = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        getnum = (EditText) findViewById(R.id.q);
        int num = new Integer(getnum.getText().toString()).intValue();
        Toast.makeText(getApplicationContext(), "Addition", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Print.class);
        intent.putExtra("task", "add".toString());
        intent.putExtra("q", getnum.getText().toString()).getData();
        startActivity(intent);
    }

    public void sub(View view) {
        getnum = (EditText) findViewById(R.id.q);
        int num = new Integer(getnum.getText().toString()).intValue();
        Toast.makeText(getApplicationContext(), "Subtraction", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Print.class);
        intent.putExtra("task", "sub".toString());
        intent.putExtra("q", getnum.getText().toString()).getData();
        startActivity(intent);
    }

    public void multi(View view) {
        getnum = (EditText) findViewById(R.id.q);
        int num = new Integer(getnum.getText().toString()).intValue();
        Toast.makeText(getApplicationContext(), "Multiplication", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Print.class);
        intent.putExtra("task", "multi".toString());
        intent.putExtra("q", getnum.getText().toString()).getData();
        startActivity(intent);
    }

    public void div(View view) {
        getnum = (EditText) findViewById(R.id.q);
        int num = new Integer(getnum.getText().toString()).intValue();
        Toast.makeText(getApplicationContext(), "Division", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Print.class);
        intent.putExtra("task", "div".toString());
        intent.putExtra("q", getnum.getText().toString()).getData();
        startActivity(intent);
    }

    public void per(View view) {
        getnum = (EditText) findViewById(R.id.q);
        int num = new Integer(getnum.getText().toString()).intValue();
        Toast.makeText(getApplicationContext(), "Percentage", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Print.class);
        intent.putExtra("task", "per".toString());
        intent.putExtra("q", getnum.getText().toString()).getData();
        startActivity(intent);
    }

}

