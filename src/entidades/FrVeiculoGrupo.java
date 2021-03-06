package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * FrVeiculoGrupo generated by hbm2java
 */
public class FrVeiculoGrupo  implements java.io.Serializable {


     private int veiculoGrupoId;
     private String descricao;
     private long srRecno;
     private Set frVeiculos = new HashSet(0);

    public FrVeiculoGrupo() {
    }

	
    public FrVeiculoGrupo(int veiculoGrupoId, String descricao, long srRecno) {
        this.veiculoGrupoId = veiculoGrupoId;
        this.descricao = descricao;
        this.srRecno = srRecno;
    }
    public FrVeiculoGrupo(int veiculoGrupoId, String descricao, long srRecno, Set frVeiculos) {
       this.veiculoGrupoId = veiculoGrupoId;
       this.descricao = descricao;
       this.srRecno = srRecno;
       this.frVeiculos = frVeiculos;
    }
   
    public int getVeiculoGrupoId() {
        return this.veiculoGrupoId;
    }
    
    public void setVeiculoGrupoId(int veiculoGrupoId) {
        this.veiculoGrupoId = veiculoGrupoId;
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
    public Set getFrVeiculos() {
        return this.frVeiculos;
    }
    
    public void setFrVeiculos(Set frVeiculos) {
        this.frVeiculos = frVeiculos;
    }




}


