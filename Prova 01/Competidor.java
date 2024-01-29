import java.util.Scanner;

public class Competidor{
        private String nome;
        private int pontos;

        Competidor(String nome, int pontos){
                this.setNome(nome);
                this.setPontos(pontos);
        }

        public void setNome(String nome){
                this.nome = nome;
        }
        public void setPontos(int pontos){
                this.pontos = pontos;
        }

        public String getNome(){
                return this.nome;
        }
        public int getPontos(){
                return this.pontos;
        }

        public void ComparaCompetidorCom(Competidor comp){
                String resultado;
                if (this.getPontos() > comp.getPontos()){
                                resultado = this.getNome();
                }else{
                        resultado = comp.getNome();
                }
                System.out.println(resultado);
        }

        public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
                String nome1 = leitor.nextLine();
                int pontos1 = leitor.nextInt(); 
                leitor.nextLine();
                String nome2 = leitor.nextLine();
                int pontos2 = leitor.nextInt();
                leitor.close();


                Competidor comp1 = new Competidor(nome1, pontos1);
                Competidor comp2 = new Competidor(nome2, pontos2);

                comp1.ComparaCompetidorCom(comp2);


        }
}