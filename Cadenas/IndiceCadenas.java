


public class IndiceCadenas {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";

        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter:" + " " + primerCaracter);
        // Recuperar el ultimo caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter:" + " " + ultimoCaracter);

        // Recuperar la letra M de la cadena
        var letraM = cadena1.charAt(5);
        System.out.println("letraM: " + letraM);

    }

}