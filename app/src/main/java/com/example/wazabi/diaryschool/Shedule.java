package com.example.wazabi.diaryschool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Shedule extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shedule);
    }

    public void smsSend(View view) {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            String msg = ((TextView) findViewById(R.id.sheduleText)).getText().toString();
            intent1.putExtra("sms_body", msg);
            intent1.setType("vnd.android-dir/mms-sms");
            startActivity(intent1);
    }
}
