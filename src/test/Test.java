package test;

import model.Client;

public class Test {

    public static void main(String[] args) {
        Test iniciarPruebas = new Test();
        iniciarPruebas.escenarioClient();
    }

    public void escenarioClient(){
        Client cliente1 = new Client("Esteban");
        boolean test1 = assertEquals("Esteban",cliente1.getNombre());
        boolean test2 = assertNotNull(cliente1.getWallet());
        //(condition)? responseTrue: responseFalse --> Este es el operador ternario de Java
        System.out.println((test1)? "Pasó la prueba de nombre":"Error el nombre no es igual");
        System.out.println((test2)? "Existe la Wallet":"Error NO existe la Wallet");

    }
    
    public boolean assertEquals(String expected, String received){
        if(expected.equalsIgnoreCase(received)) {
            return true;
        }
        return false;
    }

    public boolean assertNotNull(Object objeto){
        if(objeto != null){
            return true;
        }
        return false;
    }

}
