import java.util.Scanner;

public class prestação {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		double valor, tempo, prestacao, taxa;
		
		valor = 12000;
		tempo = 30;
		taxa = 30/100;
		
		prestacao = valor + (valor *(taxa/100)* tempo);
		
		System.out.println("prestacao = " + prestacao);
		
		
		
	}

}
