package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1



/**
 * EsComissaoDeposito generated by hbm2java
 */
public class EsComissaoDeposito  implements java.io.Serializable {


     private int codigoId;
     private EsComissaoInventario esComissaoInventario;
     private String descricao;
     private Integer codDeposito;
     private long srRecno;

    public EsComissaoDeposito() {
    }

	
    public EsComissaoDeposito(int codigoId, long srRecno) {
        this.codigoId = codigoId;
        this.srRecno = srRecno;
    }
    public EsComissaoDeposito(int codigoId, EsComissaoInventario esComissaoInventario, String descricao, Integer codDeposito, long srRecno) {
       this.codigoId = codigoId;
       this.esComissaoInventario = esComissaoInventario;
       this.descricao = descricao;
       this.codDeposito = codDeposito;
       this.srRecno = srRecno;
    }
   
    public int getCodigoId() {
        return this.codigoId;
    }
    
    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }
    public EsComissaoInventario getEsComissaoInventario() {
        return this.esComissaoInventario;
    }
    
    public void setEsComissaoInventario(EsComissaoInventario esComissaoInventario) {
        this.esComissaoInventario = esComissaoInventario;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Integer getCodDeposito() {
        return this.codDeposito;
    }
    
    public void setCodDeposito(Integer codDeposito) {
        this.codDeposito = codDeposito;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }




}

