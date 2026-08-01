import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class lista {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner( System.in);

        List <Integer> Lista = new ArrayList<>();

        // Adicionando elementos à lista
        Lista.add(10);
        Lista.add(20);
        Lista.add(1, 30);
        Lista.add(15);

        //Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + Lista.size());
        
        for(Integer x : Lista){
            System.out.println(x);
        }

        //Mostrar o indice de um elemento
        System.out.println("Indice do elemento 20: " + Lista.indexOf(20));



        //Fazer uma lista de elementos pares
        List <Integer> ListaPares = Lista.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        // Removendo elementos da lista
        Lista.remove(1);
        Lista.removeIf(x -> x % 2 == 0); //Remove numeros pares da lista

        System.out.println("Elementos da lista após remoção:");
        for(Integer x : Lista){
            System.out.println(x);
        }

        //Mostrar os elementos pares
        System.out.println("Elementos pares da lista: " + ListaPares);
        for(Integer x : ListaPares){
            System.out.println(x);
        }

        sc.close();
    }
}
