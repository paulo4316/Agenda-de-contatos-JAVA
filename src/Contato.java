public class Contato {
    // Atributos privados do contato
    private String nome;    // Nome do contato
    private String telefone; // Telefone do contato
    private String email;   // Email do contato

    // Construtor para inicializar os atributos do contato
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;         // Inicializa o nome do contato
        this.telefone = telefone; // Inicializa o telefone do contato
        this.email = email;       // Inicializa o email do contato
    }

    // Getters e Setters permitem acessar e modificar os atributos privados

    // Retorna o nome do contato
    public String getNome() {
        return nome;
    }

    // Modifica o nome do contato
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o telefone do contato
    public String getTelefone() {
        return telefone;
    }

    // Modifica o telefone do contato
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Retorna o email do contato
    public String getEmail() {
        return email;
    }

    // Modifica o email do contato
    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString retorna uma representação em string do contato
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
