package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CpCcusto generated by hbm2java
 */
public class CpCcusto  implements java.io.Serializable {


     private int ccustoId;
     private CpTipoCcusto cpTipoCcusto;
     private String ccusto;
     private long srRecno;
     private String responsavel;
     private Set esLoteRemedioBxes = new HashSet(0);
     private Set esRequisicaos = new HashSet(0);
     private Set esLoteRemedioBxes_1 = new HashSet(0);
     private Set esInventarioItemLotes = new HashSet(0);
     private Set esAplicacaoDiretas = new HashSet(0);
     private Set cpRequisis = new HashSet(0);
     private Set cpSolicitacaos = new HashSet(0);
     private Set frVeiculos = new HashSet(0);
     private Set esRetiradas = new HashSet(0);

    public CpCcusto() {
    }

	
    public CpCcusto(int ccustoId, String ccusto, long srRecno) {
        this.ccustoId = ccustoId;
        this.ccusto = ccusto;
        this.srRecno = srRecno;
    }
    public CpCcusto(int ccustoId, CpTipoCcusto cpTipoCcusto, String ccusto, long srRecno, String responsavel, Set esLoteRemedioBxes, Set esRequisicaos, Set esLoteRemedioBxes_1, Set esInventarioItemLotes, Set esAplicacaoDiretas, Set cpRequisis, Set cpSolicitacaos, Set frVeiculos, Set esRetiradas) {
       this.ccustoId = ccustoId;
       this.cpTipoCcusto = cpTipoCcusto;
       this.ccusto = ccusto;
       this.srRecno = srRecno;
       this.responsavel = responsavel;
       this.esLoteRemedioBxes = esLoteRemedioBxes;
       this.esRequisicaos = esRequisicaos;
       this.esLoteRemedioBxes_1 = esLoteRemedioBxes_1;
       this.esInventarioItemLotes = esInventarioItemLotes;
       this.esAplicacaoDiretas = esAplicacaoDiretas;
       this.cpRequisis = cpRequisis;
       this.cpSolicitacaos = cpSolicitacaos;
       this.frVeiculos = frVeiculos;
       this.esRetiradas = esRetiradas;
    }
   
    public int getCcustoId() {
        return this.ccustoId;
    }
    
    public void setCcustoId(int ccustoId) {
        this.ccustoId = ccustoId;
    }
    public CpTipoCcusto getCpTipoCcusto() {
        return this.cpTipoCcusto;
    }
    
    public void setCpTipoCcusto(CpTipoCcusto cpTipoCcusto) {
        this.cpTipoCcusto = cpTipoCcusto;
    }
    public String getCcusto() {
        return this.ccusto;
    }
    
    public void setCcusto(String ccusto) {
        this.ccusto = ccusto;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public String getResponsavel() {
        return this.responsavel;
    }
    
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public Set getEsLoteRemedioBxes() {
        return this.esLoteRemedioBxes;
    }
    
    public void setEsLoteRemedioBxes(Set esLoteRemedioBxes) {
        this.esLoteRemedioBxes = esLoteRemedioBxes;
    }
    public Set getEsRequisicaos() {
        return this.esRequisicaos;
    }
    
    public void setEsRequisicaos(Set esRequisicaos) {
        this.esRequisicaos = esRequisicaos;
    }
    public Set getEsLoteRemedioBxes_1() {
        return this.esLoteRemedioBxes_1;
    }
    
    public void setEsLoteRemedioBxes_1(Set esLoteRemedioBxes_1) {
        this.esLoteRemedioBxes_1 = esLoteRemedioBxes_1;
    }
    public Set getEsInventarioItemLotes() {
        return this.esInventarioItemLotes;
    }
    
    public void setEsInventarioItemLotes(Set esInventarioItemLotes) {
        this.esInventarioItemLotes = esInventarioItemLotes;
    }
    public Set getEsAplicacaoDiretas() {
        return this.esAplicacaoDiretas;
    }
    
    public void setEsAplicacaoDiretas(Set esAplicacaoDiretas) {
        this.esAplicacaoDiretas = esAplicacaoDiretas;
    }
    public Set getCpRequisis() {
        return this.cpRequisis;
    }
    
    public void setCpRequisis(Set cpRequisis) {
        this.cpRequisis = cpRequisis;
    }
    public Set getCpSolicitacaos() {
        return this.cpSolicitacaos;
    }
    
    public void setCpSolicitacaos(Set cpSolicitacaos) {
        this.cpSolicitacaos = cpSolicitacaos;
    }
    public Set getFrVeiculos() {
        return this.frVeiculos;
    }
    
    public void setFrVeiculos(Set frVeiculos) {
        this.frVeiculos = frVeiculos;
    }
    public Set getEsRetiradas() {
        return this.esRetiradas;
    }
    
    public void setEsRetiradas(Set esRetiradas) {
        this.esRetiradas = esRetiradas;
    }




}


