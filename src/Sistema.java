public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nSistema Escolar");
        System.out.println("1)Cadastrar Aluno");
        System.out.println("2)Cadastrar Professor");
        System.out.println("3)Cadastrar Coordenador");
        System.out.println("4)Listar Pessoas");
        System.out.println("5)Excluir lista");
        System.out.println("0)Sair");

        System.out.print("Informe uma opção: ");

    }

    private static void verificarOpcao(int op){

        String nome;
        int idade;
        String cargo;
        int cpf;
        String materia;
        int departamento;
        int matricula;
        
        switch (op) {
            case 1:
                
                System.out.println("Cadastrar Aluno!");

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Idade: ");
                idade = Console.lerInt();

                System.out.print("CPF: ");
                cpf = Console.lerInt();

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                Aluno a = new Aluno(nome, idade, null, cpf, matricula);
                Cadastro.cadastrar(a);

                System.out.print("Aluno Cadastrado!");


                break;

            case 2:
                
                System.out.println("Cadastrar Professor");

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Idade: ");
                idade = Console.lerInt();
               
                System.out.println("Cargo: ");
                cargo = Console.lerString();

                System.out.print("CPF: ");
                cpf = Console.lerInt();

                System.out.print("Matéria: ");
                materia = Console.lerString();


                Professor p = new Professor(nome, idade, cargo, cpf, materia);
                Cadastro.cadastrar(p);

                System.out.print("Professor cadastrado");



                break;

            case 3:

                System.out.println("Cadastrar Coordenador");

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Idade: ");
                idade = Console.lerInt();

                System.out.println("Cargo: ");
                cargo = Console.lerString();

                System.out.print("CPF: ");
                cpf = Console.lerInt();

                System.out.print("Departamento: ");
                departamento = Console.lerInt();

                Coordenador c = new Coordenador(nome, idade, cargo, cpf, departamento);
                Cadastro.cadastrar(c);

                System.out.print("Coordenador cadastrado");
                
                break;

            case 4:

            System.out.println("\nPessoas cadastradas:");

            if (Cadastro.getlistaPessoas().size() == 0) {

                System.out.println("\nNão tem pessoas cadastradas...");
                return; // finaliza o método

            }

            for (Pessoa temp : Cadastro.getlistaPessoas()) {

                System.out.println(temp.toString());

            }
                
                break;

            case 5:

                System.out.println("\nApagando lista...");
                Cadastro.getlistaPessoas().clear();

                System.out.println("\nLista apagada...");



                break;

            case 0:
            
                System.out.print("Saindo...");
        
            default:
                break;
        }


    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
