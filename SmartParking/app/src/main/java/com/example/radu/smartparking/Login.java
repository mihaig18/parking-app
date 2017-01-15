package com.example.radu.smartparking;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.util.Log;
import android.view.View;
import android.content.Intent;
/**
 * Created by radu on 1/15/2017.
 * Login activity.
 */
public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("-------MyDebug------", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    // On "SkipLogin" button, MainActivity will be opened
    public void onButtonClick(View v){
        if (v.getId() == R.id.Blogin)
        {
            Intent i = new Intent(Login.this, MainActivity.class);
            startActivity(i);
        }
    }
}
