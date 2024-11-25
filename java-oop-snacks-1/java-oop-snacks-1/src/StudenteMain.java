public class StudenteMain {
    public static void main(String[] args) throws Exception {

        Studente studente1 = new Studente("Claudia", "Cappella", 28);
        Studente studente2 = new Studente("Giulia", "Rossi", 25);

        System.out.println(studente2.getValori());


        RegistroStudenti listaStudenti = new RegistroStudenti();

        listaStudenti.addStudents(studente1);
        listaStudenti.addStudents(studente2);
        listaStudenti.getRegistro();


    }
}
