package com.example.wethtorang.qrcode;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
    private int REQUEST_CODE_CAMERA = 1;
    private IntentIntegrator integrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scan();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


            TextView textView = (TextView) findViewById(R.id.text);
            final IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
            textView.setText(result.getContents());

    }

    public void scan() {

        if (ActivityCompat.checkSelfPermission(MainActivity.this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{android.Manifest.permission.CAMERA},
                    REQUEST_CODE_CAMERA);
        } else {
            this.integrator = new IntentIntegrator(MainActivity.this);
            if (this.integrator == null)
                this.integrator = new IntentIntegrator(this);
            integrator.initiateScan();
        }
    }
}
