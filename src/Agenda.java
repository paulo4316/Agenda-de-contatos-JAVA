import java.util.ArrayList; // Importa a classe ArrayList para usar listas

public class Agenda {
    // Lista privada de contatos
    private ArrayList<Contato> contatos;

    // Construtor inicializa a lista de contatos
    public Agenda() {
        this.contatos = new ArrayList<>(); // Cria uma nova lista de contatos
    }

    // Método para adicionar um contato à lista
    public void adicionarContato(Contato contato) {
        contatos.add(contato); // Adiciona o contato à lista
    }

    // Método para consultar um contato pelo nome
    public Contato consultarContato(String nome) {
        // Percorre a lista de contatos
        for (Contato contato : contatos) {
            // Compara o nome do contato (ignorando maiúsculas/minúsculas)
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato; // Retorna o contato se encontrado
            }
        }
        return null; // Retorna null se o contato não for encontrado
    }

    // Método para remover um contato pelo nome
    public boolean removerContato(String nome) {
        // Consulta o contato na lista
        Contato contato = consultarContato(nome);
        if (contato != null) { // Se o contato for encontrado
            contatos.remove(contato); // Remove o contato da lista
            return true; // Retorna verdadeiro indicando que foi removido
        }
        return false; // Retorna falso se o contato não for encontrado
    }

    // Método para listar todos os contatos
    public void listarContatos() {
        // Percorre e imprime cada contato na lista
        for (Contato contato : contatos) {
            System.out.println(contato); // Imprime a representação em string do contato
        }
    }
}
