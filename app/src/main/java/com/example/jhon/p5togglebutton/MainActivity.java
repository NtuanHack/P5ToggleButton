package com.example.jhon.p5togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton btn1,btn2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ToggleButton) findViewById(R.id.tgl_btn1);
        btn2 = (ToggleButton) findViewById(R.id.tgl_btn2);

        btn = (Button) findViewById(R.id.bt_toggle);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("Status ToggleButton1 : ").append(btn1.isChecked());
                result.append("\nStatus ToggleButton2 : ").append(btn2.isChecked());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
