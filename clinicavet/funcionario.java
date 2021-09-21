import java.util.Scanner;
import java.lang.*;

public class funcionario {
    private String nome;
    private double salario;
    private String funcao;

    public void set_salario(double salario){
        this.salario = salario;
    }
    public double get_salario(){
        return this.salario;
    }

    public String get_nome(){
        return this.nome;
    }

    public void set_funcao(String funcao){
        this.funcao = funcao;
    }

    public void cadastro(){
        Scanner ler = new Scanner(System.in);

        System.out.println("\n Nome do funcionário \n");
        this.nome = ler.nextLine();

        System.out.println("\n Salário: \n");
        this.salario = ler.nextDouble();

        System.out.println("\n Digite a função a ser exercida: \n");
        this.funcao = ler.nextLine();
    }
}
