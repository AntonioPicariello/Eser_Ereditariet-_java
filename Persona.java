class Persona {
    private String cognome;
    private String nome;
    
    public Persona(String cognome, String nome){
        this.cognome = cognome;
        this.nome = nome;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    String getNome(){
        return this.nome;
    }
    
    String getCognome(){
        return this.cognome;
    }
    
    void stampa(){
        System.out.printf("\nNome : %s", this.nome);
        System.out.printf(" Cognome : %s", this.cognome);
    }
    
}