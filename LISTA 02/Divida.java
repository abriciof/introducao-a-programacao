import java.util.Scanner;

public class Divida{
	private int dias;
	private float divida;
	private float multaDiaria;

	Divida(float divida, int dias, float multaDiaria){
		this.setDivida(divida);
		this.setDias(dias);
		this.setMultaDiaria(multaDiaria);
	}
	
	Divida(){
	}
	
	public int getDias() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getDivida() {
        return this.divida;
    }

    public void setDivida(float divida) {
        this.divida = divida;
    }

    public float getMultaDiaria() {
        return this.multaDiaria;
    }

    public void setMultaDiaria(float multaDiaria) {
        this.multaDiaria = multaDiaria;
    }

	public float calculaDividaAtual(){
		float dividaAtual = this.getDivida() + (this.getDias()*this.getMultaDiaria());
		return dividaAtual;
	}
	
	public void imprimeDividaAtual (){
		System.out.printf("O valor da sua divida atual eh: %.2f", this.calculaDividaAtual());
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float dividaAntiga = scanner.nextFloat();
		int dias = scanner.nextInt();
		float taxa = scanner.nextFloat();
		scanner.close();
        
		Divida divida = new Divida(dividaAntiga, dias, taxa);
		divida.imprimeDividaAtual();
	}
}