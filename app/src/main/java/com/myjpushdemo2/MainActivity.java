package com.myjpushdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_push;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_push = (Button) findViewById(R.id.btn_push);
        btn_push.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_push: {
                // JPushInterface.setAlias(this, "", null);
                String rid = JPushInterface.getRegistrationID(getApplicationContext());

                Toast.makeText(this, rid, Toast.LENGTH_SHORT).show();
                break;
            }
            default: {
                break;
            }
        }
    }
}
