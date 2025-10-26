/**
 *
 * @author guilhermeAmedrado
 */
public class Esfera extends Forma3D{
    
    private double raio;
    
    public Esfera(double raio) {
        super("Esfera"); // Define o nome da forma
        this.raio = raio;
    } 

    @Override
    public double obterArea() {
        // Área de superfície: 4 * PI * r²
        return 4.0 * Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double obterVolume() {
        // Volume: (4/3) * PI * r³
        return (4.0 / 3.0) * Math.PI * Math.pow(this.raio, 3);
    }
    
    @Override
    public String toString() {
        return super.getNome() + " (Raio: " + this.raio + ")";
    }
    
}
