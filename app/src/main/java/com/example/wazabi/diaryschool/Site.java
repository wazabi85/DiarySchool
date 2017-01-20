package com.example.wazabi.diaryschool;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class Site extends Activity {

    public String[] zakl = {" ","http://nike.com", "http://yandex.ru", "http://rambler.ru", "http://mail.ru", "http://duckduckgo.com"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,zakl);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        final Spinner spin = (Spinner) findViewById(R.id.spinnerSite);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(zakl[i]));
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


//    public void sendSMS(View view) {
//        Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
//        emailintent.setType("plain/text");
//        emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {"wazabi@mail.ru" });
//        emailintent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
//        emailintent.putExtra(android.content.Intent.EXTRA_TEXT,"");
//        startActivity(Intent.createChooser(emailintent, "Send mail..."));
//    }





}
