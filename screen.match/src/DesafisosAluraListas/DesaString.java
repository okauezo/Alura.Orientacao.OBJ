package DesafisosAluraListas;

import java.util.ArrayList;
public class DesaString {

    ArrayList<String> objetos = new ArrayList<>();

    public void adiciona(){
        objetos.add("caneta");
        objetos.add("fantasia");
        objetos.add("cadeira");
        objetos.add("prato");
    }

    public void imprime(){
        for(String item: objetos) {
            System.out.println(item);
        }
    }

}
