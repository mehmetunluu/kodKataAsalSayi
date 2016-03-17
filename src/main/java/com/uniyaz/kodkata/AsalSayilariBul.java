package com.uniyaz.kodkata;

import java.util.Date;

/**
 * Created by M.UNLU on 16.03.2016.
 */
public class AsalSayilariBul {

    int count=1;
    public int asalSayiBul(int maxNumber){

        for (int i = 3; i <maxNumber ; i++) {
            if(asalSayimi(i)){
                count++;
            }
        }
        System.out.println("0'dan " +maxNumber+ " sayisina kadar " +count +" tane asal sayi var" );
        return  count;

    }

    public boolean asalSayimi(int number){
        int response=0;
        for (int i = 2; i <number ; i++) {
            response =number/i;
            /**
             * 25/2=12
             * 12*2=24
             */
            if(number==(i*response)){
                return  false;
            }
            else{
                continue;
            }
        }
        System.out.println(number);
        return  true;
    }
}
