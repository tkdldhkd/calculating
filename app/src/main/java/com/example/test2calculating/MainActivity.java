package com.example.test2calculating;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int swithnum = 0;

    int tool = 0; //1 더하기 2 곱하기 3 나누기
    int num1 = 0;
    int num2 = 0;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textView = findViewById(R.id.textView);

    }


    public void zero(View view) {

        if (swithnum == 0) {
            num1 = 0;
            swithnum = 1;
            textView.setText("0");
        }
        else {
            num2 = 0;
            textView.setText("0");
        }
    }

    public void clear(View view) {
        swithnum = 0;
        num1 = 0;
        num2 = 0;
        textView.setText("숫자를 입력하시오.");
    }

    public void divi(View view) {
        if (swithnum == 1) {
            textView.setText("%");
            tool = 3;
        } else textView.setText("숫자를 먼저 입력하시오.");
    }

    public void one(View view) {

        if (swithnum == 0) {
            num1 = 1;
            swithnum = 1;
            textView.setText("1");
        }
        else {
            num2 = 1;
            textView.setText("1");
        }
    }

    public void two(View view) {
        if (swithnum == 0) {
            num1 = 2;
            swithnum = 1;
            textView.setText("2");
        }
        else {
            num2 = 2;
            textView.setText("2");
        }
    }

    public void three(View view) {
        if (swithnum == 0) {
            num1 = 3;
            swithnum = 1;
            textView.setText("3");
        }
        else {
            num2 = 3;
            textView.setText("3");
        }
    }

    public void multiply(View view) {
        if (swithnum == 1) {
            textView.setText("X");
            tool = 2;
        } else textView.setText("숫자를 먼저 입력하시오.");
    }

    public void plus(View view) {
        if (swithnum == 1) {
            textView.setText("+");
            tool = 1;
        } else textView.setText("숫자를 먼저 입력하시오.");
    }

    public void six(View view) {
        if (swithnum == 0) {
            num1 = 6;
            swithnum = 1;
            textView.setText("6");
        }
        else {
            num2 = 6;
            textView.setText("6");
        }
    }

    public void fiv(View view) {
        if (swithnum == 0) {
            num1 = 5;
            swithnum = 1;
            textView.setText("5");
        }
        else {
            num2 = 5;
            textView.setText("5");
        }
    }

    public void four(View view) {
        if (swithnum == 0) {
            num1 = 4;
            swithnum = 1;
            textView.setText("4");
        }
        else {
            num2 = 4;
            textView.setText("4");
        }
    }

    public void finaaaal(View view) {
        switch (tool) {
            case 1:
                int num3 = num1 + num2;
                textView.setText("답: "+ num3);
                break;
            case 2:
                int num4 = num1 * num2;
                textView.setText("답: "+ num4);
                break;
            case 3:
                int num5 = num1 / num2;
                textView.setText("답: "+ num5);
                break;

        }
    }

        public void nine(View view){
            if (swithnum == 0) {
                num1 = 9;
                swithnum = 1;
                textView.setText("9");
            }
            else {
                num2 = 9;
                textView.setText("9");
            }
        }

        public void eight(View view){
            if (swithnum == 0) {
                num1 = 8;
                swithnum = 1;
                textView.setText("8");
            }
            else {
                num2 = 8;
                textView.setText("8");
            }
        }

        public void seven(View view){
            if (swithnum == 0) {
                num1 = 7;
                swithnum = 1;
                textView.setText("7");
            }
            else {
                num2 = 7;
                textView.setText("7");
            }
        }
    }


