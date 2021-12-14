package com.appsol360.mathlibrary;

import android.content.Context;
import android.content.Intent;

public class Arithmatic extends OperationActivity {
    public static double Sum(double a, double b){

        return  a+b;
    }
    public static double Subtract(double a, double b){

        return  a-b;
    }
    public static double Divide(double a, double b){

        return  a/b;
    }
    public static double Multiply(double a, double b){

        return a*b;
    }
    public static void calculator(Context c) {
        c.startActivity(new Intent(c, OperationActivity.class));


    }
}
