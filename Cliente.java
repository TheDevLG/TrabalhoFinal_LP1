package TrabalhoFinal_LP1;
import java.util.Scanner;

public abstract class Cliente {
    protected  String nome;
    protected  String id;
    protected  int idade;
    //protected Endereco end;



    public  Cliente(String novonome,String novoid, int novaidade)
    {
      this.nome = novonome;
      this.id = novoid;
      this.idade = novaidade;
      //end = novoend;
    }

    public  void relatorio ()
    {
    	System.out.println("-------------------------");
    	System.out.println("Cliente:");
    	System.out.println("Nome:" +nome);
    	System.out.println("Id:" +id);
    	System.out.println("Idade:" +idade);
    	System.out.println("-------------------------");
       
    }


}