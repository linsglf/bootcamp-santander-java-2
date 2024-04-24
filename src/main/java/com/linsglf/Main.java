package com.linsglf;

import java.util.*;

class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException (String menssageErr){
        super(menssageErr);
    }

} 
public class Main {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
           System.out.println(e.getMessage());
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contage

        if(parametroUm < parametroDois){
            for (int index = 1; index <= contagem; index++) {
                System.out.println("Imprimindo o número " + index);
    
            }
        }else{
            String error = "O segundo parâmetro deve ser maior que o primeiro!";
            throw new ParametrosInvalidosException(error);
        }
    }

}