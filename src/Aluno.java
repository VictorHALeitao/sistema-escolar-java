
public class Aluno {

    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double media;

    //Metodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media;
    }

    //Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 10) {
            throw new IllegalArgumentException("Nota inválida. A nota deve estar entre 0 e 10.");
        }
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        if (nota2 < 0 || nota2 > 10) {
            throw new IllegalArgumentException("Nota inválida. A nota deve estar entre 0 e 10.");
        }
        this.nota2 = nota2;
    }

    //Calcula a média das notas do aluno e armazena no atributo media
    public void calcularMedia() {
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            throw new IllegalArgumentException("Notas inválidas. As notas devem estar entre 0 e 10.");
        }
        media = (nota1 + nota2) / 2;
    }

    // Método para verificar se o aluno foi aprovado ou reprovado
    public String verificarAprovacao() {
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
