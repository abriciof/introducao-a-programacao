import java.util.Scanner;

public class Fibonacci{
	private int num;
	
	Fibonacci(){	
	}
	
	 Fibonacci(int num){
		 this.setNum(num);
	 }
	public void setNum(int numero){
		this.num = numero;
	}
	public int getNum(){
		return this.num;
	}
	public int fibo(int n){
		int resultado = 0;
		if (n <= 1){
			resultado = n;
		}else{
			resultado = this.fibo(n-1) + this.fibo(n-2);
		}
		// System.out.println(resultado);
		return resultado;
	}
	public void calculaImprime(int n){
		int resultado = this.fibo(n);
		this.setNum(resultado);
		System.out.println(this.getNum());
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int entrada = scanner.nextInt();

		Fibonacci fibonacci = new Fibonacci();
		fibonacci.calculaImprime(entrada);
		
		
		
		
	}
} 