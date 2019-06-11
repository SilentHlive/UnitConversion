package com.example.unitconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtM,txtI,txtF,txtY,txtMi,txtNM;
    Button button1,button2;

    EditText txtKg,txtOn,txtPo,txtTp,txtSt,txtSTo,txtLT;
    Button button3,button4;

    EditText txtL,txtFluid,txtQua,txtG,txtImp;
    Button button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateDistance(View v){
        txtM = findViewById(R.id.editText);
        txtI = findViewById(R.id.editText4);
        txtF = findViewById(R.id.editText5);
        txtY = findViewById(R.id.editText6);
        txtMi  = findViewById(R.id.editText7);
        txtNM = findViewById(R.id.editText8);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        //RESET BUTTON
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtM.setText("");
                txtI.setText("");
                txtF.setText("");
                txtY.setText("");
                txtMi.setText("");
                txtNM.setText("");
            }
        });

        //CALCULATE BUTTON
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double t,nM,nI,nF,nY,nMi,nNM;
                String n = txtM.getText().toString();
                String n1 = txtI.getText().toString();
                String n2 = txtF.getText().toString();
                String n3 = txtY.getText().toString();
                String n4 = txtMi.getText().toString();
                String n5 = txtNM.getText().toString();


                if(n1.equals("")&& n2.equals("")&&n3.equals("")&&n4.equals("")&& n5.equals("")) {
                    t = Double.parseDouble(n);
                    nI = t * 39.3701;
                    nF = t * 3.28084;
                    nY = t * 1.09361;
                    nMi = t * 0.00062;
                    nNM = t * 0.00054;
                    txtM.setText(""+t);
                    txtI.setText(""+nI);
                    txtF.setText(""+nF);
                    txtY.setText(""+nY);
                    txtMi.setText(""+nMi);
                    txtNM.setText(""+nNM);
                }
                else if(n.equals("")&& n2.equals("")&&n3.equals("")&&n4.equals("")&& n5.equals("")) {
                    t=  Double.parseDouble(n1);
                    nM = t * 0.02540;
                    nF = t  * 0.083;
                    nY = t* 0.027778;
                    nMi = t* 0.000015783;
                    nNM = t * 0.000013706;
                    txtM.setText(""+nM);
                    txtI.setText(""+t);
                    txtF.setText(""+nF);
                    txtY.setText(""+nY);
                    txtMi.setText(""+nMi);
                    txtNM.setText(""+nNM);
                }
                else if(n.equals("")&& n1.equals("")&&n3.equals("")&&n4.equals("")&& n5.equals("")) {
                    t=  Double.parseDouble(n2);
                    nM = t /3.2808;
                    nI = t  * 12;
                    nY = t * 0.333;
                    nMi = t* 0.00019;
                    nNM = t * 0.000165;
                    txtM.setText(""+nM);
                    txtI.setText(""+nI);
                    txtF.setText(""+t);
                    txtY.setText(""+nY);
                    txtMi.setText(""+nMi);
                    txtNM.setText(""+nNM);
                }
                else if(n.equals("")&& n1.equals("")&&n2.equals("")&&n4.equals("")&& n5.equals("")) {
                    t=  Double.parseDouble(n3);
                    nM = t /1.0936;
                    nI = t  * 36;
                    nF = t* 3;
                    nMi = t* 0.00005618;
                    nNM = t * 0.00049342;
                    txtM.setText(""+nM);
                    txtI.setText(""+nI);
                    txtF.setText(""+nF);
                    txtY.setText(""+t);
                    txtMi.setText(""+nMi);
                    txtNM.setText(""+nNM);
                }
                else if(n.equals("")&& n1.equals("")&&n2.equals("")&&n3.equals("")&&  n5.equals("")) {
                    t=  Double.parseDouble(n4);
                    nM = t /0.000621;
                    nI = t * 63360;
                    nF = t * 5280;
                    nY = t * 1760 ;
                    nNM = t * 0.868;
                    txtM.setText(""+nM);
                    txtI.setText(""+nI);
                    txtF.setText(""+nF);
                    txtY.setText(""+nY);
                    txtMi.setText(""+t);
                    txtNM.setText(""+nNM);
                }
                else if(n.equals("")&& n1.equals("")&&n2.equals("")&&n3.equals("")&&
                        n4.equals("")) {
                    t=  Double.parseDouble(n5);
                    nM = t /0.00054;
                    nI = t * 72913.4;
                    nF = t * 6076.1;
                    nY = t * 2026.7;
                    nMi = t * 1.15078;
                    txtM.setText(""+nM);
                    txtI.setText(""+nI);
                    txtF.setText(""+nF);
                    txtY.setText(""+nY);
                    txtMi.setText(""+nMi);
                    txtNM.setText(""+t);
                }

            }
        });
    }

    public void calculateWeight(View v){
        txtKg = findViewById(R.id.editText15);
        txtOn = findViewById(R.id.editText14);
        txtPo = findViewById(R.id.editText13);
        txtTp = findViewById(R.id.editText12);
        txtSt = findViewById(R.id.editText11);
        txtSTo  = findViewById(R.id.editText10);
        txtLT= findViewById(R.id.editText9);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        //RESET BUTTON
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtKg.setText("");
                txtOn.setText("");
                txtPo.setText("");
                txtTp.setText("");
                txtSt.setText("");
                txtSTo.setText("");
                txtLT.setText("");
            }
        });

        //CALCULATE BUTTON
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e,wK,wO,wP,wT,wS,wST,wLT;
                String x = txtKg.getText().toString();
                String x1 = txtOn.getText().toString();
                String x2 = txtPo.getText().toString();
                String x3 = txtTp.getText().toString();
                String x4 = txtSt.getText().toString();
                String x5 = txtSTo.getText().toString();
                String x6 = txtLT.getText().toString();

                if(x1.equals("")&&x2.equals("")&&x3.equals("")&&x4.equals("")
                        &&x5.equals("")&&x6.equals("")) {
                    e = Double.parseDouble(x);
                    wO = e * 35.274;
                    wP = e * 2.2046;
                    wT = e * 2.67923;
                    wS = e * 0.15747;
                    wST = e* 0.0011023;
                    wLT = e * 0.000984;
                    txtKg.setText(""+e);
                    txtOn.setText(""+wO);
                    txtPo.setText(""+wP);
                    txtTp.setText(""+wT);
                    txtSt.setText(""+wS);
                    txtSTo.setText(""+wST);
                    txtLT.setText(""+wLT);
                }

                else if(x.equals("")&& x2.equals("")&&x3.equals("")&&
                        x4.equals("")&&x5.equals("")&&x6.equals("")) {
                    e = Double.parseDouble(x1);
                    wK = e / 35.274;
                    wP = e * 0.062500;
                    wT = e * 0.075955;
                    wS = e * 0.0044643;
                    wST = e* 0.000031250;
                    wLT = e * 0.000027902;
                    txtKg.setText(""+wK);
                    txtOn.setText(""+e);
                    txtPo.setText(""+wP);
                    txtTp.setText(""+wT);
                    txtSt.setText(""+wS);
                    txtSTo.setText(""+wST);
                    txtLT.setText(""+wLT);
                }
                else if(x.equals("")&& x1.equals("")&&x3.equals("")&&
                        x4.equals("")&&x5.equals("")&&x6.equals("")) {
                    e = Double.parseDouble(x2);
                    wK = e / 2.2046;
                    wO = e * 16.0;
                    wT = e * 1.2153;
                    wS = e * 0.071429;
                    wST = e* 0.0050000;
                    wLT = e * 0.00044643;
                    txtKg.setText(""+wK);
                    txtOn.setText(""+wO);
                    txtPo.setText(""+e);
                    txtTp.setText(""+wT);
                    txtSt.setText(""+wS);
                    txtSTo.setText(""+wST);
                    txtLT.setText(""+wLT);
                }

                else if(x.equals("")&& x1.equals("")&&x2.equals("")&&
                        x4.equals("")&&x5.equals("")&&x6.equals("")) {
                    e = Double.parseDouble(x3);
                    wK = e / 2.6792;
                    wO = e * 13.166;
                    wP = e * 0.82286;
                    wS = e * 0.058776;
                    wST = e* 0.00041143;
                    wLT = e * 0.00036735;
                    txtKg.setText(""+wK);
                    txtOn.setText(""+wO);
                    txtPo.setText(""+wP);
                    txtTp.setText(""+e);
                    txtSt.setText(""+wS);
                    txtSTo.setText(""+wST);
                    txtLT.setText(""+wLT);
                }
                else if(x.equals("")&& x1.equals("")&&x2.equals("")&&
                        x3.equals("")&&x5.equals("")&&x6.equals("")) {
                    e = Double.parseDouble(x4);
                    wK = e / 0.15747;
                    wO = e * 224.0;
                    wP = e * 14.0;
                    wT = e * 17.014;
                    wST = e* 0.007;
                    wLT = e * 0.00625;
                    txtKg.setText(""+wK);
                    txtOn.setText(""+wO);
                    txtPo.setText(""+wP);
                    txtTp.setText(""+wT);
                    txtSt.setText(""+e);
                    txtSTo.setText(""+wST);
                    txtLT.setText(""+wLT);
                }
                else if(x.equals("")&& x1.equals("")&&x2.equals("")&&
                        x3.equals("")&&x4.equals("")&&x6.equals("")) {
                    e = Double.parseDouble(x5);
                    wK = e / 0.0011023;
                    wO = e * 32000;
                    wP = e * 2000.0;
                    wT = e * 2430.6;
                    wS = e* 142.86;
                    wLT = e * 0.89286;
                    txtKg.setText(""+wK);
                    txtOn.setText(""+wO);
                    txtPo.setText(""+wP);
                    txtTp.setText(""+wT);
                    txtSt.setText(""+wS);
                    txtSTo.setText(""+e);
                    txtLT.setText(""+wLT);
                }
                else if(x.equals("")&& x1.equals("")&&x2.equals("")&&
                        x3.equals("")&&x4.equals("")&&x5.equals("")) {
                    e = Double.parseDouble(x6);
                    wK = e / 0.00098421;
                    wO = e * 35840;
                    wP = e * 2240.0;
                    wT = e * 2722.2;
                    wS = e* 160.00;
                    wST = e * 1.1200;
                    txtKg.setText(""+wK);
                    txtOn.setText(""+wO);
                    txtPo.setText(""+wP);
                    txtTp.setText(""+wT);
                    txtSt.setText(""+wS);
                    txtSTo.setText(""+wST);
                    txtLT.setText(""+e);
                }
            }
        });
    }

    public void calculateVolume(View v){
        txtL = findViewById(R.id.editText19);
        txtFluid = findViewById(R.id.editText20);
        txtQua = findViewById(R.id.editText21);
        txtG = findViewById(R.id.editText22);
        txtImp  = findViewById(R.id.editText23);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        //RESET BUTTON
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtL.setText("");
                txtFluid.setText("");
                txtQua.setText("");
                txtG.setText("");
                txtImp.setText("");
            }
        });

        //String.format("Value of a: %.2f", a)
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m,vL,vFl,vQ,vG,vImp;
                String y = txtL.getText().toString();
                String y1 = txtFluid.getText().toString();
                String y2 = txtQua.getText().toString();
                String y3 = txtG.getText().toString();
                String y4 = txtImp.getText().toString();

                if(y1.equals("")&& y2.equals("")&&y3.equals("")&&y4.equals("")) {
                    m = Double.parseDouble(y);
                    vFl = m * 33.814;
                    vQ= m * 1.0567;
                    vG = m * 0.26417;
                    vImp = m * 0.21997;
                    txtL.setText(""+m);
                    txtFluid.setText(""+vFl);
                    txtQua.setText(""+vQ);
                    txtG.setText(""+vG);
                    txtImp.setText(""+vImp);
                }
                else if(y.equals("")&& y2.equals("")&&y3.equals("")&&y4.equals("")) {
                    m = Double.parseDouble(y1);
                    vL = m / 33.814;
                    vQ= m * 0.031250;
                    vG = m * 0.0078125;
                    vImp = m * 0.0065053;
                    txtL.setText(""+vL);
                    txtFluid.setText(""+m);
                    txtQua.setText(""+vQ);
                    txtG.setText(""+vG);
                    txtImp.setText(""+vImp);
                }
                else if(y.equals("")&& y1.equals("")&&y3.equals("")&&y4.equals("")) {
                    m = Double.parseDouble(y2);
                    vL = m / 1.0567;
                    vFl = m * 32.000;
                    vG = m * 0.25000;
                    vImp = m * 0.20817;
                    txtL.setText(""+vL);
                    txtFluid.setText(""+vFl);
                    txtQua.setText(""+m);
                    txtG.setText(""+vG);
                    txtImp.setText(""+vImp);
                }
                else if(y.equals("")&& y1.equals("")&&y2.equals("")&&y4.equals("")) {
                    m = Double.parseDouble(y3);
                    vL = m / 0.26417;
                    vFl = m * 128.00;
                    vQ = m * 4.0000;
                    vImp = m * 0.83267;
                    txtL.setText(""+vL);
                    txtFluid.setText(""+vFl);
                    txtQua.setText(""+vQ);
                    txtG.setText(""+m);
                    txtImp.setText(""+vImp);
                }
                else if(y.equals("")&& y1.equals("")&&y2.equals("")&&y3.equals("")) {
                    m = Double.parseDouble(y4);
                    vL = m / 0.21997;
                    vFl = m * 153.72;
                    vQ = m * 4.8038;
                    vG = m * 1.2009;
                    txtL.setText(""+vL);
                    txtFluid.setText(""+vFl);
                    txtQua.setText(""+vQ);
                    txtG.setText(""+vG);
                    txtImp.setText(""+m);
                }
            }
        });

    }
}