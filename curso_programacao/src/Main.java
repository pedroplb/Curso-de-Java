import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		
		System.out.printf("Voce digitou %s \n",x);
		
		int y;
		
		y=sc.nextInt();
		
		System.out.printf("Voce digitou %s",y);
		
		
		sc.close();
		
		
		//recebe 2 numeros e some
		
		Scanner sc = new Scanner(System.in);
		int x, y, r;
		
		System.out.print("Digite o primeiro número ");
		x=sc.nextInt();
		System.out.print("Digite o segundo número ");
		y=sc.nextInt();
		
		r = x + y;
		
		System.out.printf("Soma = %s", r);
		
		
		//area do circulo
		*/
		
		float area, pi;
		double raio;
		Scanner sc = new Scanner(System.in);
		pi = (float) 3.141559;
		
		System.out.println("Cálculo da área do círculo");
		System.out.print("Digite o raio ");
		raio = sc.nextDouble();
		area = (float) (raio * raio * pi);
		
		System.out.printf("A=%4d", area);
		
		sc.close();	
	
		
	}

}
