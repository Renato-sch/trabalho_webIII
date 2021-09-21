import java.util.Scanner;
import java.lang.*;

public class cliente {
    private String nome_Pet;
    private String nome_Dono;
    private String telefone;
    private String endereco;
    private String cpf;
    private String email;
    private int num_Cadastro;
    private String tipo_Animal;
    private String raca;
    private String data_Agendamento;
    private String horario_Agendamento;

    public void setter(int valor_menu){ // atualizador de dados (verificar se precisa receber algum parametro vindo do main)
        //outro switch case

        Scanner ler = new Scanner(System.in);

        switch (valor_menu) {
            case 1:
            
            System.out.println("\n Digite o nome do Pet: \n");
            this.nome_Pet = ler.nextLine();
            System.out.println("Nome alterado com sucesso \n");

            break;

        case 2:
            
            System.out.println("\n Digite o nome do Dono: \n");
            this.nome_Dono = ler.nextLine();
            System.out.println("Nome alterado com sucesso \n");

            break;
        
        case 3:
            
            System.out.println("\n Digite o número de telefone: \n");
            this.telefone = ler.nextLine();
            System.out.println("Número de telefone alterado com sucesso \n");

            break;

        case 4:
            
            System.out.println("\n Digite o endereço: \n");
            this.endereco = ler.nextLine();
            System.out.println("Endereço alterado com sucesso \n");

            break;
        
        case 5:
            
            System.out.println("\n Digite o CPF do cliente: \n");
            this.cpf = ler.nextLine();
            System.out.println("CPF alterado com sucesso \n");

            break;

        case 6:
            
            System.out.println("\n Digite o E-mail do cliente: \n");
            this.email = ler.nextLine();
            System.out.println("E-mail alterado com sucesso \n");

            break;

        case 7:
            
            System.out.println("\n Digite o tipo de animal do cliente: \n");
            this.tipo_Animal = ler.nextLine();
            System.out.println("Tipo de animal alterado com sucesso \n");

            break;
        
        case 8:
            
            System.out.println("\n Digite a raça do animal do cliente: \n");
            this.raca = ler.nextLine();
            System.out.println("Raça do animal alterada com sucesso \n");

            break;


            default:
                System.out.println("\n Erro, operação inválida. \n");
                break;
        }
    }
    public String getter(int valor_menu){
        switch (valor_menu) {
            case 1:         
            
            return this.nome_Pet;       

        case 2:
            
            return this.nome_Dono;
        
        case 3:
            
           return this.telefone;


        case 4:
            
            return this.endereco;
        
        case 5:
            
           return this.cpf;

        case 6:
            
           return this.email;

        case 7:
            
           return this.tipo_Animal;
        
        case 8:
            
            return this.raca;

            default:
                System.out.println("\n Erro, operação inválida. \n");
            break;
        }
        return "0";
    }

    public void cadastro_Cliente(){
        Scanner ler = new Scanner(System.in);

        System.out.println("\n Nome do cliente: \n");
        this.nome_Dono = ler.nextLine();

        System.out.println("\n Nome do Pet: \n");
        this.nome_Pet = ler.nextLine();

        System.out.println("\n Número do telefone: \n");
        this.telefone = ler.nextLine();

        System.out.println("\n Endereço: \n"); //nao esquecer do javalang
        this.endereco = ler.nextLine();

        System.out.println("\n CPF: \n");
        this.cpf = ler.nextLine();

        System.out.println("\n Email: \n");
        this.email = ler.nextLine();
        
        System.out.println("\n Tipo de animal: \n");
        this.telefone = ler.nextLine();

        System.out.println("\n Raça: \n"); //nao esquecer do javalang
        this.endereco = ler.nextLine();
    }

    public void agendamento(){
        Scanner ler = new Scanner(System.in);

        System.out.println("\n Digite o dia de agendamento: \n");
        this.data_Agendamento = ler.nextLine();

        System.out.println("\n Digite o horario de agendamento: \n"); //nao esquecer do javalang
        this.horario_Agendamento = ler.nextLine();
    }
}
