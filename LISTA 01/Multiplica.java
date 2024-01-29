import java.util.Scanner;

public class Multiplica{
	private float numA;
	private float numB;
	
	Multiplica(float A, float B){
		this.setNumA(A);
		this.setNumB(B);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float numA = scanner.nextFloat();		
		float numB = scanner.nextFloat();
		scanner.close();
		
		Multiplica multiplica = new Multiplica(numA, numB);
		multiplica.imprimeMultiplicacao();
	}
	
	public void setNumA(float numero){
		this.numA = numero;
	}
	
	public void setNumB(float numero){
		this.numB = numero;
	}
	
	public float getNumA(){
		return this.numA;
	}
	
	public float getNumB(){
		return this.numB;
	}
	
	public float mult(){
		return this.getNumA()*this.getNumB();
	}
	
	public void imprimeMultiplicacao(){
		System.out.printf("O resultado da multiplicacao eh: %.0f\n", this.mult());
	}
}