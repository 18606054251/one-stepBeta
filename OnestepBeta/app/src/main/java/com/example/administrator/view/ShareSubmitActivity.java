package com.example.administrator.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.R;

public class ShareSubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_submit);
//        Button back = (Button)findViewById(R.id.title_button1);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ShareSubmitActivity.this,FragmentItemSetsActivity.class);
//                startActivity(intent);
//                finish();
//
//            }
//        });

        Button tijiao = (Button)findViewById(R.id.tijiaofengxiang1);
        tijiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ShareSubmitActivity.this,"提交成功",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
