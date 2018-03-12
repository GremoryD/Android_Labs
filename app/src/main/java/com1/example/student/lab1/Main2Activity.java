package com1.example.student.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {



    public static  final  String NAME = "";
    public static  final  String SURNAME = "";
    public static  final  String MARK = "1";
    LinearLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        main = (LinearLayout)findViewById(R.id.LinerLayoutMarcks);
        main.addView(AddnewComponents());
    }

    public LinearLayout AddnewComponents(){
        LinearLayout group = new LinearLayout(this);
        for (int i = 0; i <= Integer.parseInt(MARK); i++) {
            group.setHorizontalGravity(1);
            TextView text = new TextView(this);
            text.setText("Number"+i);
            RadioGroup gr = new RadioGroup(this);

                for(int j=0;j<=5;j++){
                    RadioButton btn = new RadioButton(this);
                    btn.setText(j);
                    gr.addView(btn);
                }
            group.addView(text);
            group.addView(gr);
        }
        return group;
    }
}
