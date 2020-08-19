package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button number0,number1,number2,number3,number4,number5,number6,number7,number8,number9,
            percentage,mul,sub,add,div,clear,result,logarithmic,sine,cosine,tangent,square,point,
            addorsub;
   TextView data,display;
   double input1,input2,s;
   boolean addition,subtraction,division,multiplication,per,sqr;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number0 = (Button) findViewById(R.id.number0);
        number1 = (Button) findViewById(R.id.number1);
        number2 = (Button) findViewById(R.id.number2);
        number3 = (Button) findViewById(R.id.number3);
        number4 = (Button) findViewById(R.id.number4);
        number5 = (Button) findViewById(R.id.number5);
        number6 = (Button) findViewById(R.id.number6);
        number7 = (Button) findViewById(R.id.number7);
        number8 = (Button) findViewById(R.id.number8);
        number9 = (Button) findViewById(R.id.number9);
        addorsub=(Button) findViewById(R.id.addorsub);
        point=(Button) findViewById(R.id.point);
        clear = (Button) findViewById(R.id.clear);
        sine = (Button) findViewById(R.id.sine);
        cosine = (Button) findViewById(R.id.cosine);
        tangent = (Button) findViewById(R.id.tangent);
        square = (Button) findViewById(R.id.square);
        logarithmic=(Button) findViewById(R.id.logarithmic);
        percentage = (Button) findViewById(R.id.percentage);
        result = (Button) findViewById(R.id.result);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);
        clear = (Button) findViewById(R.id.clear);
        data = (TextView) findViewById(R.id.data);
        display = (TextView) findViewById(R.id.display);
        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number0.getText().toString());
            }
        });
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number1.getText().toString());
            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number2.getText().toString());
            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number3.getText().toString());
            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number4.getText().toString());
            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number5.getText().toString());
            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number6.getText().toString());
            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number7.getText().toString());
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number8.getText().toString());
            }
        });
        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(number9.getText().toString());
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.append(point.getText().toString());
            }
        });
        addorsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=Double.parseDouble(data.getText().toString());
                if(s>0)
                    data.setText("-"+s);
                else
                    data.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.setText("");
            }
        });
        logarithmic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText() + "");
                    data.setText(Math.log10(input1)+"");
                }
            }
        });
        sine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText() + "");
                    data.setText(Math.sin(input1)+"");
                }
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText() + "");
                    sqr=true;
                    data.setText(null);
                }
            }
        });
        cosine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText() + "");
                    data.setText(Math.cos(input1)+"");
                }
            }
        });
        tangent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText() + "");
                    data.setText(Math.tan(input1)+"");
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText()+"");
                    subtraction = true;
                    data.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText()+"");
                    multiplication = true;
                    data.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText()+"");
                    division = true;
                    data.setText(null);
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.getText().length() != 0) {
                    input1 = Double.parseDouble(data.getText() + "");
                    addition = true;
                    data.setText(null);
                }
            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(data.getText().length()!=0){
                    input1=Double.parseDouble(data.getText()+"");
                    per=true;
                    data.setText(null);
                }
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    input2 = Double.parseDouble(data.getText() + "");
                    if (addition) {
                        data.setText(input1+input2 + "");
                        addition = false;
                    }
                    else if(subtraction){
                        data.setText(input1-input2+"");
                        subtraction=false;
                    }
                    else if(multiplication){
                        data.setText(input1*input2+"");
                        multiplication=false;
                    }
                    else if(division){
                        data.setText(input1/input2+"");
                        division=false;
                    }
                    else if(per){
                        data.setText(input1%input2+"");
                        per=false;
                    }
                    else if(sqr){
                        data.setText(Math.pow(input1,input2)+"");
                        sqr=false;
                    }
            }
        });
    }
}

