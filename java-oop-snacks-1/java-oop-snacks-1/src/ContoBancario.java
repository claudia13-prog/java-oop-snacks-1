public class ContoBancario {

    // variabili d'istanza
    private int accountNumber;
    private double accountBalance; 

    // costruttore
    public ContoBancario(int accountNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    // metodo per depositare denaro sul conto
    public void deposit(double amount){
        if(amount > 0){
            this.accountBalance += amount;
            System.out.println("Hai despositato € " + amount);

        }else{
            System.out.println("L'importo deve essere positivo e maggiore di 0");
        }
    }

    // metodo per prelevare denaro dal conto

    public void withdraw(double amount){
        if(amount > 0){
            this.accountBalance -= amount;
            System.out.println("Hai prelevato € " + amount);

        }else{
            System.out.println("L'importo deve essere positivo e maggiore di 0");
        }

    }

    // metodo per ottenere il saldo corrente
    public String getAccountBalance(){
        return "Il saldo corrente del conto bancario n. " + this.accountNumber + " è di " + this.accountBalance;
    }


}
