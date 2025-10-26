/**
 *
 * @author guilhermeAmedrado
 */
public class Quadrado extends Forma2D{
    private double lado;
    
    public Quadrado(double lado){
        super("Quadrado");// Define o nome da forma
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return this.lado *this.lado;// Fórmula: lado²
    }
    
    public String toString(){
        return super.getNome() + " (Lado: " + this.lado + ")";
    }
}
