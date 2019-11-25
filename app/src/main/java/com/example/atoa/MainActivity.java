package com.example.atoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button go_one,go_two;
    private TextView show_mian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go_one=(Button)findViewById(R.id.go_one);
        go_two=(Button)findViewById(R.id.go_two);
        show_mian=(TextView)findViewById(R.id.show_main);
        go_one.setOnClickListener(this);
        go_two.setOnClickListener(this);
    }
    @Override
    protected void onResume() {

        super.onResume();
        Intent intent = getIntent();
        String data = new String();
        data = intent.getStringExtra("one");
        if (data==null) {
            data = intent.getStringExtra("two");
        }
        if (data!=null) {
            show_mian.setText(data);
        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.go_one:
                Intent intent=new Intent(MainActivity.this,one.class);
                intent.putExtra("Main","主活动向one发送数据");
                startActivity(intent);
                break;
            case R.id.go_two:
                Intent intent1=new Intent(MainActivity.this,two.class);
                intent1.putExtra("Main","主活动向two发送数据");
                startActivity(intent1);
                break;
            default:break;
        }
    }
}
