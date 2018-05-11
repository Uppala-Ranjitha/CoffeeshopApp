package com.example.android.coffeeshopapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.net.Uri;

public class Order extends AppCompatActivity{
    String msg = "";
    int tPrice = 0;
    int dPrice = 99;
    int pPrice = 110;
    int vPrice = 99;
    int vpPrice = 115;
    int ccPrice = 99;
    int nvPrice = 199;
    int cfPrice = 199;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Calculate();
    }
    public void GoBack(View view)
    {
        Intent GoToBack = new Intent(this, MainActivity.class);
        startActivity(GoToBack);
    }
    public void Calculate() {
        if (MainActivity.dvQuantity != 0) {
            msg = msg + "Deluxe Veggie Pizza-" + MainActivity.dvQuantity + "  \t  " + MainActivity.dvQuantity * dPrice + "/-\n";
            tPrice += MainActivity.dvQuantity * dPrice;
        }
        if (MainActivity.pQuantity != 0) {
            msg = msg + "Paneer Makhani Pizza-" + MainActivity.pQuantity + "  \t" + MainActivity.pQuantity * pPrice + "/-\n";
            tPrice += MainActivity.pQuantity * pPrice;
        }
        if (MainActivity.fQuantity != 0) {
            msg = msg + "Fresh Veggie Pizza-" + MainActivity.fQuantity + "      " + MainActivity.fQuantity * vPrice + "/-\n";
            tPrice += MainActivity.fQuantity * vPrice;
        }
        if (MainActivity.vQuantity != 0) {
            msg = msg + "Veggie Paradise Pizza-" + MainActivity.vQuantity + "  \t" + MainActivity.vQuantity * vpPrice + "/-\n";
            tPrice += MainActivity.vQuantity * vpPrice;
        }
        if (MainActivity.ccQuantity != 0) {
            msg = msg + "Cheese N Corn Pizza- " + MainActivity.ccQuantity + "  \t  " + MainActivity.ccQuantity * ccPrice + "/-\n";
            tPrice += MainActivity.ccQuantity * ccPrice;
        }
        if (MainActivity.nvQuantity != 0) {
            msg = msg + "NonVeg Supreme Pizza-" + MainActivity.nvQuantity + " \t" + MainActivity.nvQuantity * nvPrice + "/-\n";
            tPrice += MainActivity.nvQuantity * nvPrice;
        }
        if (MainActivity.cfQuantity != 0) {
            msg = msg + "Chicken Fiesta Pizza-" + MainActivity.cfQuantity + "     " + MainActivity.cfQuantity * cfPrice + "/-\n";
            tPrice += MainActivity.dvQuantity * cfPrice;
        }
        displayOrder(msg,tPrice);
    }
    public void displayOrder(String msg, int price){
        TextView txt = (TextView) findViewById(R.id.order_msg);
        txt.setText("" + msg);
        TextView tp = (TextView) findViewById (R.id.total_msg);
        tp.setText(" " + tPrice);
    }
    public void OrderConfirming(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
