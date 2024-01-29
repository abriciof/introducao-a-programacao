import java.util.Scanner;

public class Salario{
	private float salarioAtual;
	private float percentualReajuste;

	Salario(float salarioAtual, float percentualReajuste){
		this.setSalarioAtual(salarioAtual);
		this.setPercentualReajuste(percentualReajuste);
	}
	
	Salario(){
	}
	
	public float getSalarioAtual() {
        return this.salarioAtual;
    }

    public void setSalarioAtual(float salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public float getPercentualReajuste() {
        return this.percentualReajuste;
    }

    public void setPercentualReajuste(float percentualReajuste) {
        this.percentualReajuste = percentualReajuste;
    }

	public float calculaSalario(){
		float salario = this.getSalarioAtual() * (1 + this.getPercentualReajuste()/100);
		return salario;
	}
	
	public void imprimeSalario (){
		System.out.printf("O novo salario eh: %.2f", this.calculaSalario());
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float salarioAtual = scanner.nextFloat();
		float reajuste = scanner.nextFloat();
        scanner.close();
		
		Salario salario = new Salario(salarioAtual, reajuste);
		salario.imprimeSalario();
	}
}