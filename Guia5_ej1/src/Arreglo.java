
public class Arreglo {

    public static void sumarLista(int[] vector1) {

        int suma = 0;
        int promedio = 0;
        int cent = 0;

        for (int i = 0; i < vector1.length; i++) {

            System.out.println("sumando posicion " + i);
            cent++;
            suma += vector1[i];

        }

        promedio = suma / cent;

        System.out.println("------------------------------------------");
        System.out.println("ESTE ES EL VECTOR");
        System.out.println("------------------------------------------");
        for (int i = 0; i < vector1.length; i++) {

            System.out.print("" + vector1[i]);

        }
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("ESTA ES LA SUMA " + suma);
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("Y ESTE ES EL PRIMEDIO " + promedio);

    }

    public static void buscarMayor(int[][] matriz1) {

        int elElegido = matriz1[0][0];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < matriz1[i].length; j++) {

                if (matriz1[i][j] > elElegido) {
                    elElegido = matriz1[i][j];
                }

            }

        }

        System.out.println("el elemento mayor es " + elElegido);

    }

    public static int cuentaVocales(String cadena) {

        int cantidadVocales = 0;
        int aux = 0;
        char[] vectorFantasma = new char[cadena.length()];

        //meto la palabra en un arreglo
        for (int i = 0; i < cadena.length(); i++) {

            vectorFantasma[i] = cadena.charAt(i);

        }

        for (int i = 0; i < cadena.length(); i++) {

            if (vectorFantasma[i] == 'a' || vectorFantasma[i] == 'e' || vectorFantasma[i] == 'i' || vectorFantasma[i] == 'o' || vectorFantasma[i] == 'u') {
                cantidadVocales++;
            }

        }

        return cantidadVocales;

    }

    public static int cuentaCaracter(String cadena, char caracter) {

        int cantidadCaracter = 0;
        int aux = 0;
        char[] vectorFantasma = new char[cadena.length()];

        //meto la palabra en un arreglo
        for (int i = 0; i < cadena.length(); i++) {

            vectorFantasma[i] = cadena.charAt(i);

        }

        //verifico la cantidad de veces que se repitio el caracter
        for (int i = 0; i < cadena.length(); i++) {

            if (vectorFantasma[i] == caracter) {
                cantidadCaracter++;
            }

        }

        return cantidadCaracter;

    }


    
    
    
    
    
    
    
    
    
    
    

}
