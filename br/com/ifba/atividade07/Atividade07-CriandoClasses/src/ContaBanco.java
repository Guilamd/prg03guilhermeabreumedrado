/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guilh
 */
public class ContaBanco {

    //atributos da classe
   public int numConta;
   protected String tipoConta;
   private String donoConta;
   private double saldo;
   private boolean status;

    //método Construtor
   //inicia as variáveis status e saldo
   public ContaBanco(){
       
      this.status = false;
      this.saldo = 0.0;        
   }
   
    //Método para mostrar
    public void estadoAtual() {
        
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getDonoConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Aberta" : "Fechada")); // Operador ternário para exibir "Aberta" ou "Fechada"
        System.out.println("------------------------------");
}

   public void abrirConta(String tipo){
       
       //define o tipo de conta cc(corrente) ou cp(poupança)
       this.setTipoConta(tipo);
       
       //define a conta como "verdadeira"
       this.setStatus(true);
       
       //compara para ver qual bônus a pessoa vai ganhar e informa que a conta foi criada
       //além de retornar um erro quando não atende as requisitos do tipo de conta (cc ou cp)
       if(tipo.equals("cc")){
           this.setSaldo(50);
           System.out.println("Conta corrente de " + this.getDonoConta() + " aberta com sucesso!");
       } else if(tipo.equals("cp")){
           this.setSaldo(150);
            System.out.println("Conta poupança de " + this.getDonoConta() + " aberta com sucesso!");
       }else{
            System.out.format("Tipo de conta inválido.");
       }
   }
   
   public void fecharConta(){
       //verifica se a conta está ativa ou não, se sim continua, se não, sai
       if(getStatus() == true){
           if(getSaldo() > 0){ //verifica se o cliente tem saldo, se tiver não fecha
               System.out.println("Erro: A conta não pode ser fechada, pois ainda há saldo!");
           }else if(getSaldo() < 0){ //verifica se o cliente tem saldo negativo, se tiver não fecha pois ele está devendo
               System.out.println("Erro: A conta não pode ser fechada pois você tem débito com o Banco!");
           }else{
               this.setStatus(false);
               System.out.println("Conta fechada com sucesso!!");
           }
       }else{
           System.out.println("A conta já está fechada!");
       }
   }
       
   public void depositar(double valor){
       
       if(getStatus() == true){
           this.setSaldo(this.getSaldo() + valor);
           System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta de " + this.getDonoConta());
       }else{
           System.out.println("Não foi possivel depositar, pois a conta está fechada.");
       }
   }
       
   public void sacar(double valor) {
    if (getStatus() == false) {
        System.out.println("Erro! Impossível sacar de uma conta fechada.");
    } else if (getSaldo() < valor) {
        System.out.println("Erro! Saldo insuficiente para o saque.");
    } else {
        this.setSaldo(getSaldo() - valor);
        System.out.println("Saque de R$" + valor + " realizado com sucesso na conta de " + this.getDonoConta());
    }
}
   
    public void pagarMensalidade() {
        if (getStatus() == true) {
            if (this.getTipoConta().equals("cc")) {
                if (this.getSaldo() >= 12) {
                    this.setSaldo(getSaldo() - 12);
                    System.out.println("Mensalidade de R$12,00 paga com sucesso da conta de " + this.getDonoConta());
                } else {
                    System.out.println("Saldo insuficiente para pagar a mensalidade!");
                }

            } else if (this.getTipoConta().equals("cp")) {
                if (this.getSaldo() >= 20) {
                    this.setSaldo(getSaldo() - 20);
                    System.out.println("Mensalidade de R$20,00 paga com sucesso da conta de " + this.getDonoConta());
                } else {
                    System.out.println("Saldo insuficiente para pagar a mensalidade!");
                }

            } else {
                System.out.println("Não é possivel cobrar mensalidade de uma conta fechada.");
            }
        }
    }
    
    //métodos getters e setters dos atributos da classe 
    public int getNumConta() {
        return numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
