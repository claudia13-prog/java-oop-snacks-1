public class RegistroStudenti {

    private Studente[] registro;
    private int contatore;

    // costruttore

    public RegistroStudenti(){
        this.registro = new Studente[10];
        this.contatore = 0;
    }

    // metodo per aggiungere studenti al registro

    public void addStudents(Studente studente){

        if(contatore < registro.length){
            this.registro[contatore] = studente;
            contatore++;
        }
    }

    // metodo che stampa lista studenti
    public void getRegistro(){
        for(int i = 0; i < contatore; i++){
            System.out.println(this.registro[i]);
        }
    }

}
