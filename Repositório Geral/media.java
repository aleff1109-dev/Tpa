import java.util.Scanner;

public class media {

	public static void main (String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		double nota1, nota2, nota3, nota4, soma, media;

		nota1 = 12;
		nota2 = 3;
		nota3 = 5;
		nota4 = 20;
		
		soma = nota1 + nota2 + nota3 + nota4;
		
		media = soma/4;
		
		System.out.println("media =" + media);
		
	}//Fim metodo main
	
}//Fim do programa
