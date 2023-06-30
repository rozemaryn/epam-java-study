package com.kostyanetskaya.epamjavastudy.lesson6.prima.secunda;

import com.kostyanetskaya.epamjavastudy.lesson6.prima.Alfa;

public class Beta extends Alfa{
    public void service () {
        Alfa alfa = new Alfa();
        alfa.action();

        commit();
    }
}
