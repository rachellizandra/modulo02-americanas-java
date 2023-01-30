package MarketPlace;

import java.math.BigDecimal;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;
    private BigDecimal valorDoFrete;
    private BigDecimal valor; // valor dos produtos
    private BigDecimal valorFinal; // valor dos produtos + frete

    public Carrinho(List<Produto> produtos, BigDecimal valorDoFrete) {
        this.produtos = produtos;
        this.valorDoFrete = valorDoFrete;
    }

    public BigDecimal calcularValor() {
        if(this.produtos.isEmpty()) return BigDecimal.ZERO;

        BigDecimal valorAux = BigDecimal.ZERO; // aux = 0

        //Bigdecimal é imutável
        //

        for(int i = 0; i < this.produtos.size(); i++) {
            Produto produto = this.produtos.get(i);
            valorAux = valorAux.add(produto.getPreco().multiply(produto.getQuantidade())); // método do BigDecimal de somar os valores dos produtos e multiplicar pela quantidade de produtos
        }
        this.valor = valorAux;

        return this.valor;
    }

    public BigDecimal calcularValorFinal() {
        BigDecimal valorFinalAux = calcularValor();

        valorFinalAux = valorFinalAux.add(this.valorDoFrete);

        this.valorFinal = valorFinalAux;

        return this.valorFinal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal getValorDoFrete() {
        return valorDoFrete;
    }

    public void setValorDoFrete(BigDecimal valorDoFrete) {
        this.valorDoFrete = valorDoFrete;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }
}
