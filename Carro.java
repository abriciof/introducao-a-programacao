import java.util.Scanner;

public class Carro{
        private double custoFabrica;
        private double custoFinal;

        Carro(double custoFabrica){
                this.setCustoFabrica(custoFabrica);
        }
        public double getCustoFabrica(){
                return this.custoFabrica;
        }
        public double getCustoFinal(){
                return this.custoFinal;
        }
        public void setCustoFabrica(double custoFabrica){
                this.custoFabrica = custoFabrica;
        }
        public void setCustoFinal(double custoFinal){
                this.custoFinal = custoFinal;
        }
        public void calculaFinal(){
                double resultado;
                resultado = this.getCustoFabrica() * (0.45+0.12+1);
                this.setCustoFinal(resultado);
        }
        public void imprimeValorFinal(){
                this.calculaFinal();
                System.out.printf("%.2f", this.getCustoFinal());
        }
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                double C = scanner.nextDouble();

                Carro car = new Carro(C);
                car.imprimeValorFinal();

        }



}