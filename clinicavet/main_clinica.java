import java.util.Scanner; //importação da biblioteca scanner, usada para leituras
import java.lang.*;

public class main_clinica { // declaração da classe main
    public static void main(String[] args) throws Exception { // declaração da função main
        Scanner ler = new Scanner(System.in); //instanciando a classe scanner, para poder usar para leituras
        cliente c1 = new cliente();
        funcionario f1 = new funcionario();
        int menu_inicial = 0; //declarando o atributo menu_inicial
        int menu_cliente = 0; //declarando o atributo menu_cliente
        int menu_funcionario = 0;
        String nova_funcao;
        double valor_salario; //valor que será lido no menu para alteração de salário

        do{ //inicio do laço de do while
        System.out.println("\n Digite a operação com a qual deseja fazer: \n"); //impressão na tela da mensagem descrita dentro das aspas
        System.out.println("1- Cliente\n2- Funcionário\n");
        menu_inicial = ler.nextInt();

        if(menu_inicial > 2 || menu_inicial < 1){
            System.out.println("Número incorreto, favor digitar novamente\n");
        }

        }while(menu_inicial > 2 || menu_inicial < 1);

        if(menu_inicial == 1){ //operações com cliente

            do{
                System.out.println("\n O que deseja fazer: \n");
                System.out.println("1- Cadastrar cliente \n2- Agendar Consulta\n3- Alterar dados de um cliente\n4- Verificar dados do cliente");
                menu_cliente = ler.nextInt();
        
                if(menu_cliente > 4 || menu_cliente < 1){
                    System.out.println("Número incorreto, favor digitar novamente\n");
                }
        
                }while(menu_cliente > 4 || menu_cliente < 1);

                switch (menu_cliente) {
                    case 1:
                        c1.cadastro_Cliente();
                        break;
                
                    case 2:
                        c1.agendamento();
                        break; 
                        
                    case 3: //perguntar qual/quais dado quer modificar
                    
                        c1.setter(menu_cliente); //fazer leitura novamente do menu_cliente para verificar quais dados mudar
                        break;

                    case 4:
                        c1.getter(menu_cliente); //igual ao setter
                        break;
                    default:
                    System.out.println("Número incorreto, encerrando programa.\n");
                        break;
                }

        }

        else if(menu_inicial == 2){ //operações com funcionario
            do{
                System.out.println("\n O que deseja fazer: \n");
                System.out.println("1- Cadastrar funcionario \n2- Verificar Salário\n3- Alterar Salário\n4- Mudar Função");
                menu_funcionario= ler.nextInt();
        
                if(menu_funcionario > 4 || menu_funcionario < 1){
                    System.out.println("Número incorreto, favor digitar novamente\n");
                }
        
                }while(menu_funcionario > 4 || menu_funcionario < 1);

            switch (menu_funcionario){
                case 1:
                     f1.cadastro();
                      break;
                
                case 2:
                    f1.get_salario();
                    break; 
                        
                case 3: 
                    System.out.println("Digite o valor do novo salário do funcionário"+ f1.get_nome() + "\n");
                    valor_salario = ler.nextDouble();
                    f1.set_salario(valor_salario);

                    System.out.println("O salario do funcionário "+ f1.get_nome() + "agora é de: " + f1.get_salario() + "\n");

                    break;

                case 4:
                    System.out.println("Digite a nova função do funcionário:\n");
                    nova_funcao = ler.nextLine();
                    f1.set_funcao(nova_funcao);
                    break;
                default:
                    System.out.println("Número incorreto, encerrando programa.\n");
                    break;
            }
        }

    }
    
}