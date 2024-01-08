import java.util.Scanner;

public class MultaVelocidade{
        private int vMaxima;
        private int vMotorista;

        MultaVelocidade(int vMaxima, int vMotorista){
                this.setVMaxima(vMaxima);
                this.setVMotorista(vMotorista);
        }

        public void setVMaxima(int vMax){
                this.vMaxima = vMax;
        }
        public void setVMotorista(int vMotora){
                this.vMotorista = vMotora;
        }
        public int getVMaxima(){
                return this.vMaxima;
        }
        public int getVMotorista(){
                return this.vMotorista;
        }

        public void calcularMulta(){
                int diferenca = this.getVMotorista() - this.getVMaxima();
                int multa = 0;

                if (diferenca > 0){
                        if (diferenca <= 10){
                                multa = 50;
                        }else if( diferenca <= 30){
                                multa = 100;
                        }else if(diferenca > 30){
                                multa = 200;
                        }
                }
                System.out.println(multa);
        }

        public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
                int VMAX = leitor.nextInt();
                int VMOTORA = leitor.nextInt();

                MultaVelocidade multaVelocidade = new MultaVelocidade(VMAX, VMOTORA);
                multaVelocidade.calcularMulta();


        }



}
