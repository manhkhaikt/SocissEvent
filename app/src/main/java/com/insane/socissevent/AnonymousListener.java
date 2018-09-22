package com.insane.socissevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AnonymousListener extends AppCompatActivity  {
    Button btn_tong;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anonymous);
        btn_tong = findViewById(R.id.btn_tong);

        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edita = findViewById(R.id.edt_soa);
                EditText editb = findViewById(R.id.edt_sob);
                TextView dapan = findViewById(R.id.edt_da);
                int a=Integer.parseInt(edita.getText()+"");
                int b=Integer.parseInt(editb.getText()+"");
                dapan.setText((a+b)+"");



            }
        });

    }


}
