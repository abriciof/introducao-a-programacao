import java.util.Scanner;

public class Positivo{
	private int num;
    Positivo(int n){
        this.setNum(n);
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int n){
        this.num = n;
    }
    public void verificaNum(){
        if (this.getNum() > 0){
            System.out.printf("Numero %d eh super positivo\n", this.getNum());
        }
        System.out.printf("Exiting...");
    }

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        leitor.close();

        Positivo npos = new Positivo(num);
        npos.verificaNum();
    }
}