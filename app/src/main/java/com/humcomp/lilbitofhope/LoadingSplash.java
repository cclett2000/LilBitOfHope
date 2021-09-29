/*
 * Charles Lett Jr.
 * Program 1 (A Little Bit of Hope)
 * CS-3203 (12:30 Tue, Thur)
 * splash screen; called in main
 */

package com.humcomp.lilbitofhope;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.Thread;

public class LoadingSplash extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent LoadSplash = new Intent(this, MainActivity.class);
        startActivity(LoadSplash);
        finish();

    }

}

    /*
    //Thread: just messing around to see how I can get it to work, may improve app performance
    //        in the future? (multi-threading)
    //Thread appThread1 = new Thread();
    //appThread1.start();

    try {
        Thread.sleep(0); //must use 'Thread' and not thread name?
    }

    catch (InterruptedException e) {
        e.printStackTrace();
    }

    */