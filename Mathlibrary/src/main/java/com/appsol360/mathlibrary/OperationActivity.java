package com.appsol360.mathlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OperationActivity extends AppCompatActivity {
    EditText first_num, second_num;
    Button results_btn;
    TextView sum, divide, multiply, subtract;
    String a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        //function
        ArithmaticFunction();

    }

    private void ArithmaticFunction() {
        //creating hooks
        first_num = findViewById(R.id.edi1);
        second_num = findViewById(R.id.edi2);
        results_btn = findViewById(R.id.button);
        sum = findViewById(R.id.sum_results);
        divide = findViewById(R.id.divide_results);
        multiply = findViewById(R.id.multiply_results);
        subtract = findViewById(R.id.minus_results);
        results_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //getting text from edittext fields
                a = first_num.getText().toString();
                b = second_num.getText().toString();
                //checking conditions if fields are empty or not
                if (a.isEmpty()) {
                    first_num.setError("Enter first no");
                } else if (b.isEmpty()) {
                    second_num.setError("Enter second no");
                } else {
                    //showing results in textfields
                    sum.setText(String.valueOf(Arithmatic.Sum(Double.parseDouble(a), Double.parseDouble(b))));
                    divide.setText(String.valueOf(Arithmatic.Divide(Double.parseDouble(a), Double.parseDouble(b))));
                    subtract.setText(String.valueOf(Arithmatic.Subtract(Double.parseDouble(a), Double.parseDouble(b))));
                    multiply.setText(String.valueOf(Arithmatic.Multiply(Double.parseDouble(a), Double.parseDouble(b))));
                    Toast.makeText(getBaseContext(), "sum is:  "+String.valueOf(Arithmatic.Sum(Double.parseDouble(a), Double.parseDouble(b))), Toast.LENGTH_SHORT).show();
                    finish();

                }
            }
        });
    }
}