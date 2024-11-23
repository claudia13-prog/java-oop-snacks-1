public class MainConto {

    // creo un metodo main per eseguire le operazioni sul conto
    public static void main(String[] args){

        // creo l'oggetto myAccount
        ContoBancario myAccount = new ContoBancario(123456789);

        // deposito soldi nel conto
        myAccount.deposit(500);

        // prelevo soldi da conto
        myAccount.withdraw(60);

        // ottengo saldo corrente
        System.out.println(myAccount.getAccountBalance());



    }

}
