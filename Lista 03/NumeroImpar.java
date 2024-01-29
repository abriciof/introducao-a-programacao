import java.util.Scanner;

public class NumeroImpar{
	private int num;
    NumeroImpar(int n){
        this.setNum(n);
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int n){
        this.num = n;
    }
    public void verificaNum(){
        if (this.getNum() % 2 != 0){
            System.out.printf("Numero %d nao eh par\n", this.getNum());
        }
        System.out.printf("F1m d0 Pr0gr4m4");
    }

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        leitor.close();

        NumeroImpar nimpar = new NumeroImpar(num);
        nimpar.verificaNum();
    }
}