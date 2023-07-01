package com.kostyanetskaya.epamjavastudy.lesson6.secunda;

import com.kostyanetskaya.epamjavastudy.lesson6.Alfa;

public class Beta extends Alfa{
    public void service () {
        Alfa alfa = new Alfa();
        alfa.action();

        commit();
    }
}
