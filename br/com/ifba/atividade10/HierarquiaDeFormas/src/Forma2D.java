/**
 *
 * @author guilhermeAmedrado
 */
public abstract class Forma2D extends Forma{
    
    // Passa o nome para o construtor da classe "mãe"
    public Forma2D(String nome) {
        super(nome);
    }
    
    //contrato da classe
    public abstract double obterArea();
}

