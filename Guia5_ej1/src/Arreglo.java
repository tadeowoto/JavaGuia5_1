



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


    
    public static void buscarMayor(int [][]matriz1){
        
    }

  
    
}
