import java.util.Scanner;

public class Negativo{
	private int num;
    Negativo(int n){
        this.setNum(n);
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int n){
        this.num = n;
    }
    public void verificaNum(){
        if (this.getNum() < 0){
            System.out.printf("Numero %d nao eh super positivo\n", this.getNum());
        }
        System.out.printf("Exiting...");
    }

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        leitor.close();

        Negativo nneg = new Negativo(num);
        nneg.verificaNum();
    }
}