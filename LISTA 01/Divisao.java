import java.util.Scanner;

public class Divisao{
	private float numA;
	private float numB;
	
	Divisao(float A, float B){
		this.setNumA(A);
		this.setNumB(B);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float numA = scanner.nextFloat();		
		float numB = scanner.nextFloat();
        scanner.close();
		
		Divisao divisao = new Divisao(numA, numB);
		divisao.imprimeDivisao();
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
	public float div(){
		return this.getNumA()/this.getNumB();
	}
	public void imprimeDivisao(){
		System.out.printf("O resultado da divisao eh: %.3f\n", this.div());
	}
}