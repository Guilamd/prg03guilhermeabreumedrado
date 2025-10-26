/**
 *
 * @author guilhermeAmedrado
 */
public class Cubo extends Forma3D{
    
    private double lado;

    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }
    
    @Override
    public double obterArea() {
        // Área de superfície: 6 * lado² (são 6 faces quadradas)
        return 6.0 * (this.lado * this.lado);
    }

    @Override
    public double obterVolume() {
        // Volume: lado³
        return Math.pow(this.lado, 3);
    }
    
    @Override
    public String toString() {
        return super.getNome() + " (Lado: " + this.lado + ")";
    }
    
}
