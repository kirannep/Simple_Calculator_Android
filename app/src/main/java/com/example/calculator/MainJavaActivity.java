package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import org.w3c.dom.Text;

public class MainJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSave = findViewById(R.id.btn_save);
        final EditText etName= findViewById(R.id.et_name);
        final TextView tvNAme = findViewById(R.id.tv_user_name);

        final EditText etNumberOne = findViewById(R.id.et_number_one);
        final EditText etNumberTwo = findViewById(R.id.et_number_two);
        Button btnAdd = findViewById(R.id.btn_add);
        Button btnSubtract = findViewById(R.id.btn_subtract);
        Button btnMultiply = findViewById(R.id.btn_multiply);
        Button btnDivide = findViewById(R.id.btn_divide);
        final TextView tvResult = findViewById(R.id.tv_result);
        final TextView tvSubtract = findViewById(R.id.tv_subtract);
        final TextView tvMultiply = findViewById(R.id.tv_multiply);
        final TextView tvDivide = findViewById(R.id.tv_divide);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                tvNAme.setText("Hello " + name);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);
                int result = a+b;

                tvResult.setText(Integer.toString(result));

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);
                int subtract = a-b;
                tvSubtract.setText(Integer.toString(subtract));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);
                int multiply = a*b;
                tvMultiply.setText(Integer.toString(multiply));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);
                int divide = a/b;
                if (b != 0){
                    tvDivide.setText(Integer.toString(divide));
                }
            }
        });
    }
}
