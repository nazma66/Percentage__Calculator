package com.nazma_humayra.percentage__calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1;
EditText editText1;
    EditText editText2;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.bt_1);
        editText1 = findViewById(R.id.et_1);
        editText2 = findViewById(R.id.et_2);
        editText3 = findViewById(R.id.et_3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(MainActivity.this, SecondActivity.class);
              String message1 = editText1.getText().toString().trim();
              ii.putExtra("name",message1);

                String message2s = editText2.getText().toString().trim();
                double message2 = Double.parseDouble(message2s);
                ii.putExtra("price", message2);

                String message3S = editText3.getText().toString().trim();
                double message3 = Double.parseDouble(message3S);
                ii.putExtra("quantity", message3);

                startActivity(ii);
            }
        });
    }
}