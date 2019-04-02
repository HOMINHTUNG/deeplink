package com.forcom.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.Objects;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtCode = findViewById(R.id.txtCode);

        Intent intent = getIntent();
        Uri uri = intent.getData();
        String code = "";

        if (uri!=null){
            code = uri.getQueryParameter("code");
        }

        if (!TextUtils.isEmpty(code)){
            txtCode.setText(code);
        }
    }
}
