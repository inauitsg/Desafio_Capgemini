//Questao 2 - Desafio Capgemini
//Debora se inscreveu em uma rede social para se manter em contato com seus amigos. A pagina de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
//O site considera uma senha forte quando ela satisfaz os seguintes criterios:
//Possui no minimo 6 caracteres.
//Contem no minimo 1 digito.
//Contem no minimo 1 letra em minusculo.
//Contem no minimo 1 letra em maiusculo.
//Contem no minimo 1 caractere especial. Os caracteres especiais sao: !@#$%^&*()-

package teste;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String args[]) {
        
    Scanner scr = new Scanner(System.in);
	System.out.println("Por favor, digite uma senha:");
	String senha = scr.next();
	scr.close();
	
		 System.out.println(ValidarSenha(senha));
		 
	}
     
    	//Utilizaremos boolean para verificacoes sucessivas da senha
    
    public static boolean ValidarSenha(String senha)
    {
        boolean resultado = true;
        
        if(senha.length() < 6)
        {
            System.out.println("A senha deve conter no minimo 6 caracteres");
            System.out.println("Por favor, adicione mais " + " "+ (6 - senha.length()) + " caractere(s)");
            resultado = false;
        }
        
        if(!senha.matches(".*\\d.*"))  //Utilizacao do match para encontrar a correspondencia das condicoes da senha 
        {
            System.out.println("Por favor, adicione pelo menos 1 numero");
            resultado = false;
        }else{
            
            System.out.println("Senha ja contem 1 numero: OK");
        }
        
        
        if(!senha.matches(".*[A-Z].*"))
        {
            System.out.println("Por favor, adicione pelo menos 1 letra maiscula");
            resultado = false;
        }else{
            System.out.println("Senha ja contem 1 letra maiuscula: OK");
        }
        
        
        if(!senha.matches(".*[a-z].*"))
        {
            System.out.println("Por favor, adicione pelo menos 1 letra minuscula");
            resultado = false;
        }else{
            System.out.println("Senha ja contem 1 letra minuscula: OK");
        }
        
        
        if(!senha.matches(".*[!@#$%^&()-+].*"))
        {
            System.out.println("Por favor, adicione pelo menos 1 caractere especial");
            resultado = false;
        }else{
            System.out.println("Senha ja contem 1 caractere especial: OK");
        }
        
        return resultado;
    }
}