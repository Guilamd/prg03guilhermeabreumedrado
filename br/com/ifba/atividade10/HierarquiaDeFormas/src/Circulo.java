/**
 *
 * @author guilhermeAmedrado
 */
public class Circulo extends Forma2D{
    private double raio;
    
    public Circulo(double raio){
        super("Circulo");// Define o nome da forma
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * this.raio * this.raio;// Fórmula: PI * r²
    }
    
    // Sobrescreve o toString() para dar uma descrição mais detalhada
    @Override
    public String toString(){
        return super.getNome () + " (raio: " + this.raio + ")";
    }
}
