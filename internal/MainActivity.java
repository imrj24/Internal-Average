package com.example.rakeshjayaram.internal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    TextView t1,t2,t3,t4;
    Button b1,b2;
    Float f1,f2,f3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        b1=(Button)findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        t4=(TextView) findViewById(R.id.textView6);
        t1=(TextView)findViewById(R.id.textView2);
        t2=(TextView)findViewById(R.id.textView4);
        t3=(TextView)findViewById(R.id.textView5);

        e1.addTextChangedListener(loginTextWatcher);
        e2.addTextChangedListener(loginTextWatcher);
        e3.addTextChangedListener(loginTextWatcher);


//        e1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                if(e1.getText().length()>2 || Integer.parseInt(e1.getText().toString())>50){
//                    e1.setError("enter proper data");
//                }
//            }
//        });
//        e2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                if(e2.getText().length()>2 || Integer.parseInt(e2.getText().toString())>50){
//                    e2.setError("enter proper data");
//                }
//            }
//        });
//        e3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                if(e3.getText().length()>2 || Integer.parseInt(e3.getText().toString())>50){
//                    e3.setError("enter proper data");
//                }

//            }
//        });



    }
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String a = e1.getText().toString().trim();
            String b = e2.getText().toString().trim();
            String c = e3.getText().toString().trim();

            b1.setEnabled(!a.isEmpty() && !b.isEmpty() && !c.isEmpty());
            b2.setEnabled(!a.isEmpty() || !b.isEmpty() || !c.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public void avg(View view) {
        if (Integer.parseInt(e1.getText().toString()) > 50 ) {
            e1.setError("enter proper data");
            if (Integer.parseInt(e3.getText().toString()) > 50) {
                e3.setError("enter proper data");
            if (Integer.parseInt(e2.getText().toString()) > 50) {
                e2.setError("enter proper data");


                }
            }
        }
        else if (Integer.parseInt(e2.getText().toString()) > 50) {
            e2.setError("enter proper data");

        }

        else if(Integer.parseInt(e3.getText().toString()) > 50) {
            e3.setError("enter proper data");


        }

         else   {
            f1 = Float.parseFloat(String.valueOf(e1.getText()));
            f2 = Float.parseFloat(String.valueOf(e2.getText()));
            f3 = Float.parseFloat(String.valueOf(e3.getText()));
            f1 = f1 / 5;
            f2 = f2 / 5;
            f3 = f3 / 5;
            t1.setText(Float.toString(f1));
            t2.setText(Float.toString(f2));
            t3.setText(Float.toString(f3));
            String f4 = Float.toString(Math.round(f1 + f2 + f3));

            t4.setText(f4);
        }
    }

    public void clear(View view) {
        e1.setText("");
        e2.setText("");
        e3.setText("");
        t4.setText("");
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }

}
