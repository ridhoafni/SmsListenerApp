package com.example.anonymous.smslistenerapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class SmsReceiver extends BroadcastReceiver {

    public SmsReceiver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
        final Bundle bundle = intent.getExtras();
        try {
            if (bundle != null){
                final Object[] pdusObj = (Object[]) bundle.get("pdus");
                for (int i = 0; i < pdusObj.length; i++){
                    SmsMessage curentMessage = getIncommingMessage(pdusObj[i],bundle);
                    String phoneNumber  = curentMessage.getDisplayOriginatingAddress();
                    String sendernumber = phoneNumber;
                    String message = curentMessage.getDisplayMessageBody();
                    Log.i("SmsReceiver", "SenderNumber"+sendernumber+"; message: "+message);
                }
            }
        }catch (){}

    }

    private SmsMessage getIncommingMessage(Object o, Bundle bundle) {
    }
}
