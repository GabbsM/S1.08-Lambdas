package Exercici_01;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


       ////////////////////////////////FASE 1/////////////////////////////////////////////////////////
public class Fase1 {

    public static void main(String[] args) {

        /*// Punto 1: filtrar nombres con A y de 3 letras:
        Tenint una llista de cadenes de noms propis, escriu un mètode que retorni una llista de tote
        les cadenes que  comencen amb la lletra 'a' (mayuscula ) i  tenen exactament 3  lletres.
        Imprimeix el resultat .
        */

        List<String> nombres = new ArrayList<>();
        nombres.add("Gabriel");
        nombres.add("Ana");
        nombres.add("Raquel");
        nombres.add("Gerard");

        System.out.println();
        System.out.println("Punto 1: ");
        System.out.println(filtraje(nombres));
        System.out.println();

        /*//Punto 2:
        Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers.
        Cada element  hauria d'anar precedit per la  lletra  "e" si el nombre és parell , i precedit de la
        lletra  "o" si el nombre és im parell. Per exemple, si la llista  d'entrada és (3,44), la
         sortida hauria de ser "o3, e44".  Imprimeix el  resultat.
         */

        System.out.println("Punto 2: ");
        System.out.println(parImparStream(List.of(1,2,3,4,5,6)));
        System.out.println();

        /*//Punto 3:
        Tenint una llista de Strings, escriu un mètode  que retorne una llista de totes les  cadenes
         que continguen la lletra ‘o’ i  imprimeix el resultat .
         */

        System.out.println("Punto 3: ");
        System.out.println(palabrasConO(List.of("Manzana","Limon","Neo","Blasa","Taquicardia")));
        System.out.println();

        /*// Punto 4:
        Has de fer el mateix que en el punt anterior,  però retornant una llista que  incloga els
         elements amb  més de 5 lletres. Imprimeix  el  resultat.
         */

        System.out.println("Punto 4:");
        System.out.println(palabras5Letras(List.of("Manzana","Limon","Neo","Blasa","Taquicardia")));
        System.out.println();


        /* // Punto 5:
        Crea una llista amb  els nombs dels mesos de  l’any. Imprimeix tots els  elements de la llista
        amb  una lambda.
         */

        System.out.println("Punto 5: ");
        meses();
        System.out.println();

        /* // Punto 6:
        Has de  fer la mateixa impressió del punt  anterior  però fent-ho mitjançant method   reference.
         */
        System.out.println("Punto 6:");
        mesesReference();
        System.out.println();
    }

    static final List<String> meses = List.of(
            "Enero",
            "Febrero"
            ,"Marzo",
            "Abril",
            "Mayo",
            "Jumio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
    );



    public static List<String> filtraje(List<String> nombres){
       return nombres.stream()
//
               .filter(nombre -> nombre.startsWith("A") && nombre.length() == 3)
               .collect(Collectors.toList());
    }


    public static String parImparStream(List<Integer> numeros) {
        return numeros.stream()
                .map(n -> {
                    if(n % 2 == 0){
                        return "e" + n;
                    }else {
                        return "o" + n;
                    }
                })
                .collect(Collectors.joining(", "));
    }


    public static List<String> palabrasConO(List<String> palabras){
        return palabras.stream()
                .filter(palabra -> palabra.contains("o"))
                .collect(Collectors.toList());

    }


    public static List<String> palabras5Letras(List<String> palabras){
        return palabras.stream()
                .filter(palabra -> palabra.length()>5)
                .collect(Collectors.toList());

    }

    public static void meses(){
        meses.stream().forEach(mes -> System.out.println(mes));
    }

    public static void mesesReference(){
        meses.stream().forEach(System.out::println);
    }

}
