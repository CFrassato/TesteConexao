package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EsComissaoInventario generated by hbm2java
 */
public class EsComissaoInventario  implements java.io.Serializable {


     private int comissaoId;
     private Date dtPortaria1;
     private Date dtPortaria2;
     private String nrPortaria;
     private String arqTxt;
     private long srRecno;
     private Set esInventarios = new HashSet(0);
     private Set esProcessoInventarios = new HashSet(0);
     private Set esComissaoDepositos = new HashSet(0);
     private Set esComInventarioMembros = new HashSet(0);

    public EsComissaoInventario() {
    }

	
    public EsComissaoInventario(int comissaoId, long srRecno) {
        this.comissaoId = comissaoId;
        this.srRecno = srRecno;
    }
    public EsComissaoInventario(int comissaoId, Date dtPortaria1, Date dtPortaria2, String nrPortaria, String arqTxt, long srRecno, Set esInventarios, Set esProcessoInventarios, Set esComissaoDepositos, Set esComInventarioMembros) {
       this.comissaoId = comissaoId;
       this.dtPortaria1 = dtPortaria1;
       this.dtPortaria2 = dtPortaria2;
       this.nrPortaria = nrPortaria;
       this.arqTxt = arqTxt;
       this.srRecno = srRecno;
       this.esInventarios = esInventarios;
       this.esProcessoInventarios = esProcessoInventarios;
       this.esComissaoDepositos = esComissaoDepositos;
       this.esComInventarioMembros = esComInventarioMembros;
    }
   
    public int getComissaoId() {
        return this.comissaoId;
    }
    
    public void setComissaoId(int comissaoId) {
        this.comissaoId = comissaoId;
    }
    public Date getDtPortaria1() {
        return this.dtPortaria1;
    }
    
    public void setDtPortaria1(Date dtPortaria1) {
        this.dtPortaria1 = dtPortaria1;
    }
    public Date getDtPortaria2() {
        return this.dtPortaria2;
    }
    
    public void setDtPortaria2(Date dtPortaria2) {
        this.dtPortaria2 = dtPortaria2;
    }
    public String getNrPortaria() {
        return this.nrPortaria;
    }
    
    public void setNrPortaria(String nrPortaria) {
        this.nrPortaria = nrPortaria;
    }
    public String getArqTxt() {
        return this.arqTxt;
    }
    
    public void setArqTxt(String arqTxt) {
        this.arqTxt = arqTxt;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Set getEsInventarios() {
        return this.esInventarios;
    }
    
    public void setEsInventarios(Set esInventarios) {
        this.esInventarios = esInventarios;
    }
    public Set getEsProcessoInventarios() {
        return this.esProcessoInventarios;
    }
    
    public void setEsProcessoInventarios(Set esProcessoInventarios) {
        this.esProcessoInventarios = esProcessoInventarios;
    }
    public Set getEsComissaoDepositos() {
        return this.esComissaoDepositos;
    }
    
    public void setEsComissaoDepositos(Set esComissaoDepositos) {
        this.esComissaoDepositos = esComissaoDepositos;
    }
    public Set getEsComInventarioMembros() {
        return this.esComInventarioMembros;
    }
    
    public void setEsComInventarioMembros(Set esComInventarioMembros) {
        this.esComInventarioMembros = esComInventarioMembros;
    }




}

