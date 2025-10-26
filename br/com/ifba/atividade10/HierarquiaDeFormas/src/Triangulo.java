/**
 *
 * @author guilhermeAmedrado
 */
public class Triangulo extends Forma2D{
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triangulo");// Define o nome da forma
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return ( this.base *this.altura) / 2.0;// Fórmula: (base * altura) / 2
    }
    
    public String toString(){
        return super.getNome() + " (Base: " + this.base + ", Altura: " + this.altura + ")";
    }
    
}
