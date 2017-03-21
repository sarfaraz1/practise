package com.example.shubh.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View view)

    {

        EditText editText1=(EditText)findViewById(R.id.editText1);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        int a=Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());

        TextView textView=(TextView)findViewById(R.id.editText3);
        textView.setText(String.valueOf(a+b));

    }
    public void Div(View view)

    {

        EditText editText1=(EditText)findViewById(R.id.editText1);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        int a=Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());

        TextView textView=(TextView)findViewById(R.id.editText3);
        textView.setText(String.valueOf(a/b));

    }
    public void Mul(View view)

    {

        EditText editText1=(EditText)findViewById(R.id.editText1);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        int a=Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());

        TextView textView=(TextView)findViewById(R.id.editText3);
        textView.setText(String.valueOf(a*b));

    }
    public void Sub(View view)

    {

        EditText editText1=(EditText)findViewById(R.id.editText1);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        int a=Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());

        TextView textView=(TextView)findViewById(R.id.editText3);
        textView.setText(String.valueOf(a-b));

    }

}
