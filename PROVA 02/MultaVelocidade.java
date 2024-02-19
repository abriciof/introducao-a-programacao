import java.util.Scanner;

public class MultaVelocidade{
    
    private int max, motorista;
    MultaVelocidade(int max, int motorista){
        this.setMaxima(max);
        this.setMotorista(motorista);
    }

    public void setMaxima(int novaMax){
        this.max = novaMax;
    }
    public void setMotorista(int novaMotorista){
        this.motorista = novaMotorista;
    }
    public int getMaxima(){
        return this.max;
    }

    public int getMotorista(){
        return this.motorista;
    }

    public void calcularMulta(){
        int multa = 0;
        if((this.getMotorista() - this.getMaxima()) > 0){
            if((this.getMotorista() - this.getMaxima()) <= 10){
                multa = 50;
            }else if((this.getMotorista() - this.getMaxima()) <= 30){
                multa = 100;
            }else if((this.getMotorista() - this.getMaxima()) > 30){
                multa = 200;
            }
            else{
                multa = 0;
            }
        }else{
            multa = 0;
        }
        System.out.println(multa);
    }

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int VMAX = leitor.nextInt();
        int VMOTORA = leitor.nextInt();
        leitor.close()
        MultaVelocidade multaVelocidade = new MultaVelocidade(VMAX, VMOTORA);
        multaVelocidade.calcularMulta();
    }
}