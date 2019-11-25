package com.example.atoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class one extends AppCompatActivity implements View.OnClickListener {
    private Button oneback;
    private TextView show_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        oneback=(Button)findViewById(R.id.oneback);
        show_one=(TextView) findViewById(R.id.show_one);
        oneback.setOnClickListener(this);
        Intent intent=getIntent();
        String data=intent.getStringExtra("Main");
        show_one.setText(data);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(one.this,MainActivity.class);
        intent.putExtra("one","one向主活动发送数据");
        startActivity(intent);
    }
}
