//Questao 2 - Desafio Capgemini
//Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. 
//Dada uma string qualquer, desenvolva um algoritmo que encontre o numero de pares de substrings que sao anagramas.


package teste;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
       
        System.out.println("Verificador de pares de substrings que são anagramas em uma String.");
        Scanner word = new Scanner(System.in);
        System.out.print("Escreva uma string qualquer: ");
        String anagram = word.nextLine();
        word.close();

        
        HashMap<String, Integer> map= new HashMap<>();
        
        for(int i = 0; i < anagram.length(); i++) {
            for(int j = i; j < anagram.length(); j++) {
                char[] caracteres = anagram.substring(i, j+1).toCharArray();
                Arrays.sort(caracteres);

                String valor = new String(caracteres);
                if (map.containsKey(valor))
                    map.put(valor, map.get(valor)+1);
                else
                    map.put(valor, 1);
            }
        }

        
        int totalAnagrams = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            totalAnagrams += (n * (n-1))/2;
        }

        
        System.out.printf("A string %s possui %d anagramas.", anagram, totalAnagrams);
    }    
}