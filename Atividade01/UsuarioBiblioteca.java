package Atividade01;

public class UsuarioBiblioteca {
    private String matricula;
    private String nome;
    private String email;
    private int limiteEmprestimos;
    private int emprestimosAtivos;

    public UsuarioBiblioteca(String matricula, String nome, String email, int limiteEmprestimos) {
        if (matricula == null || matricula.isEmpty()){
            throw new IllegalArgumentException("Matrícula não pode ser nula!");
        }
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo!");
        }
        if (email == null || !email.contains("@")){
            throw new IllegalArgumentException("Email está em um formato inválido ou nulo!");
        }
        if (limiteEmprestimos < 0) {
            throw new IllegalArgumentException("O limite de empréstimos deve ser maior que 0");
        } 

        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.limiteEmprestimos = limiteEmprestimos;
        this.emprestimosAtivos = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public int getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo!");
        } else{
            this.nome = nome.trim();
        }
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")){
            throw new IllegalArgumentException("Email está em um formato inválido ou nulo!");
        } else {
            this.email = email;
        }
    }

    public boolean podeEmprestar() {
        if (emprestimosAtivos < limiteEmprestimos) {
            System.out.println("Pode pegar novos livros.");
            return true;
        } else {
            System.out.println("Usuário já esta com o limite de emprestimos.");
            return false;
        }
    }

    public boolean registrarEmprestimo() {
        if (podeEmprestar()) {
            emprestimosAtivos++;
            System.out.println("Empréstimo registrado com sucesso.");
            return true;
        } else {
            System.out.println("Não é possível registrar o empréstimo. Limite atingido.");
            return false;
        }
    }

    public boolean registrarDevolucao() {
        if (emprestimosAtivos > 0) {
            emprestimosAtivos--;
            System.out.println("Devolução registrada com sucesso.");
            return true;
        } else {
            System.out.println("Não há empréstimos ativos para devolver.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\n" +
               "Nome: " + nome + "\n" +
               "Email: " + email + "\n" +
               "Limite de Emprestimos: " + limiteEmprestimos + "\n"+
               "Esprestimos Ativos: " + emprestimosAtivos;
    }
}

