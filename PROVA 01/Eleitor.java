import java.util.Scanner;

public class Eleitor{
        private int idade;

        Eleitor(int idade){
                this.setIdade(idade);
        }

        public int getIdade(){
                return this.idade;
        }

        public void setIdade(int idade){
                this.idade = idade;
        }

        public void calculaClassificacao(){
                String resultado = "eleitor facultativo";
                if (this.getIdade() < 16){
                        resultado = "nao votante";
                }else if ( (this.getIdade() <= 65) && (this.getIdade() >= 18) ){
                        resultado = "eleitor obrigatorio";
                }
                System.out.println(resultado);
        }

        public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
                int idade = leitor.nextInt();
                leitor.close();
                
                Eleitor eleitor = new Eleitor(idade);
                eleitor.calculaClassificacao();
        }
}