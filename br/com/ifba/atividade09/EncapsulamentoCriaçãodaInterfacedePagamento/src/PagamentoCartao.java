/**
 *
 * @author guilh
 */
public class PagamentoCartao implements Pagamento {
    
    private double valor;
    
    // Construtor para receber o valor quando o objeto for criado
    public PagamentoCartao(double valor){
        this.valor = valor;  
    }

    // Aplica 5% de taxa (multiplica por 1.05)
    @Override
    public double calcularTotal() {
        return this.valor *1.05;
    }

    @Override
    public String imprimirRecibo() {
        String recibo = "--- RECIBO(CARTAO) ---\n";
        recibo += "Valor Original: R$ " + String.format("%.2f", this.valor) + "\n";
        recibo += "Taxa: 5%\n";
        recibo += "Valor Final: R$ " + String.format("%.2f", this.calcularTotal());
        return recibo;
    }
}