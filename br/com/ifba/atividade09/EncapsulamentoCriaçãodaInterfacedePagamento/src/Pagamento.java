/**
 *
 * @author guilhermeAmedrado
 */
public interface Pagamento {

   // Método que calcula e retorna o valor final da compra
   public double calcularTotal();
   
   // Método que gera uma string formatada com os detalhes da compra
   public String imprimirRecibo();
    
}
