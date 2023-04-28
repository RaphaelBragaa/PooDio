package main.java.bootcamp;

public class Dev {
    private String nome;
    private String linguagemPrincipal;
    private Bootcamp bootcampAtual;

    public Dev(String nome, String linguagemPrincipal) {
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public Bootcamp getBootcampAtual() {
        return bootcampAtual;
    }

    public void setBootcampAtual(Bootcamp bootcampAtual) {
        this.bootcampAtual = bootcampAtual;
    }

    public void assistirAula() {
        if (bootcampAtual == null) {
            System.out.println("Ops, você não está matriculado em nenhum bootcamp no momento.");
        } else {
            System.out.println("O dev " + nome + " está assistindo aula de " + (bootcampAtual.getCursos() + "."));
        }
    }

    public void fazerExercicio() {
        if (bootcampAtual == null) {
            System.out.println("Ops, você não está matriculado em nenhum bootcamp no momento.");
        } else {
            System.out.println("O dev " + nome + " está fazendo exercícios de " + bootcampAtual.getCursos() + ".");
        }
    }

    public void solicitarMentoria() {
        if (bootcampAtual == null) {
            System.out.println("Ops, você não está matriculado em nenhum bootcamp no momento.");
        } else {
           System.out.println("O dev " + nome + " solicitou uma mentoria de " + bootcampAtual.getCursos() + ".");
        }
    }
}
