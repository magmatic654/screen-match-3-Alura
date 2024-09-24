package com.aluracursos.screenmatch.calculations;

public class RecomendationFilter {
    public void filter(Clasification clasification){
        if (clasification.getClasification() >= 4) {
            System.out.println("Valoraciones muy positivas");
        } else if (clasification.getClasification() >=2) {
            System.out.println("Valoraciones alternativas");
        }else{
            System.out.println("No es para todos");
        }
    }
}
