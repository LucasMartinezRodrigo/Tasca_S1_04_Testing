package org.itacademy.javatesting.junit.N1_Ex2;

public class CalculoDni {

    private final char [] alpha = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public char calculaLletra(int numDNI){
        return alpha[numDNI % 23];
    }

}
