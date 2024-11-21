public class Studente {

    // Attributi
    String nome;
    String cognome;
    int età;

    // Metodo Costruttore
    public Studente(String nome, String cognome, int età){
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;

    }

    public String getValori(){
        return this.nome + " " + this.cognome + ", " + this.età + " anni";
    }




}
