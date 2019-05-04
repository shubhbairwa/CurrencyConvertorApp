package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
Button euro,pound,dollar,dinar,yen,bitcoin,australianDollar,canadianDollar,rubel;
EditText editText;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        dollar=findViewById(R.id.dollar);
        dinar=findViewById(R.id.dinar);
        yen=findViewById(R.id.yen);
        bitcoin=findViewById(R.id.bitcoin);
        australianDollar=findViewById(R.id.austDollar);
        canadianDollar=findViewById(R.id.canadDollar);
        rubel=findViewById(R.id.rubel);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);


    euro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
              if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                  editText.setError("you have to Enter value");
              }else{
                  double n,k;
                n=Double.parseDouble(z); //convert the string into double
                  textView.setText(null);

                  Formatter formatter=new Formatter();
                  k=n*0.012;

                  DecimalFormat decimalFormat=new DecimalFormat("#.00");
                  textView.setText(""+decimalFormat.format(k));
              }


        }
    });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
                if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                    editText.setError("you have to Enter value");
                }else{
                    double n,k;
                    n=Double.parseDouble(z); //convert the string into double
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.011;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }


            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
                if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                    editText.setError("you have to Enter value");
                }else{
                    double n,k;
                    n=Double.parseDouble(z); //convert the string into double
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*1.60;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }


            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
                if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                    editText.setError("you have to Enter value");
                }else{
                    double n,k;
                    n=Double.parseDouble(z); //convert the string into double
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.014;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }


            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
                if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                    editText.setError("you have to Enter value");
                }else{
                    double n,k;
                    n=Double.parseDouble(z); //convert the string into double
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.044;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }


            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
                if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                    editText.setError("you have to Enter value");
                }else{
                    double n,k;
                    n=Double.parseDouble(z); //convert the string into double
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.0000036;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }


            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
                if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                    editText.setError("you have to Enter value");
                }else{
                    double n,k;
                    n=Double.parseDouble(z); //convert the string into double
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.94;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }


            }
        });

        australianDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
                if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                    editText.setError("you have to Enter value");
                }else{
                    double n,k;
                    n=Double.parseDouble(z); //convert the string into double
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.020;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }


            }
        });

        canadianDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z= editText.getText().toString();  //we use string here so that if someone put symbol in it it restrict from doing that
                if (TextUtils.isEmpty(z)){      //textUtils is a class that give us checked condition
                    editText.setError("you have to Enter value");
                }else{
                    double n,k;
                    n=Double.parseDouble(z); //convert the string into double
                    textView.setText(null);

                    Formatter formatter=new Formatter();
                    k=n*0.019;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }


            }
        });
            }

    }





