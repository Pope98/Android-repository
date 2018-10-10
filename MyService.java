package com.example.povilas.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

// #4 access granted, continue code
public class MyService extends Service {

    // #2 create binder
    private final IBinder myBinder = new MyLocalBinder();

    public MyService() {
    }


    // #1 seek binder
    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    public String getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss", Locale.GERMANY);
        return (df.format(new Date()));
    }

    // #3 get access to service
    public class MyLocalBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }



}
