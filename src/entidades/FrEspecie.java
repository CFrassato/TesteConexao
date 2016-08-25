package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * FrEspecie generated by hbm2java
 */
public class FrEspecie  implements java.io.Serializable {


     private int especieId;
     private String especie;
     private long srRecno;
     private Set frVeiculos = new HashSet(0);

    public FrEspecie() {
    }

	
    public FrEspecie(int especieId, String especie, long srRecno) {
        this.especieId = especieId;
        this.especie = especie;
        this.srRecno = srRecno;
    }
    public FrEspecie(int especieId, String especie, long srRecno, Set frVeiculos) {
       this.especieId = especieId;
       this.especie = especie;
       this.srRecno = srRecno;
       this.frVeiculos = frVeiculos;
    }
   
    public int getEspecieId() {
        return this.especieId;
    }
    
    public void setEspecieId(int especieId) {
        this.especieId = especieId;
    }
    public String getEspecie() {
        return this.especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Set getFrVeiculos() {
        return this.frVeiculos;
    }
    
    public void setFrVeiculos(Set frVeiculos) {
        this.frVeiculos = frVeiculos;
    }




}


