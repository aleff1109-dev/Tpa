import java.util.Scanner;

public class SalarioLiquido {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		double horaAula, numAulas, desc, salarioB, salarioL;
		
		horaAula = 730;
		numAulas = 80;
		desc = 15/100;
		
		salarioB = horaAula * numAulas;
		
		salarioL = salarioB - desc;
		
		System.out.println("salario liquido = " + salarioL);
		
		

}
}