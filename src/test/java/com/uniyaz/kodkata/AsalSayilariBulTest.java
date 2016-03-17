package com.uniyaz.kodkata;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by M.UNLU on 16.03.2016.
 */
public class AsalSayilariBulTest {

    @Test
    public void toplam_asal_sayi() throws Exception {

        AsalSayilariBul asalSayilariBul = new AsalSayilariBul();
        Assert.assertEquals(9592,asalSayilariBul.asalSayiBul(100000));
    }

    @Test
    public void ilk_test(){
        AsalSayilariBul asalSayilariBul = new AsalSayilariBul();
        Assert.assertTrue(asalSayilariBul.asalSayimi(37357));
    }

    @Test
    public void ikinci_test(){
        AsalSayilariBul asalSayilariBul = new AsalSayilariBul();
        Assert.assertTrue(asalSayilariBul.asalSayimi(67577));
    }
}
