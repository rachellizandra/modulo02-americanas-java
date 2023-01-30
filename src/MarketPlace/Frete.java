package MarketPlace;

import java.math.BigDecimal;
import java.util.List;

public class Frete {
    private String tipoDeFrete;
    private Boolean isFreteGratis;
    private BigDecimal valorDoFrete;
    private String cep;

    public Frete(String tipoDeFrete, Boolean isFreteGratis, String cep) {
        this.tipoDeFrete = tipoDeFrete;
        this.isFreteGratis = isFreteGratis;
        this.cep = cep;
    }

    public String getTipoDeFrete() {
        return tipoDeFrete;
    }


    public Boolean isFreteGratis() {
        return isFreteGratis;
    }

    public BigDecimal calcularFrete(List<Produto> produtos) {
        if(this.isFreteGratis) {
            return BigDecimal.valueOf(0);
        }

        this.valorDoFrete = BigDecimal.valueOf(produtos.size() * 10L);
        return valorDoFrete;
    }

    public String getCep() {
        return cep;
    }

    public BigDecimal getValorDoFrete() {
        return valorDoFrete;
    }

    public void setValorDoFrete(BigDecimal valorDoFrete) {
        this.valorDoFrete = valorDoFrete;
    }
}
