package com.example.wazabi.diaryschool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Shedule extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shedule);
    }

    public void smsSend(View view) {
        try {
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
//            TextView textView = ;
            String msg = findViewById(R.id.textView1).getText().toString();

//            String msg = this.findViewById(R.id.textView1).toString();
            intent1.putExtra("sms_body", msg);
            intent1.setType("vnd.android-dir/mms-sms");

            startActivity(intent1);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Трабл", Toast.LENGTH_SHORT);
            e.printStackTrace();
        }

    }
}
