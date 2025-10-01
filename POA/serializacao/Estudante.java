import java.io.Serializable;

public class Estudante implements  Serializable{
    private String nome;
    private final String matricula;
    private String curso;
    private transient String senha;

    public Estudante(String nome, String matricula, String curso, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getSenha() {
        return senha;
    }


    @Override
    public String toString() {
        return "Estudante [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", senha=" + senha + "]";
    }
}