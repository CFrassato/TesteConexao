package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Gempresa generated by hbm2java
 */
public class Gempresa  implements java.io.Serializable {


     private int gempresaId;
     private String nomeEmpresa;
     private String estado;
     private String cnpj;
     private String endereco;
     private String cidade;
     private String uf;
     private String cep;
     private String exercicio;
     private byte[] brasao;
     private long srRecno;
     private String fone;
     private Date gacesso;
     private String nomeSecretaria;
     private byte[] brasaoEstado;
     private Integer tipoEmp;
     private String site;
     private String email;
     private String unidadeGest;
     private Set cpDespesas = new HashSet(0);
     private Set orCredors = new HashSet(0);
     private Set orNatDesps = new HashSet(0);

    public Gempresa() {
    }

	
    public Gempresa(int gempresaId, String nomeEmpresa, long srRecno) {
        this.gempresaId = gempresaId;
        this.nomeEmpresa = nomeEmpresa;
        this.srRecno = srRecno;
    }
    public Gempresa(int gempresaId, String nomeEmpresa, String estado, String cnpj, String endereco, String cidade, String uf, String cep, String exercicio, byte[] brasao, long srRecno, String fone, Date gacesso, String nomeSecretaria, byte[] brasaoEstado, Integer tipoEmp, String site, String email, String unidadeGest, Set cpDespesas, Set orCredors, Set orNatDesps) {
       this.gempresaId = gempresaId;
       this.nomeEmpresa = nomeEmpresa;
       this.estado = estado;
       this.cnpj = cnpj;
       this.endereco = endereco;
       this.cidade = cidade;
       this.uf = uf;
       this.cep = cep;
       this.exercicio = exercicio;
       this.brasao = brasao;
       this.srRecno = srRecno;
       this.fone = fone;
       this.gacesso = gacesso;
       this.nomeSecretaria = nomeSecretaria;
       this.brasaoEstado = brasaoEstado;
       this.tipoEmp = tipoEmp;
       this.site = site;
       this.email = email;
       this.unidadeGest = unidadeGest;
       this.cpDespesas = cpDespesas;
       this.orCredors = orCredors;
       this.orNatDesps = orNatDesps;
    }
   
    public int getGempresaId() {
        return this.gempresaId;
    }
    
    public void setGempresaId(int gempresaId) {
        this.gempresaId = gempresaId;
    }
    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }
    
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getExercicio() {
        return this.exercicio;
    }
    
    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }
    public byte[] getBrasao() {
        return this.brasao;
    }
    
    public void setBrasao(byte[] brasao) {
        this.brasao = brasao;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public String getFone() {
        return this.fone;
    }
    
    public void setFone(String fone) {
        this.fone = fone;
    }
    public Date getGacesso() {
        return this.gacesso;
    }
    
    public void setGacesso(Date gacesso) {
        this.gacesso = gacesso;
    }
    public String getNomeSecretaria() {
        return this.nomeSecretaria;
    }
    
    public void setNomeSecretaria(String nomeSecretaria) {
        this.nomeSecretaria = nomeSecretaria;
    }
    public byte[] getBrasaoEstado() {
        return this.brasaoEstado;
    }
    
    public void setBrasaoEstado(byte[] brasaoEstado) {
        this.brasaoEstado = brasaoEstado;
    }
    public Integer getTipoEmp() {
        return this.tipoEmp;
    }
    
    public void setTipoEmp(Integer tipoEmp) {
        this.tipoEmp = tipoEmp;
    }
    public String getSite() {
        return this.site;
    }
    
    public void setSite(String site) {
        this.site = site;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUnidadeGest() {
        return this.unidadeGest;
    }
    
    public void setUnidadeGest(String unidadeGest) {
        this.unidadeGest = unidadeGest;
    }
    public Set getCpDespesas() {
        return this.cpDespesas;
    }
    
    public void setCpDespesas(Set cpDespesas) {
        this.cpDespesas = cpDespesas;
    }
    public Set getOrCredors() {
        return this.orCredors;
    }
    
    public void setOrCredors(Set orCredors) {
        this.orCredors = orCredors;
    }
    public Set getOrNatDesps() {
        return this.orNatDesps;
    }
    
    public void setOrNatDesps(Set orNatDesps) {
        this.orNatDesps = orNatDesps;
    }




}

