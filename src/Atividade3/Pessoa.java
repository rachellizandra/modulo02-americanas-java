package Atividade3;

import java.sql.Struct;

public abstract class Pessoa {
    private String nome;
    private String registro;

    public Pessoa() {

    }
    public Pessoa(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
    }

    public abstract void realizarAtividade();
    public abstract void calcularCargaHoraria();

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

    //verificar objetos por meio do método equals

    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(getClass() != o.getClass()) {
            return false;
        }
        // ou
//        if(!(o instanceof Pessoa)) {
//            return false;
//        }
        Pessoa pessoa = (Pessoa) o;
        return registro.equals(pessoa.registro);
    }


}
