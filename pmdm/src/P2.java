import java.util.*;
public class P2 {
    public static void main(String[] args){
        //Cuantas palabras se repiten

        String sNombre = "alberto javi perro alberto lara javi perro lavida lololol";
        String[] aPalabras = sNombre.split(" ");
        List aIguales = new ArrayList();

        for (int i=0;i<aPalabras.length;i++){

            for (int j=0;j<aPalabras.length;j++){

                if (aPalabras[i].equals(aPalabras[j]) && !aIguales.contains(aPalabras[i]) && (i!=j)){

                    aIguales.add(aPalabras[i]);
                }
            }
        }
        System.out.println(aIguales.size());
        System.out.println(aIguales);
    }
}
