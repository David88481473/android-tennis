package com.android.tennislive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button rank_btn;
    String RANK_ACTIVITY = "com.android.tennislive.RANK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rank_btn = (Button) findViewById(R.id.btn_ranking);
        rank_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ranking:
                Intent rank_intent = new Intent(RANK_ACTIVITY);
                startActivity(rank_intent);
                break;
            default:
                break;
        }
    }
}