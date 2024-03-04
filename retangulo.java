import java.util.Scanner;

public class retangulo
{
	public static void main(String[] args) {
	    
	    float area, altura, perimetro, base; 
	    
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("Olá, vamos calcular a área e o perímetro de um retângulo?");
		System.out.println("Primeiramente, digite a altura de seu retângulo:");
		altura = ler.nextFloat();
		System.out.println("Agora digite a base do seu retângulo:");
		base = ler.nextFloat();
		
		area = base * altura;
		perimetro = 2 * (altura + base);
		System.out.println("A area do seu retângulo é: " + area);
		System.out.println("O perímetro do seu retângulo é: " + perimetro);
		
	}
}
