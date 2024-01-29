import java.util.Scanner;

public class TempFahrenheit{
	private float grausFahrenheit;

	TempFahrenheit(float grausF){
		this.setGrausFahrenheit(grausF);
	}
	
	public void setGrausFahrenheit(float numero){
		this.grausFahrenheit = numero;
	}	
	
	public float getGrausFahrenheit(){
		return this.grausFahrenheit;
	}
	
	public void ConverteTemp(){
		float celsius = (5.0f/9)*(this.getGrausFahrenheit() - 32);
		System.out.printf("Temperatura em F: %.1f\n", this.getGrausFahrenheit());
		System.out.printf("Temperatura em C: %.1f\n", celsius);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float grausF = scanner.nextFloat();
		scanner.close();

		TempFahrenheit conversor = new TempFahrenheit(grausF);
		conversor.ConverteTemp();
	}
}