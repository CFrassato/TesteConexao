package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CpTipoCcusto generated by hbm2java
 */
public class CpTipoCcusto  implements java.io.Serializable {


     private int tipoCcustoId;
     private String descricao;
     private long srRecno;
     private Set cpCcustos = new HashSet(0);

    public CpTipoCcusto() {
    }

	
    public CpTipoCcusto(int tipoCcustoId, String descricao, long srRecno) {
        this.tipoCcustoId = tipoCcustoId;
        this.descricao = descricao;
        this.srRecno = srRecno;
    }
    public CpTipoCcusto(int tipoCcustoId, String descricao, long srRecno, Set cpCcustos) {
       this.tipoCcustoId = tipoCcustoId;
       this.descricao = descricao;
       this.srRecno = srRecno;
       this.cpCcustos = cpCcustos;
    }
   
    public int getTipoCcustoId() {
        return this.tipoCcustoId;
    }
    
    public void setTipoCcustoId(int tipoCcustoId) {
        this.tipoCcustoId = tipoCcustoId;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Set getCpCcustos() {
        return this.cpCcustos;
    }
    
    public void setCpCcustos(Set cpCcustos) {
        this.cpCcustos = cpCcustos;
    }




}

