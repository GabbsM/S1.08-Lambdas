package Exercici_01;

      ////////////////////////////////FASE 2/////////////////////////////////////////////////////////

/*
Crea una Functional Interface que continga  un mètode abstracte getPiValue (), que retorn a un valor double;
 en una  altra classe, instancie la  interfície i assigneu-li  mitjançant una lambda el valor 3.1415.
 Invoca  el  mètode getPiValue de la  instància d'interfície i  imprimeix el resultat .
 */
public class Fase2 {

}
interface  MyInterface{
    double getPiValue();
    public class Main{
        public static void main(String[] args) {

            MyInterface ref;
            ref = () -> 3.1415;

            System.out.println("Valor de Pi: " + ref.getPiValue());

        }
    }
}



