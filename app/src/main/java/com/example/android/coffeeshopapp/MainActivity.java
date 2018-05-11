package com.example.android.coffeeshopapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int dvQuantity = 0;
    public static int pQuantity = 0;
    public static int fQuantity = 0;
    public static int vQuantity = 0;
    public static int ccQuantity = 0;
    public static int nvQuantity = 0;
    public static int cfQuantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            dvQuantity = savedInstanceState.getInt(D_Q);
            pQuantity = savedInstanceState.getInt(P_Q);
            fQuantity = savedInstanceState.getInt(F_Q);
            vQuantity = savedInstanceState.getInt(V_Q);
            ccQuantity = savedInstanceState.getInt(CC_Q);
            nvQuantity = savedInstanceState.getInt(NV_Q);
            cfQuantity = savedInstanceState.getInt(CF_Q);
            TextView q1 = (TextView) findViewById (R.id.deluxe_quantity);
            q1.setText("" + dvQuantity);
            TextView q2 = (TextView) findViewById (R.id.paneer_quantity);
            q2.setText("" + pQuantity);
            TextView q3 = (TextView) findViewById (R.id.veggie_quantity);
            q3.setText("" + fQuantity);
            TextView q4 = (TextView) findViewById(R.id.paradise_quantity);
            q4.setText("" + vQuantity);
            TextView q5 = (TextView) findViewById(R.id.corn_quantity);
            q5.setText("" + ccQuantity);
            TextView q6 = (TextView) findViewById(R.id.nv_quantity);
            q6.setText("" + nvQuantity);
            TextView q7 = (TextView) findViewById(R.id.chicken_quantity);
            q7.setText("" + cfQuantity);

        }

    }
    public void OrderDeluxe(View view){
        dvQuantity = dvQuantity + 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void OrderPaneer(View view){
        pQuantity = pQuantity + 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void OrderVeggie(View view){
        fQuantity = fQuantity + 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void OrderParadise(View view){
        vQuantity = vQuantity + 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void OrderCorn(View view){
        ccQuantity = ccQuantity + 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void OrderNv(View view){
        nvQuantity = nvQuantity + 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void OrderChicken(View view){
        cfQuantity = cfQuantity + 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void ReduceDeluxe(View view){
       if (dvQuantity>0)
            dvQuantity -= 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void ReducePaneer(View view){
        if (pQuantity>0)
            pQuantity -= 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void ReduceVeggie(View view){
        if (fQuantity>0)
            fQuantity -= 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void ReduceParadise(View view){
        if (vQuantity>0)
            vQuantity -= 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void ReduceCorn(View view){
        if (ccQuantity>0)
            ccQuantity -= 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void ReduceNV(View view){
        if (nvQuantity>0)
            nvQuantity -= 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void ReduceChicken(View view){
        if (cfQuantity>0)
            cfQuantity -= 1;
        displayPrice(dvQuantity,pQuantity,fQuantity,vQuantity,ccQuantity,nvQuantity,cfQuantity);
    }
    public void displayPrice(int dvQuantity,int pQuantity,int fQuantity,int vQuantity,int ccQuantity,int nvQuantity,int cfQuantity) {
        TextView dveggie = (TextView) findViewById(R.id.deluxe_quantity);
        dveggie.setText(" " + dvQuantity);
        TextView pveggie = (TextView) findViewById(R.id.paneer_quantity);
        pveggie.setText(" " + pQuantity);
        TextView fveggie = (TextView) findViewById(R.id.veggie_quantity);
        fveggie.setText(" " + fQuantity);
        TextView vpveggie = (TextView) findViewById(R.id.paradise_quantity);
        vpveggie.setText(" " + vQuantity);
        TextView ccveggie = (TextView) findViewById(R.id.corn_quantity);
        ccveggie.setText(" " + ccQuantity);
        TextView nvveggie = (TextView) findViewById(R.id.nv_quantity);
        nvveggie.setText(" " + nvQuantity);
        TextView cveggie = (TextView) findViewById(R.id.chicken_quantity);
        cveggie.setText(" " + cfQuantity);
    }
    public void Ordering(View view) {
        Intent sendOrderedList = new Intent(this, Order.class);
        startActivity(sendOrderedList);
    }
    public static String D_Q = "dvQuantity";
    public static String P_Q = "pQuantity";
    public static String F_Q = "fQuantity";
    public static String V_Q = "vQuantity";
    public static String CC_Q = "ccQuantity";
    public static String NV_Q = "nvQuantity";
    public static String CF_Q = "cfQuantity";
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt(D_Q,dvQuantity);
        savedInstanceState.putInt(P_Q,pQuantity);
        savedInstanceState.putInt(F_Q,fQuantity);
        savedInstanceState.putInt(V_Q,vQuantity);
        savedInstanceState.putInt(CC_Q,ccQuantity);
        savedInstanceState.putInt(NV_Q,nvQuantity);
        savedInstanceState.putInt(CF_Q,cfQuantity);
        super.onSaveInstanceState(savedInstanceState);
    }
}
