package EAC2;

import java.util.Scanner;

public class JocsOlimpics2 {

    
     
        public static void main(String[] args) {
        
        //Creació interactiva dels objectes necessaris per assignar una medalla
        //Aquí et sentiràs com un campió olímpic!
        System.out.println("*** GUANYA LA TEVA MEDALLA ****");  
        System.out.print("Quin és el teu país? ");
        Scanner scan = new Scanner(System.in);
        String nomPais = scan.nextLine();
        Pais elTeuPais = new Pais(nomPais);
        System.out.print("Quin és el teu nom? ");
        String elTeuNom = scan.nextLine();
        System.out.print("Quin és el teu esport favorit? ");
        String elTeuEsport = scan.nextLine();
        Atleta tu = new Atleta(elTeuNom, elTeuPais, elTeuEsport);
        System.out.print("En quina posició has quedat (1, 2 o 3)? ");
        int laTevaPosicio = scan.nextInt();
        Medalla laTevaMedalla = new Medalla(laTevaPosicio, tu);
        System.out.println(laTevaMedalla.descripcio() );

        scan.close();

    }
}
