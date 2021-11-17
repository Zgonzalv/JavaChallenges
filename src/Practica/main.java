package Practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner numeroEliminado = new Scanner(System.in);
        int borrar;
        int contador=0;
        List<Integer> lista = new ArrayList<>(5);
        //int[]lista= new int[4];
        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(900));
            contador +=lista.get(i);

        }

        //Imprimir respuesta

       /*/ String respuesta = " ";
        for (int i = 0; i < lista.length; i++) {

                respuesta = respuesta + " " + lista[i];

            respuesta = respuesta + "\n";
        }
        System.out.println(respuesta);
    }

/*


        */
        System.out.println("No ordenados");
        lista.forEach(System.out::println);
        System.out.println("La suma de los numeros es igual a: "+contador+"\n");

        System.out.println("Digita valor a eliminar: ");
        borrar = numeroEliminado.nextInt();

        for (int i = 0; i < lista.size(); i++) {
            // System.out.println(lista.get(i));

            if (lista.get(i).equals(borrar)) {
                lista.remove(i);
            }
        }


        System.out.println(lista + "\n");

    }
}

