/**
 *
 * @author guilhermeAmedrado
 */
public class PagamentoPix implements Pagamento{
    
    private double valor;
    
    public PagamentoPix(double valor){
        this.valor = valor;
    }

    //no pix paga o valor original do produto, mas recebe um cashback depois
    @Override
    public double calcularTotal() {
        return this.valor;
    }

    //mostra o valor de cashback que o cliente vai ganhar 
    @Override
    public String imprimirRecibo() {
        double cashback = this.valor * 0.02; // Calcula o valor do cashback
        String recibo = "--- RECIBO (PIX) ---\n";
        recibo += "Valor da Compra: R$ " + String.format("%.2f", this.valor) + "\n";
        recibo += "Cashback de 2% recebido: R$ " + String.format("%.2f", cashback) + "\n";
        recibo += "Valor Final a Pagar: R$ " + String.format("%.2f", this.calcularTotal());
        return recibo;
    }
}