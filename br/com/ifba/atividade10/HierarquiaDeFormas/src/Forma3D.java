/**
 *
 * @author guilhermeAmedrado
 */
public abstract class Forma3D extends Forma{

    // Passa o nome para o construtor da classe "mãe"
    public Forma3D(String nome) {
        super(nome);
    }
    
    //Contrato da classe
    public abstract double obterArea();
    public abstract double obterVolume();
}
