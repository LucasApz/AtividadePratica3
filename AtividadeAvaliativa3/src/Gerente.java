//Lucas Affonso Purkott Zelleroff

public class Gerente extends Funcionario implements Traba {
    private double bonusano;
    private String equipe;

    public Gerente(String nome, int matricula, double bonusano, String equipe) {
        super(nome, matricula);
        this.bonusano = bonusano;
        this.equipe = equipe;
    }

    @Override
    public double calcularSalario() {
        return 5000 + bonusano;
    }

    @Override
    public String obterDetalhes() {
        return "Gerente: " + nome + ", Matrícula: " + matricula + ", Salário: " + calcularSalario() + ", Equipe: " + equipe;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente " + nome + " está gerenciando a equipe " + equipe);
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Gerente " + nome + " está relatando o progresso da equipe " + equipe);
    }
}
