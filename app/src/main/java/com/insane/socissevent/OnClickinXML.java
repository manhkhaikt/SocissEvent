package com.insane.socissevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class OnClickinXML extends AppCompatActivity   {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_tong(View view) {
        EditText edita = findViewById(R.id.edt_soa);
        EditText editb = findViewById(R.id.edt_sob);
        TextView dapan = findViewById(R.id.edt_da);
        int a=Integer.parseInt(edita.getText()+"");
        int b=Integer.parseInt(editb.getText()+"");
        dapan.setText((a+b)+"");

    }

}
