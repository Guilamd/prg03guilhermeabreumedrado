/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilh
 */
public class TesteContaBanco {

    public static void main(String[] args) {
        // --- TESTE COM A CONTA DO JUBILEU (CONTA CORRENTE) ---
        System.out.println("CRIANDO A CONTA DO JUBILEU...");
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDonoConta("Jubileu");
        p1.abrirConta("cc"); // Abre uma conta corrente (ganha R$ 50)

        // Ações do Jubileu
        p1.depositar(300);   // Saldo: 50 + 300 = 350
        p1.sacar(350);       // Saldo: 350 - 350 = 0
        p1.pagarMensalidade();    // Cobra R$ 12. Saldo: 0 - 12 = Saldo insuficiente para pagar
        p1.fecharConta();    // Tenta fechar a conta. Consegue, pois o saldo é zero.
        p1.sacar(50);        // Tenta sacar com saldo zerado. Não deve conseguir.
        
        // Estado final da conta do Jubileu
        p1.estadoAtual();


        // --- TESTE COM A CONTA DA CREUSA (CONTA POUPANÇA) ---
        System.out.println("\nCRIANDO A CONTA DA CREUSA...");
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDonoConta("Creusa");
        p2.abrirConta("cp"); // Abre uma conta poupança (ganha R$ 150)

        // Ações da Creusa
        p2.depositar(500);   // Saldo: 150 + 500 = 650
        p2.sacar(100);       // Saldo: 650 - 100 = 550
        p2.pagarMensalidade();    // Cobra R$ 20. Saldo: 550 - 20 = 530
        p2.sacar(1000);      // Tenta sacar mais do que tem. Não deve conseguir.
        p2.fecharConta();    // Tenta fechar a conta. Não deve conseguir, pois tem saldo.
        
        // Estado final da conta da Creusa
        p2.estadoAtual();
    }
}