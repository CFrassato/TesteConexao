package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TceMtTipoMovimentoMaterial generated by hbm2java
 */
public class TceMtTipoMovimentoMaterial  implements java.io.Serializable {


     private String tmmCodigo;
     private String tmmDescricao;
     private long srRecno;
     private Set esTipoAplicacaos = new HashSet(0);
     private Set esTipoRetiradas = new HashSet(0);

    public TceMtTipoMovimentoMaterial() {
    }

	
    public TceMtTipoMovimentoMaterial(String tmmCodigo, String tmmDescricao, long srRecno) {
        this.tmmCodigo = tmmCodigo;
        this.tmmDescricao = tmmDescricao;
        this.srRecno = srRecno;
    }
    public TceMtTipoMovimentoMaterial(String tmmCodigo, String tmmDescricao, long srRecno, Set esTipoAplicacaos, Set esTipoRetiradas) {
       this.tmmCodigo = tmmCodigo;
       this.tmmDescricao = tmmDescricao;
       this.srRecno = srRecno;
       this.esTipoAplicacaos = esTipoAplicacaos;
       this.esTipoRetiradas = esTipoRetiradas;
    }
   
    public String getTmmCodigo() {
        return this.tmmCodigo;
    }
    
    public void setTmmCodigo(String tmmCodigo) {
        this.tmmCodigo = tmmCodigo;
    }
    public String getTmmDescricao() {
        return this.tmmDescricao;
    }
    
    public void setTmmDescricao(String tmmDescricao) {
        this.tmmDescricao = tmmDescricao;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Set getEsTipoAplicacaos() {
        return this.esTipoAplicacaos;
    }
    
    public void setEsTipoAplicacaos(Set esTipoAplicacaos) {
        this.esTipoAplicacaos = esTipoAplicacaos;
    }
    public Set getEsTipoRetiradas() {
        return this.esTipoRetiradas;
    }
    
    public void setEsTipoRetiradas(Set esTipoRetiradas) {
        this.esTipoRetiradas = esTipoRetiradas;
    }




}


