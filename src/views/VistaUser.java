package views;

import model.Client;

public class VistaUser {
    public static void main(String[] args) {
        Client customer1 = new Client("Nicolás");
        Client customer2 = new Client("Navarro");
        String response = customer1.getNombre();
        String response2 = customer2.getNombre();
        System.out.println(response);
        System.out.println(response2);
        System.out.println((customer1.getWallet().saveMoney(10000)));
        String response3 = customer1.getWallet().compararCuenta(customer2.getWallet());
        System.out.println(response3);
    }

}
