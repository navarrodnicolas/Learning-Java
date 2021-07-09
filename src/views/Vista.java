package views;

import model.Wallet;

public class Vista {
    
    public static void main2(String[] args) {
        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        //wallet1.getSaldo() Así obtengo el saldo de la Wallet creada en Waller.java
        System.out.println(wallet1.getSaldo());
        System.out.println(wallet1.saveMoney(200000));
        System.out.println(wallet1.saveMoney(300000));
        System.out.println(wallet1.breakLimit());
        System.out.println(wallet1.saveMoney(600000));
        //De esto se trata la programación orientada a objetos donde podemos crear
        //diferentes objetos e ir haciendo pruebas en la misma consola
        System.out.println(wallet2.getSaldo());
        System.out.println(wallet2.establecerMeta(1100000));          
        System.out.println(wallet1.establecerMeta(900000));          
        System.out.println(wallet1.establecerMeta(1900000));          
        System.out.println(wallet1.saveMoney(1200000));
    }

}
