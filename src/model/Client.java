package model;

public class Client extends User {
    private Wallet wallet;

    public Client(String nNombre) {
        super();
        wallet = new Wallet();
        setNombre("Hola");
        setNombre(nNombre);
    }

    public Wallet getWallet() {
        return wallet;
    }

    
}
