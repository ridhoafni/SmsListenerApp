package com.example.anonymous.smslistenerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SmsReceiverActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvSmsForm;
    private TextView tvSmsMessage;
    private Button btnClose;
    private static final String EXTRA_SMS_NO = "extra_sms_no";
    private static final String EXTRA_SMS_MESSAGE = "extra_sms_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_receiver);
        tvSmsForm = (TextView) findViewById(R.id.tv_no);
        tvSmsMessage = (TextView) findViewById(R.id.tv_message);
        btnClose.setOnClickListener(this);

        String senderNo = getIntent().getStringExtra(EXTRA_SMS_NO);
        String senderMessage = getIntent().getStringExtra(EXTRA_SMS_MESSAGE);
        tvSmsForm.setText("from :"+senderNo);
        tvSmsMessage.setText("from :"+senderMessage);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_close){
            finish();
        }
    }
}
