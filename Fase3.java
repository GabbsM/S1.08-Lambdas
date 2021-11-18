package Exercici_01;

        ////////////////////////////////FASE 3/////////////////////////////////////////////////////////

/*
 Crea  una Functional Interface que conting a un mètode abstracte reverse (), que retorn e un valor String;
 en una  altra classe,  injecta a la interfície  creada mitjançant una lambda el cos de l  mètode, de
 manera que torne la  mateixa cadena que rep  com a paràmetre  però a l'inrevés. Invo ca la instància de la
 interfície passant-li una cadena i  comprovant el resultat.
 */
public class Fase3 {
   @FunctionalInterface
   interface miInterfaz{
      String reverse (String n);
   }

   public static void main(String[] args) {

      miInterfaz palabra = (str) -> {
         String resultado = "";
         for (int i = str.length()-1; i > 0 ; i--) {
            resultado += str.charAt(i);

         }
         return resultado;
      };

      System.out.println("La palabra ordenador al revés es: " + palabra.reverse("ordenador"));
   }


}

