package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1



/**
 * EsAcessoriosVeiculo generated by hbm2java
 */
public class EsAcessoriosVeiculo  implements java.io.Serializable {


     private int acessorioVeiculoId;
     private EsItensVeiculo esItensVeiculo;
     private FrVeiculo frVeiculo;
     private long srRecno;

    public EsAcessoriosVeiculo() {
    }

    public EsAcessoriosVeiculo(int acessorioVeiculoId, EsItensVeiculo esItensVeiculo, FrVeiculo frVeiculo, long srRecno) {
       this.acessorioVeiculoId = acessorioVeiculoId;
       this.esItensVeiculo = esItensVeiculo;
       this.frVeiculo = frVeiculo;
       this.srRecno = srRecno;
    }
   
    public int getAcessorioVeiculoId() {
        return this.acessorioVeiculoId;
    }
    
    public void setAcessorioVeiculoId(int acessorioVeiculoId) {
        this.acessorioVeiculoId = acessorioVeiculoId;
    }
    public EsItensVeiculo getEsItensVeiculo() {
        return this.esItensVeiculo;
    }
    
    public void setEsItensVeiculo(EsItensVeiculo esItensVeiculo) {
        this.esItensVeiculo = esItensVeiculo;
    }
    public FrVeiculo getFrVeiculo() {
        return this.frVeiculo;
    }
    
    public void setFrVeiculo(FrVeiculo frVeiculo) {
        this.frVeiculo = frVeiculo;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }




}


