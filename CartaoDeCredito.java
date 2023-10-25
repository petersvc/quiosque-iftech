public class CartaoDeCredito {
    private String numero;
    private String codigoSeguranca;
    private String validade;

    public CartaoDeCredito(String numero, String codigoSeguranca, String validade) {
        this.numero = numero;
        this.codigoSeguranca = codigoSeguranca;
        this.validade = validade;
    }

    public String getNumero() {
        return numero;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public String getValidade() {
        return validade;
    }
}
