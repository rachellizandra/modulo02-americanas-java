package Atividade3;

public class Aluno extends Pessoa{
    private String disciplina;
    private double media;

    public Aluno() {

    }

    @Override
    public void realizarAtividade() {
        System.out.println("Aluno estudando");
    }

    @Override
    public void calcularCargaHoraria() {
        if(this.disciplina.equals("CalculoI")) {
            System.out.println("Carga horária total: 90 horas");
        } else {
            System.out.println("Carga horária total: 60 horas");
        }
    }

    public Aluno(String nome, String registro, String disciplina, double media) {
        super(nome, registro);
        this.disciplina = disciplina;
        this.media = media;
    }



    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
