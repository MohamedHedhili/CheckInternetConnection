package com.mohamedhedhili.checkinternetconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn   ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button) findViewById(R.id.btn) ;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InternetConnection check  = new InternetConnection(getApplicationContext());
                Boolean ch  =check.IsConnected() ;
                if (!ch)
                {
                    Toast.makeText(MainActivity.this, "Check your internet connection ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
