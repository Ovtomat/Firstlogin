package com.example.hyperpc.forlogin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Enter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        Button b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login="Ludo";
                String password="!@#$";
                EditText et=findViewById(R.id.editText);
                EditText et2=findViewById(R.id.editText2);
                TextView result=findViewById(R.id.textView);
                String a=((EditText)findViewById(R.id.editText)).getText().toString();
                String b=((EditText)findViewById(R.id.editText2)).getText().toString();
                if (login.equals(a)&&password.equals(b)){
                    result.setText("Вы вошли");
                    result.setTextColor(Color.GREEN);

                }else{
                    result.setText("Неверные логин или пароль");
                    result.setTextColor(Color.RED);
                }
                et.setText("");
                et2.setText("");
            }

        });
    }
}
