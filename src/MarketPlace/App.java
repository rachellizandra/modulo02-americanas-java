package MarketPlace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("1", BigDecimal.valueOf(1), BigDecimal.TEN));
        produtos.add(new Produto("2", BigDecimal.valueOf(2), BigDecimal.TEN));
        produtos.add(new Produto("2", BigDecimal.valueOf(3), BigDecimal.TEN));


        Frete freteGratis = new Frete("normal", true, "123654");
        System.out.println("Valor do frete R$: " + freteGratis.calcularFrete(produtos));

        Frete freteExpress = new Frete("express", false, "123465");
        System.out.println("Valor do frete R$: " + freteExpress.calcularFrete(produtos));

        Carrinho carrinho = new Carrinho(produtos, freteGratis.getValorDoFrete());
        Carrinho carrinho2 = new Carrinho(produtos, freteExpress.getValorDoFrete());
        System.out.println(carrinho.calcularValor());
        System.out.println(carrinho2.calcularValor());
    }
}
