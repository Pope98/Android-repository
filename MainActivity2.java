package com.example.povilas.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button)findViewById(R.id.myButton);

        myButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView myText = (TextView)findViewById(R.id.myText);
                        myText.setText("Good job!");
                    }
                }
        );

        myButton.setOnLongClickListener(
            new Button.OnLongClickListener(){
                public boolean onLongClick(View v){
                    TextView myText = (TextView)findViewById(R.id.myText);
                    myText.setText("Long click detected!");
                    return true;
                }
            }
        );
    }
}
