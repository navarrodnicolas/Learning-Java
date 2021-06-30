public class App {

    private String nombre;
    private int edad;
    private char sexo;
    private double estatura;
    private float peso;
    private boolean estadoCivil;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Tipos de datos y variables:
        String res = "Hola";
        int resultado = 15 + 32;
        int resultado3 = 15 - 32;
        double resultado2 = 25 / 3;
        float resultado4 = 58 * 21;
        int resultado5 = 21 % 9;
        /**Operadores unarios:
         * Son los que trabajan con un sólo valor.
         * Permiten cambiar el valor de una variable.*/
        resultado++; //Esto es como si le sumara 1 es igual a decir resultado = resultado + 1
        resultado--; //resultado = resultado - 1
        resultado = -resultado;
        resultado = +resultado;
        /**Operadores lógicos o relacionales
         * Lo que buscan es obtener un resultado que está entre verdadero y falso*/
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 >= 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8; //Esto significa que es diferente !=
        respuesta = 5 == 8; // == significa si es igual, porque un sólo = es para asignar.
        //Conectores
        respuesta = 12 < 5 && 4 > 1; //Es el AND (& se llama ampersand)
        respuesta = 14 < 25 || 1 > 5; //Esto significa OR (Para sacar el símbolo hago alt + 1)
        //Operadores bit a bit
        // &
        // ^
        // |

        //Estructuras de control
        if (respuesta){
            //bloque de código
        }

        if (respuesta) {
            //bloque de código
        } else {
            //bloque de código
        }

        if (respuesta) {
            //bloque de código
        } else if(respuesta){
            //bloque de código
        }

    }
}

// Así se hace un comentario
        /**
         * ASí se crea 
         * un comentario
         * de varias líneas
         */