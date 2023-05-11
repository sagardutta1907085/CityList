package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showactivity);

        Intent intent=getIntent();
        String s=intent.getStringExtra("citylist");

        TextView textView=findViewById(R.id.textView);
        textView.setText(s);

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(showactivity.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}