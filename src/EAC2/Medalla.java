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
     
    	if (this.posicio == 1) {
    		System.out.println(" Ha guanyat una medalla d'or ");
    	} else if (this.posicio == 2) {
    		System.out.println( "Ha guanyat una medalla d'argent" );
    	} else if (this.posicio == 3) {
    		System.out.println( "Ha guanyat una medalla de bronze" );
    	} else { 
    		System.out.println(" Ha guanyat una medalla no vàlida ");
    		
    	}
    		

  
}
    	
    
   
	public String descripcio() {
		// TODO Auto-generated method stub
		return "L'atleta " + atleta.nom + " ha guanyat una medalla en obtenir la posició " + posicio + 
				" a la seva prova de " + atleta.disciplina;
	
		
	
	
	
	}



}