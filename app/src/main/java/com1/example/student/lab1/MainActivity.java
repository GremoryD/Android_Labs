package com1.example.student.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {


    private EditText editText;
    private EditText editText2;
    private EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         GetComponents();
    }

    void GetComponents(){
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText4 = (EditText) findViewById(R.id.editText4);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                editText2.setText("");
                editText4.setText("");
            }
        });


    }


    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public void ClickNext(View v){
        if(editText.getText().length()>0){

        }else{
            return;
        }
        if(editText2.getText().length()>0){

        }else{
            return;
        }
        if(isNumeric(editText4.getText().toString())){

        }else{
            return;
        }

        if(Integer.parseInt(editText4.getText().toString())>0){

        }else{
            return;
        }

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(Main2Activity.NAME,editText.getText().toString());
        intent.putExtra(Main2Activity.SURNAME,editText2.getText().toString());
        intent.putExtra(Main2Activity.MARK,editText4.getText().toString());
        startActivityForResult(intent,0);
    }


}
