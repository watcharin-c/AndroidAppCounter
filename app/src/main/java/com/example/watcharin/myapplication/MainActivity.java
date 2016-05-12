package com.example.watcharin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView txtCount;
    RadioButton radioUp, radioDown;
    Button btnCount;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCount = (TextView) findViewById(R.id.counter_value);
        radioUp = (RadioButton) findViewById(R.id.count_up_radio);
        radioDown = (RadioButton) findViewById(R.id.count_down_radio);
        btnCount = (Button) findViewById(R.id.count_button);

        txtCount.setText(String.valueOf(count));
        btnCount.setOnClickListener(new onClickListener());
    }

    //class onClickListener is Inner class in MainActivity
    private class onClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v){
            if (radioUp.isChecked()){
                count++;
            }else if (radioDown.isChecked()){
                count--;
            }
            txtCount.setText(String.valueOf(count));
        }
    }
}
