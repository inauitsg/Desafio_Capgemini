//Questao 1 - Desafio Capgemini
// Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espacos. 
//A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaco.

package teste;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.println("Olá, usuario! Digite o numero de degraus que deseja em sua escada: ");
        n = entrada.nextInt();
        
       //Leitura de n como número de degraus 
        n=n+1; //Para otimização da recursividade do comando for
        entrada.close();
        
        int i, j;
        String matriz[][] = new String[n][n]; //Para melhoria do armazenamento dos valores de "vazios" e "*" usaremos a função de matriz
        
        for(i=1; i<n; i++){
            for(j=1; j<n; j++){
                if((i+j)<n){matriz[i][j]=" ";}
                    else{matriz[i][j]="*";}
                }
            }
        
        for(i=1; i<n; i++){
            for(j=1; j<n; j++){
                System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
            
    }
}
