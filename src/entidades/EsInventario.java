package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EsInventario generated by hbm2java
 */
public class EsInventario  implements java.io.Serializable {


     private int inventarioId;
     private EsComissaoInventario esComissaoInventario;
     private EsDeposito esDeposito;
     private EsInventarioTipo esInventarioTipo;
     private Gusuario gusuario;
     private String responsavelId;
     private String descricao;
     private Date dataAbertura;
     private Date dataFechamento;
     private char status;
     private String obs;
     private String estornoMotivo;
     private Date estornoData;
     private String estornoGusuarioId;
     private Date gacesso;
     private long srRecno;
     private Set esInventarioItems = new HashSet(0);

    public EsInventario() {
    }

	
    public EsInventario(int inventarioId, EsComissaoInventario esComissaoInventario, EsDeposito esDeposito, EsInventarioTipo esInventarioTipo, Gusuario gusuario, String responsavelId, String descricao, Date dataAbertura, char status, Date gacesso, long srRecno) {
        this.inventarioId = inventarioId;
        this.esComissaoInventario = esComissaoInventario;
        this.esDeposito = esDeposito;
        this.esInventarioTipo = esInventarioTipo;
        this.gusuario = gusuario;
        this.responsavelId = responsavelId;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.gacesso = gacesso;
        this.srRecno = srRecno;
    }
    public EsInventario(int inventarioId, EsComissaoInventario esComissaoInventario, EsDeposito esDeposito, EsInventarioTipo esInventarioTipo, Gusuario gusuario, String responsavelId, String descricao, Date dataAbertura, Date dataFechamento, char status, String obs, String estornoMotivo, Date estornoData, String estornoGusuarioId, Date gacesso, long srRecno, Set esInventarioItems) {
       this.inventarioId = inventarioId;
       this.esComissaoInventario = esComissaoInventario;
       this.esDeposito = esDeposito;
       this.esInventarioTipo = esInventarioTipo;
       this.gusuario = gusuario;
       this.responsavelId = responsavelId;
       this.descricao = descricao;
       this.dataAbertura = dataAbertura;
       this.dataFechamento = dataFechamento;
       this.status = status;
       this.obs = obs;
       this.estornoMotivo = estornoMotivo;
       this.estornoData = estornoData;
       this.estornoGusuarioId = estornoGusuarioId;
       this.gacesso = gacesso;
       this.srRecno = srRecno;
       this.esInventarioItems = esInventarioItems;
    }
   
    public int getInventarioId() {
        return this.inventarioId;
    }
    
    public void setInventarioId(int inventarioId) {
        this.inventarioId = inventarioId;
    }
    public EsComissaoInventario getEsComissaoInventario() {
        return this.esComissaoInventario;
    }
    
    public void setEsComissaoInventario(EsComissaoInventario esComissaoInventario) {
        this.esComissaoInventario = esComissaoInventario;
    }
    public EsDeposito getEsDeposito() {
        return this.esDeposito;
    }
    
    public void setEsDeposito(EsDeposito esDeposito) {
        this.esDeposito = esDeposito;
    }
    public EsInventarioTipo getEsInventarioTipo() {
        return this.esInventarioTipo;
    }
    
    public void setEsInventarioTipo(EsInventarioTipo esInventarioTipo) {
        this.esInventarioTipo = esInventarioTipo;
    }
    public Gusuario getGusuario() {
        return this.gusuario;
    }
    
    public void setGusuario(Gusuario gusuario) {
        this.gusuario = gusuario;
    }
    public String getResponsavelId() {
        return this.responsavelId;
    }
    
    public void setResponsavelId(String responsavelId) {
        this.responsavelId = responsavelId;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getDataAbertura() {
        return this.dataAbertura;
    }
    
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public Date getDataFechamento() {
        return this.dataFechamento;
    }
    
    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
    public char getStatus() {
        return this.status;
    }
    
    public void setStatus(char status) {
        this.status = status;
    }
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(String obs) {
        this.obs = obs;
    }
    public String getEstornoMotivo() {
        return this.estornoMotivo;
    }
    
    public void setEstornoMotivo(String estornoMotivo) {
        this.estornoMotivo = estornoMotivo;
    }
    public Date getEstornoData() {
        return this.estornoData;
    }
    
    public void setEstornoData(Date estornoData) {
        this.estornoData = estornoData;
    }
    public String getEstornoGusuarioId() {
        return this.estornoGusuarioId;
    }
    
    public void setEstornoGusuarioId(String estornoGusuarioId) {
        this.estornoGusuarioId = estornoGusuarioId;
    }
    public Date getGacesso() {
        return this.gacesso;
    }
    
    public void setGacesso(Date gacesso) {
        this.gacesso = gacesso;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Set getEsInventarioItems() {
        return this.esInventarioItems;
    }
    
    public void setEsInventarioItems(Set esInventarioItems) {
        this.esInventarioItems = esInventarioItems;
    }




}


