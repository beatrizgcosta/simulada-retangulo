import java.util.Locale;
import java.util.Scanner;

public class programa_retangulo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura;

		
		// leitura da largura
		System.out.printf("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		while(largura <= 0.0) {
			System.out.printf("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
	}
		

}
