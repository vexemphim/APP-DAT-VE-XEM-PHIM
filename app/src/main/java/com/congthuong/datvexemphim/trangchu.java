package com.congthuong.datvexemphim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Spinner;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.view.View.OnClickListener;
import android.app.AlertDialog;


public class trangchu extends AppCompatActivity {


    EditText ten;
    EditText sdt;
    EditText email;
    EditText baprang;
    EditText nuocngot;
    EditText soluongve;

    Switch hoivien;
    Spinner thanhtoan;
    CheckBox a1;
    CheckBox a2;
    CheckBox a3;
    CheckBox a4;
    CheckBox a5;
    CheckBox a6;
    CheckBox b1;
    CheckBox b2;
    CheckBox b3;
    CheckBox b4;
    CheckBox b5;
    CheckBox b6;
    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    CheckBox c4;
    CheckBox c5;
    Button xacnhan;
    Button huy;




    Button xn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);

        xn = (Button) findViewById(R.id.btnxacnhan);
        xn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, HoaDon.class);
                startActivity(intent);
            }
        });

        final EditText ten = (EditText) findViewById(R.id.editTên);
        final EditText sdt = (EditText) findViewById(R.id.editSĐT);
        final EditText email = (EditText) findViewById(R.id.editemail);
        final EditText baprang = (EditText) findViewById(R.id.edbaprang);
        final EditText nuocngot = (EditText) findViewById(R.id.ednuocngot);
        final EditText soluongve = (EditText) findViewById(R.id.edsoluong);
        final Switch hoivien = (Switch) findViewById(R.id.switch2);
        final Spinner thanhtoan = (Spinner) findViewById(R.id.spinner2);
        final Spinner chonphim = (Spinner) findViewById(R.id.spinner);
        final CheckBox a1 = (CheckBox) findViewById(R.id.checkBox1);
        final Button huy = (Button) findViewById(R.id.btnhuy);
        final Button xacnhan = (Button) findViewById(R.id.btnxacnhan);

        xacnhan.setOnClickListener(new View.OnClickListener() {
                                               public void onClick(View v) {


                                                   String msg = "TÊN: " + ten.getText().toString() +
                                                           System.getProperty("line.separator") +
                                                           "SỐ ĐIỆN THOẠI: " + sdt.getText().toString()
                                                           + System.getProperty("line.separator") + "EMAIL: " + email.getText().toString();


                                                   ten.setText("");
                                                   sdt.setText("");
                                                   email.setText("");

                                                   msg += System.getProperty("line.separator") + "PHIM CỦA BẠN" +
                                                           chonphim.getSelectedItem().toString();



                                                   msg +=  System.getProperty("line.separator") +"BẮP RANG: " + baprang.getText().toString() +
                                                           System.getProperty("line.separator") +
                                                           "NƯỚC NGỌT: " + nuocngot.getText().toString()
                                                           + System.getProperty("line.separator") + "SỐ LƯỢNG VÉ: " + soluongve.getText().toString();

                                                   msg += System.getProperty("line.separator") + "HỘI VIÊN: ";

                                                   if(hoivien.isChecked())
                                                       msg += "CÓ";
                                                   else
                                                       msg += "KHÔNG";

                                                   msg += System.getProperty("line.separator") + "THANH TOÁN: " +
                                                           thanhtoan.getSelectedItem().toString();


                                                   if(a1.isChecked())
                                                       msg +=  a1.getText().toString()+ ", ";
                                                   if(a2.isChecked())
                                                       msg += a2.getText().toString() + ", ";
                                                   if(a3.isChecked())
                                                       msg += a3.getText().toString()+ ",  ";


                                                   info(v, msg);

                                               }
                                           }
        );
        huy.setOnClickListener(new View.OnClickListener() {
                                         public void onClick(View v) {
                                             cancel(v);
                                         }
                                     }
        );
    }
    public void cancel(View v) {
        System.exit(0);
    }

    public void info(View v, String msg) {
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("VÉ CỦA BẠN");
        dlgAlert.setPositiveButton("CHẤP NHẬN", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }






}
