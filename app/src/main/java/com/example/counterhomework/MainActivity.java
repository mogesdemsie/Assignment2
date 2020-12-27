package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private int count;
    TextView text;
    TextView text0;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            TextView viewById = (TextView) findViewById(R.id.textView);
            viewById.setText(savedInstanceState.getString("count"));

        }
        text=(TextView)findViewById(R.id.textView);
       // text0=(TextView)findViewById(R.id.textView2);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=Integer.parseInt(text.getText().toString());
                count=count+1;
                text.setText(Integer.toString(count));
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView viewById = (TextView) findViewById(R.id.textView);
        outState.putString("count", (String) viewById.getText());
    }
}