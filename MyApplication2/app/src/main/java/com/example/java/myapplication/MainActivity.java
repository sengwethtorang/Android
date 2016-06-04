package com.example.java.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_click;
    private TextView text_counter;
    private Integer count;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initview();
//        buttonclick();
        Button button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText editText = (EditText) findViewById(R.id.editText);
                String string = editText.getText().toString();

//                LinkPage with Input
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("Word",string);
                startActivity(intent);
            }
        });
    }
//    private void initview(){
//        btn_click = (Button)this.findViewById(R.id.button);
//        text_counter = (TextView)this.findViewById(R.id.textView);
//        count = 0;
//    }
//    private void buttonclick(){
//        btn_click.setOnClickListener(new View.OnClickListener(){
//            @Override
//
//            public void onClick(View v){
//                btn_click.setBackgroundColor(Color.BLUE);
//                count = count+1;
//                text_counter.setText(count.toString());
//            }
//        });
//        btn_click.setOnTouchListener(new View.OnTouchListener(){
//            @Override
//            public boolean onTouch(View v, MotionEvent event){
//                btn_click.setBackgroundColor(Color.GREEN);
//                return false;
//            }
//        });
//    }
}
