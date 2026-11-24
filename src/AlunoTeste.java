
public class AlunoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Victor");
        aluno1.setIdade(23);
        aluno1.setNota1(1.5);
        aluno1.setNota2(2.0);
        aluno1.calcularMedia();

        System.out.println("Nome: " + aluno1.getNome() + " - Nota 1: " + aluno1.getNota1() + " - Nota 2: " + aluno1.getNota2() + " - Média: " + aluno1.getMedia());
        System.out.println("Situação: " + aluno1.verificarAprovacao());
    }
}
