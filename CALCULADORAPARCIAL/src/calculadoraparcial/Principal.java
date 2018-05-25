/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraparcial;

import java.io.*;

public class Principal {

    public static InputStreamReader Leer = new InputStreamReader(System.in);
    public static BufferedReader Teclado = new BufferedReader(Leer);


    public static void main(String[] args)throws IOException {

     System.out.println("DETERMINAR LA DISTANCIA ENTRE DOS PUNTOS");
     
     System.out.println("ingrese el primer punto en el origen de la x:");
     int x1  = Integer.parseInt(Teclado.readLine());

     System.out.println("ingrese el primer punto en el origen de las y");
     int y1  = Integer.parseInt(Teclado.readLine());

     System.out.println("ingrese el segundo punto en el origen de las x:");
     int x2  = Integer.parseInt(Teclado.readLine());

     System.out.println("ingrese el segundo punto en el origen de las y:");
     int y2  = Integer.parseInt(Teclado.readLine());

     System.out.println("la distancia entre los puntos es: ");

        Puntos objpunto = new Puntos(x1,x2,y1,y2);

        double distancia=objpunto.dis(x1,x2,y1,y2);

        System.out.println(distancia);
    }

}
