package com.example.atoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class two extends AppCompatActivity implements View.OnClickListener {
  private Button twoback;
  private TextView show_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        twoback=(Button)findViewById(R.id.twoback);
        show_two=(TextView)findViewById(R.id.show_two);
        twoback.setOnClickListener(this);
        Intent intent=getIntent();
        String data=intent.getStringExtra("Main");
        show_two.setText(data);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(two.this,MainActivity.class);
        intent.putExtra("two","two向主活动发送数据");
        startActivity(intent);
    }
}
