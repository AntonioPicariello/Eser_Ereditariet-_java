class Professore extends Persona{
    private String materia;
    private String scuola;
    private String ruolo;
    
    public Professore(String cognome, String nome, String materia, String scuola, String ruolo){
        super(cognome,nome);
        this.materia = materia;
        this.scuola = scuola;
        this.ruolo = ruolo;
    }
    
    public void stampa(){
        super.stampa();
        System.out.printf("  materia : %s ", this.materia);
        System.out.printf(" scuola : %s ", this.scuola);
        System.out.printf(" ruolo : %s ",this.ruolo);
    }
    
    
    
    
    
    
}