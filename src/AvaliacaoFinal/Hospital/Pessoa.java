package AvaliacaoFinal.Hospital;

public abstract class Pessoa {

    // Na classe Pessoa, teremos a mesma como classe abstrata e dentro dela um método abstrato chamado realizarAtividade()
    // Além disso, foi criado o método equals() e toString() nesta classe
    private String nome;
    private String registro;

    public Pessoa() {

    }

    public Pessoa(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public abstract void realizarAtividade();

    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(getClass() != o.getClass()) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return registro.equals(pessoa.registro);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Registro: " + this.getRegistro();
    }
}
