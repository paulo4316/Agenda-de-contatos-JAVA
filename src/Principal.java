import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Principal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Cria uma nova agenda
        Agenda agenda = new Agenda();
        int opcao = 0; // Variável para armazenar a opção escolhida pelo usuário

        // Loop principal do programa, continua até a opção ser 4 (Sair)
        while (opcao != 4) {
            // Imprime o menu de opções
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Consultar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            // Lê a opção do usuário
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            // Executa a ação de acordo com a opção escolhida
            switch (opcao) {
                case 1:
                    // Adicionar Contato
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine(); // Lê o nome
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine(); // Lê o telefone
                    System.out.print("Email: ");
                    String email = scanner.nextLine(); // Lê o email
                    // Cria um novo contato e adiciona à agenda
                    Contato contato = new Contato(nome, telefone, email);
                    agenda.adicionarContato(contato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    // Consultar Contato
                    System.out.print("Nome do contato a ser consultado: ");
                    nome = scanner.nextLine(); // Lê o nome
                    contato = agenda.consultarContato(nome);
                    if (contato != null) { // Se o contato for encontrado
                        System.out.println("Contato encontrado: " + contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    // Remover Contato
                    System.out.print("Nome do contato a ser removido: ");
                    nome = scanner.nextLine(); // Lê o nome
                    boolean removido = agenda.removerContato(nome);
                    if (removido) { // Se o contato for removido com sucesso
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    // Sair do programa
                    System.out.println("Saindo...");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
