package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CpCconsumo generated by hbm2java
 */
public class CpCconsumo  implements java.io.Serializable {


     private CpCconsumoId id;
     private CpSecretaria cpSecretaria;
     private String nome;
     private String localiza;
     private String endereco;
     private String responsa;
     private long srRecno;
     private Date gacesso;
     private Set cpRequisis = new HashSet(0);
     private Set cpSolMats = new HashSet(0);

    public CpCconsumo() {
    }

	
    public CpCconsumo(CpCconsumoId id, CpSecretaria cpSecretaria, String nome, long srRecno) {
        this.id = id;
        this.cpSecretaria = cpSecretaria;
        this.nome = nome;
        this.srRecno = srRecno;
    }
    public CpCconsumo(CpCconsumoId id, CpSecretaria cpSecretaria, String nome, String localiza, String endereco, String responsa, long srRecno, Date gacesso, Set cpRequisis, Set cpSolMats) {
       this.id = id;
       this.cpSecretaria = cpSecretaria;
       this.nome = nome;
       this.localiza = localiza;
       this.endereco = endereco;
       this.responsa = responsa;
       this.srRecno = srRecno;
       this.gacesso = gacesso;
       this.cpRequisis = cpRequisis;
       this.cpSolMats = cpSolMats;
    }
   
    public CpCconsumoId getId() {
        return this.id;
    }
    
    public void setId(CpCconsumoId id) {
        this.id = id;
    }
    public CpSecretaria getCpSecretaria() {
        return this.cpSecretaria;
    }
    
    public void setCpSecretaria(CpSecretaria cpSecretaria) {
        this.cpSecretaria = cpSecretaria;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocaliza() {
        return this.localiza;
    }
    
    public void setLocaliza(String localiza) {
        this.localiza = localiza;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getResponsa() {
        return this.responsa;
    }
    
    public void setResponsa(String responsa) {
        this.responsa = responsa;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Date getGacesso() {
        return this.gacesso;
    }
    
    public void setGacesso(Date gacesso) {
        this.gacesso = gacesso;
    }
    public Set getCpRequisis() {
        return this.cpRequisis;
    }
    
    public void setCpRequisis(Set cpRequisis) {
        this.cpRequisis = cpRequisis;
    }
    public Set getCpSolMats() {
        return this.cpSolMats;
    }
    
    public void setCpSolMats(Set cpSolMats) {
        this.cpSolMats = cpSolMats;
    }




}

