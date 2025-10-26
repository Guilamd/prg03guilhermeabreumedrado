/**
 *
 * @author guilhermeAmedrado
 */
public class Piramide extends Forma3D{
    
    private double ladoDaBase;
    private double altura;
    
    public Piramide(double ladoDaBase, double altura){
        super("Piramide de base quadrada");
        this.ladoDaBase = ladoDaBase;       
    }

    @Override
    public double obterArea() {
        // Área = Área da Base + Área das 4 faces triangulares
        double areaDaBase = this.ladoDaBase * this.ladoDaBase;
        
        // Teorema de Pitágoras para achar a altura da face (apótema)
        double apotema = Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.ladoDaBase / 2.0, 2));
        
        double areaFacesLaterais = 4.0 * ((this.ladoDaBase * apotema) / 2.0);
        
        return areaDaBase + areaFacesLaterais;
    }

    @Override
    public double obterVolume() {
        // Volume: (1/3) * Área da Base * Altura
        double areaDaBase = this.ladoDaBase * this.ladoDaBase;
        return (1.0 / 3.0) * areaDaBase * this.altura;
    }
    
    @Override
    public String toString() {
        return super.getNome() + " (Lado da Base: " + this.ladoDaBase + ", Altura: " + this.altura + ")";
    }
}
