package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CpRepresentante generated by hbm2java
 */
public class CpRepresentante  implements java.io.Serializable {


     private int representanteId;
     private OrCredor orCredor;
     private String representante;
     private String rg;
     private String cpf;
     private long srRecno;
     private Set cpSelecaos = new HashSet(0);

    public CpRepresentante() {
    }

	
    public CpRepresentante(int representanteId, OrCredor orCredor, String representante, long srRecno) {
        this.representanteId = representanteId;
        this.orCredor = orCredor;
        this.representante = representante;
        this.srRecno = srRecno;
    }
    public CpRepresentante(int representanteId, OrCredor orCredor, String representante, String rg, String cpf, long srRecno, Set cpSelecaos) {
       this.representanteId = representanteId;
       this.orCredor = orCredor;
       this.representante = representante;
       this.rg = rg;
       this.cpf = cpf;
       this.srRecno = srRecno;
       this.cpSelecaos = cpSelecaos;
    }
   
    public int getRepresentanteId() {
        return this.representanteId;
    }
    
    public void setRepresentanteId(int representanteId) {
        this.representanteId = representanteId;
    }
    public OrCredor getOrCredor() {
        return this.orCredor;
    }
    
    public void setOrCredor(OrCredor orCredor) {
        this.orCredor = orCredor;
    }
    public String getRepresentante() {
        return this.representante;
    }
    
    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Set getCpSelecaos() {
        return this.cpSelecaos;
    }
    
    public void setCpSelecaos(Set cpSelecaos) {
        this.cpSelecaos = cpSelecaos;
    }




}


