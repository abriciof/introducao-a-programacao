import java.util.Scanner;

public class Algarismos{
    private int num;
    Algarismos(int n){
        this.setNum(n);
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int n){
        this.num = n;
    }
    public void verificaNum(){
        int fator = this.getNum(); 
        int soma = 0;
        if (fator % 2 == 0){
            while(fator != 0){
                soma = soma + (fator % 10);
                fator = fator / 10;
            }
            System.out.printf("Numero %d eh par e a soma dos seus algarismos eh %d\n", this.getNum(), soma);
        }
        System.out.printf("Bye Bye");
    }

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        leitor.close();

        Algarismos alg = new Algarismos(num);
        alg.verificaNum();
    }
}
