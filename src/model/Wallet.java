package model; //Me muestra donde está el archivo localizado, en qué carpeta o paquete

public class Wallet {
    //Para el saldo, crearemos una constante. Su valor NO cambia. 
    //Comunmente las constantes son públicas porque se acceden a través de la clase.
    //En JAVA los nombres de las constantes van en mayúscula y los espacios con _
    //Eso no es obligatorio, pero es una buena práctica.
    public static final int CAPACIDAD_MAXIMA = 1000000;
    
    //Los atributos son privados, por eso se crean así:
    private int saldo;
    private boolean tieneLimite; 
    private int meta;

    //¿Cómo crear un método constructor? escribiendo ctor
    //1. Nombre del método es igual al nombre de la clase
    //2. No retorna nada, no tiene ningun tipo de dato.
    //3. Es público   

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
    }

    //Esto es un getter
    public int getSaldo(){
        return saldo;
    }

    public boolean getTieneLimite(){
        return tieneLimite;
    }

    public boolean establecerMeta(int value){
        if(value==0){
            meta = value;
            return true;
        }        
        if(value < 0 || value <= saldo || (value > CAPACIDAD_MAXIMA && tieneLimite)){
            return false;
        }        
        meta = value;
        return true;
    }

    public boolean verificarMeta(){
        if(meta == 0 || saldo < meta){
            return false;
        }
        return true;
    }

    public void setTieneLimite(boolean newTieneLimite){
        this.tieneLimite = newTieneLimite;
    }

    public String saveMoney(int value){
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite){
            return "No se puede superar el límite de " + CAPACIDAD_MAXIMA;
        }
        saldo += value; //saldo = saldo + value
        if(verificarMeta()){System.out.println("Has cumplido la meta!");}
        return "Transacción exitosa, su nuevo saldo es " + saldo;
    }

    public String getMoney(int value){
        if (value <= saldo){
            saldo -= value;
            return "Retiro exitoso, su nuevo saldo es " + saldo;
        }
        return "Saldo insuficiente, su saldo es: " + saldo;
    }

    public String breakLimit(){
        if (!tieneLimite){ //Esto es como preguntar que NO tiene límites. ! es una negación.
            return "¡Tu cuenta no tiene límites!";
        }
        if (saldo >= 10000){
            saldo -= 10000;
            setTieneLimite(false); // Esto es igual a tieneLimite = false;
            return "Haz roto los límites";
        }
        return "No tienes saldo suficiente ";
    }

    public String compararCuenta(Wallet otraWallet) {
        if(saldo == otraWallet.getSaldo()){
            return "Las cuentas tienen el mismo saldo";
        }
        if(saldo > otraWallet.getSaldo()){
            return "La primera cuenta es mayor";
        }
        return "La segunda cuenta es mayor";
    }

}
