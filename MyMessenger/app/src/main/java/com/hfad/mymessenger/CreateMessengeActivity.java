package com.hfad.mymessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateMessengeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_messenge);
    }

    public void onSendMessage(View view){
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        startActivity(intent);

    }
}
