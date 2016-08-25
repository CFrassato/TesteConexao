package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * FrModelo generated by hbm2java
 */
public class FrModelo  implements java.io.Serializable {


     private int modeloId;
     private FrMarca frMarca;
     private String modelo;
     private long srRecno;
     private Set frVeiculos = new HashSet(0);

    public FrModelo() {
    }

	
    public FrModelo(int modeloId, FrMarca frMarca, String modelo, long srRecno) {
        this.modeloId = modeloId;
        this.frMarca = frMarca;
        this.modelo = modelo;
        this.srRecno = srRecno;
    }
    public FrModelo(int modeloId, FrMarca frMarca, String modelo, long srRecno, Set frVeiculos) {
       this.modeloId = modeloId;
       this.frMarca = frMarca;
       this.modelo = modelo;
       this.srRecno = srRecno;
       this.frVeiculos = frVeiculos;
    }
   
    public int getModeloId() {
        return this.modeloId;
    }
    
    public void setModeloId(int modeloId) {
        this.modeloId = modeloId;
    }
    public FrMarca getFrMarca() {
        return this.frMarca;
    }
    
    public void setFrMarca(FrMarca frMarca) {
        this.frMarca = frMarca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
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


