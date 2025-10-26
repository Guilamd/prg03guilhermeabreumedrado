/**
 *
 * @author guilhermeAmedrado
 */
public class TestesFormas {
    public static void main(String[] args) {
        //cria o objeto
        Forma[] minhasFormas = new Forma[6];
        
        minhasFormas[0] = new Circulo(5.0);
        minhasFormas[1] = new Quadrado(4.0);
        minhasFormas[2] = new Triangulo(3.0, 6.0);
        minhasFormas[3] = new Esfera(2.0);
        minhasFormas[4] = new Cubo(3.0);
        minhasFormas[5] = new Piramide(5.0, 9.0);
        
        System.out.println("--- PROCESSANDO AS FORMAS DO ARRAY ---");
        System.out.println("");

        //O loop que processa o array
        for (Forma formaAtual : minhasFormas) {
            
            // Mostrar a descrição (toString())
            // O System.out.println chama o .toString() automaticamente
            System.out.println("Descrição: " + formaAtual); 

            //Determinar o tipo (2D ou 3D) e exibir os cálculos
            // Usa 'instanceof' para verificar o tipo real do objeto no array
            if (formaAtual instanceof Forma3D) {
                // Se for 3D, sabemos que tem área E volume.
                
                // Precisamos fazer um "cast" (conversão) para o Java
                // ter certeza que esse objeto tem o método obterVolume()
                Forma3D f3d = (Forma3D) formaAtual;

                System.out.println("Tipo: Forma 3D");
                System.out.println("Área da Superfície: " + f3d.obterArea());
                System.out.println("Volume: " + f3d.obterVolume());

            } else if (formaAtual instanceof Forma2D) {
                // Se for 2D, sabemos que só tem área.
                
                // O cast aqui é tecnicamente opcional se obterArea()
                Forma2D f2d = (Forma2D) formaAtual;

                System.out.println("Tipo: Forma 2D");
                System.out.println("Área: " + f2d.obterArea());
            }
            
            System.out.println("----------------------------------------"); // Apenas para separar
        }
    }
}
