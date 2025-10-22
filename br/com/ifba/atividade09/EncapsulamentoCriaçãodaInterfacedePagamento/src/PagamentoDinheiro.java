/**
 *
 * @author guilhermeAmedrado
 */
public class PagamentoDinheiro implements Pagamento {
    
    private double valor;
    
    // Construtor para receber o valor quando o objeto for criado
    public PagamentoDinheiro(double valor){
        this.valor = valor;
    }

    //adiciona os 10% de desconto
    @Override
    public double calcularTotal() {
        return this.valor * 0.90;
    }

    //vai imprimir o valor do produto e o valor com desconto 
    @Override
    public String imprimirRecibo() {
        String recibo = "--- Recibo(DINHEIRO) ---\n";
        recibo += "Valor original : R$ " + String.format("%.2f", this.valor) + "\n";
        recibo += "Desconto: 10% por ser no dinheiro\n";
        recibo += "Valor Final: R$ " + String.format("%.2f", this.calcularTotal());
        return recibo;
    }   
}
