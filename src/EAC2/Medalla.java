package EAC2;

import EAC2.Atleta;

public class Medalla {

    static final int MEDALLA_OR = 1;
    static final int MEDALLA_ARGENT = 2;
    static final int MEDALLA_BRONZE = 3;
    
    private static int NumMedallesRepartides = 0;
  
    int posicio;
    Atleta atleta;
    
    public static int getNumMedallesRepartides() {
        return NumMedallesRepartides;
    }

    
    public Medalla(int posicio, Atleta guanyador) {
        this.posicio = posicio;
        this.atleta = guanyador;
        atleta.pais.novaMedalla(this);
        atleta.guanyarMedalla(this);
        NumMedallesRepartides++;
     
    	if (this.posicio = 1) {
    		return posicio1();
    	}
    	
    	

  
}
    	
    
    
	private int posicio1(int posicio, Atleta guanyador) {
		this.posicio = 1;
		this.atleta = guanyador;
		atleta.pais.novaMedalla(this);
		atleta.guanyarMedalla(this);
		NumMedallesRepartides++;
		return MEDALLA_OR;
}
		
	private int posicio2(int posicio, Atleta guanyador) {
		this.posicio = 2;
		this.atleta = guanyador;
		atleta.pais.novaMedalla(this);
		atleta.guanyarMedalla(this);
		NumMedallesRepartides++;
		return MEDALLA_ARGENT;
}
	private int posicio3(int posicio, Atleta guanyador) {
		this.posicio = 3;
		this.atleta = guanyador;
		atleta.pais.novaMedalla(this);
		atleta.guanyarMedalla(this);
		NumMedallesRepartides++;
		return MEDALLA_BRONZE;
	}

	public String descripcio() {
		// TODO Auto-generated method stub
		return "L'atleta " + atleta.nom + " ha guanyat una medalla en obtenir la posició " + posicio + 
				" a la seva prova de " + atleta.disciplina;
	
		
	
	
	
	}



}