import java.util.Locale;
import java.util.Scanner;

public class programa_retangulo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura, area, perimetro;
		int menu;
		
		// leitura da largura
		System.out.printf("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		while(largura <= 0.0) {
			System.out.printf("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		// leitura da altura
		System.out.printf("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		while(altura <= 0.0) {
			System.out.printf("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}
		//menu
		System.out.printf("%nMENU:%n");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.printf("Digite uma opcao: ");
		menu = sc.nextInt();
		
		//tratamento das op��es 
		while(menu != 1 && menu != 2 && menu !=3) {
			System.out.printf("%nOP��O INVALIDA%n");
			System.out.printf("%nMENU:%n");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.printf("Digite uma opcao: ");
			menu = sc.nextInt();
		}
		while(menu == 1 || menu == 2 || menu == 3) {
			if(menu == 1) {
				area = largura * altura;
				System.out.printf("%nAREA = %.2f%n", area);
				System.out.printf("%nMENU:%n");
				System.out.println("1 - Mostrar area");
				System.out.println("2 - Mostrar perimetro");
				System.out.println("3 - Sair");
				System.out.printf("Digite uma opcao: ");
				menu = sc.nextInt();
				while(menu != 1 && menu != 2 && menu !=3) {
					System.out.printf("%nOP��O INVALIDA%n");
					System.out.printf("%nMENU:%n");
					System.out.println("1 - Mostrar area");
					System.out.println("2 - Mostrar perimetro");
					System.out.println("3 - Sair");
					System.out.printf("Digite uma opcao: ");
					menu = sc.nextInt();
				}
			}
			else {
				if(menu == 2) {
					perimetro = altura * 2 + largura * 2;
					System.out.printf("%nPERIMETRO = %.2f%n", perimetro);
					System.out.printf("%nMENU:%n");
					System.out.println("1 - Mostrar area");
					System.out.println("2 - Mostrar perimetro");
					System.out.println("3 - Sair");
					System.out.printf("Digite uma opcao: ");
					menu = sc.nextInt();
					while(menu != 1 && menu != 2 && menu !=3) {
						System.out.printf("%nOP��O INVALIDA%n");
						System.out.printf("%nMENU:%n");
						System.out.println("1 - Mostrar area");
						System.out.println("2 - Mostrar perimetro");
						System.out.println("3 - Sair");
						System.out.printf("Digite uma opcao: ");
						menu = sc.nextInt();
					}
				}
				else {
					System.out.printf("%nFIM DO PROGRAMA!");
					menu = 0;
				}
			}
			
		}
		
	}
		

}
