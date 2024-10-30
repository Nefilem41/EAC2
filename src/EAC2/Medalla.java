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
		   
		if (this.posicio <= 3 && this.posicio >= 1) {
        
        this.atleta = guanyador;
        atleta.pais.novaMedalla(this);
        atleta.guanyarMedalla(this);
        NumMedallesRepartides++;
	   
		}
	 }

	public String descripcio() {
		
		if (this.posicio <= 3 && this.posicio >= 1) {
			
			String medalla = null; 
			
			switch (posicio) {
				case 1:
					
					medalla = " d'or ";
					
					break;
					
				case 2:
					
					medalla = " d'argent ";
				
					break;
				
				case 3:
					medalla = " de bronze ";
					
					break;	
			
				}
			
		return "L'atleta " + atleta.nom +  " ha guanyat una medalla" + medalla + " en obtenir la posició " + posicio + 
					" a la seva prova de " + atleta.disciplina;
		
		}
		return " Medalla no vàlida ";
		
		}
	}
