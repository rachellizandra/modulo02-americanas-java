package MarketPlace;

import java.math.BigDecimal;

public class Produto {
    private static long countId = 0;
    private Long id;
    private String nome;
    private BigDecimal preco;
    private BigDecimal quantidade;

    //Abstraindo -> tamanho, peso, categoria, descrição, avaliação...


    public Produto(String nome, BigDecimal preco, BigDecimal quantidade) {
        this.id = countId;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        countId++;
    }

    public static long getCountId() {
        return countId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

//    public void setPreco(BigDecimal preco) {
//        this.preco = preco;
//    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
}
