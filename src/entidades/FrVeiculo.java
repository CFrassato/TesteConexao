package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * FrVeiculo generated by hbm2java
 */
public class FrVeiculo  implements java.io.Serializable {


     private int veiculoId;
     private CpCcusto cpCcusto;
     private FrCarroceria frCarroceria;
     private FrCombustivel frCombustivel;
     private FrCor frCor;
     private FrEspecie frEspecie;
     private FrMarca frMarca;
     private FrModelo frModelo;
     private FrTipo frTipo;
     private FrVeiculoGrupo frVeiculoGrupo;
     private String veiculo;
     private int anoFab;
     private int anoMod;
     private String placa;
     private String chassi;
     private String renavam;
     private String paTipoId;
     private String paSubtipoId;
     private String paVeiculoId;
     private long srRecno;
     private BigDecimal ltsTanque;
     private BigDecimal mediaIdeal;
     private int hodometro;
     private String cartao;
     private String horimetro;
     private Character desativado;
     private Integer lcBloqueio;
     private String finalidade;
     private String orgaoId;
     private String unidadeId;
     private Integer tipoVeiculo;
     private Integer lcMonitor;
     private Set esAplicDiretaItemCombs = new HashSet(0);
     private Set esAvaliacaoItensVeiculos = new HashSet(0);
     private Set lcCombDisps = new HashSet(0);
     private Set esAcessoriosVeiculos = new HashSet(0);
     private Set esMultas = new HashSet(0);
     private Set esMotoristaVeics = new HashSet(0);

    public FrVeiculo() {
    }

	
    public FrVeiculo(int veiculoId, FrCombustivel frCombustivel, FrCor frCor, FrMarca frMarca, FrModelo frModelo, FrTipo frTipo, String veiculo, int anoFab, int anoMod, String placa, String chassi, String renavam, long srRecno, int hodometro, String horimetro) {
        this.veiculoId = veiculoId;
        this.frCombustivel = frCombustivel;
        this.frCor = frCor;
        this.frMarca = frMarca;
        this.frModelo = frModelo;
        this.frTipo = frTipo;
        this.veiculo = veiculo;
        this.anoFab = anoFab;
        this.anoMod = anoMod;
        this.placa = placa;
        this.chassi = chassi;
        this.renavam = renavam;
        this.srRecno = srRecno;
        this.hodometro = hodometro;
        this.horimetro = horimetro;
    }
    public FrVeiculo(int veiculoId, CpCcusto cpCcusto, FrCarroceria frCarroceria, FrCombustivel frCombustivel, FrCor frCor, FrEspecie frEspecie, FrMarca frMarca, FrModelo frModelo, FrTipo frTipo, FrVeiculoGrupo frVeiculoGrupo, String veiculo, int anoFab, int anoMod, String placa, String chassi, String renavam, String paTipoId, String paSubtipoId, String paVeiculoId, long srRecno, BigDecimal ltsTanque, BigDecimal mediaIdeal, int hodometro, String cartao, String horimetro, Character desativado, Integer lcBloqueio, String finalidade, String orgaoId, String unidadeId, Integer tipoVeiculo, Integer lcMonitor, Set esAplicDiretaItemCombs, Set esAvaliacaoItensVeiculos, Set lcCombDisps, Set esAcessoriosVeiculos, Set esMultas, Set esMotoristaVeics) {
       this.veiculoId = veiculoId;
       this.cpCcusto = cpCcusto;
       this.frCarroceria = frCarroceria;
       this.frCombustivel = frCombustivel;
       this.frCor = frCor;
       this.frEspecie = frEspecie;
       this.frMarca = frMarca;
       this.frModelo = frModelo;
       this.frTipo = frTipo;
       this.frVeiculoGrupo = frVeiculoGrupo;
       this.veiculo = veiculo;
       this.anoFab = anoFab;
       this.anoMod = anoMod;
       this.placa = placa;
       this.chassi = chassi;
       this.renavam = renavam;
       this.paTipoId = paTipoId;
       this.paSubtipoId = paSubtipoId;
       this.paVeiculoId = paVeiculoId;
       this.srRecno = srRecno;
       this.ltsTanque = ltsTanque;
       this.mediaIdeal = mediaIdeal;
       this.hodometro = hodometro;
       this.cartao = cartao;
       this.horimetro = horimetro;
       this.desativado = desativado;
       this.lcBloqueio = lcBloqueio;
       this.finalidade = finalidade;
       this.orgaoId = orgaoId;
       this.unidadeId = unidadeId;
       this.tipoVeiculo = tipoVeiculo;
       this.lcMonitor = lcMonitor;
       this.esAplicDiretaItemCombs = esAplicDiretaItemCombs;
       this.esAvaliacaoItensVeiculos = esAvaliacaoItensVeiculos;
       this.lcCombDisps = lcCombDisps;
       this.esAcessoriosVeiculos = esAcessoriosVeiculos;
       this.esMultas = esMultas;
       this.esMotoristaVeics = esMotoristaVeics;
    }
   
    public int getVeiculoId() {
        return this.veiculoId;
    }
    
    public void setVeiculoId(int veiculoId) {
        this.veiculoId = veiculoId;
    }
    public CpCcusto getCpCcusto() {
        return this.cpCcusto;
    }
    
    public void setCpCcusto(CpCcusto cpCcusto) {
        this.cpCcusto = cpCcusto;
    }
    public FrCarroceria getFrCarroceria() {
        return this.frCarroceria;
    }
    
    public void setFrCarroceria(FrCarroceria frCarroceria) {
        this.frCarroceria = frCarroceria;
    }
    public FrCombustivel getFrCombustivel() {
        return this.frCombustivel;
    }
    
    public void setFrCombustivel(FrCombustivel frCombustivel) {
        this.frCombustivel = frCombustivel;
    }
    public FrCor getFrCor() {
        return this.frCor;
    }
    
    public void setFrCor(FrCor frCor) {
        this.frCor = frCor;
    }
    public FrEspecie getFrEspecie() {
        return this.frEspecie;
    }
    
    public void setFrEspecie(FrEspecie frEspecie) {
        this.frEspecie = frEspecie;
    }
    public FrMarca getFrMarca() {
        return this.frMarca;
    }
    
    public void setFrMarca(FrMarca frMarca) {
        this.frMarca = frMarca;
    }
    public FrModelo getFrModelo() {
        return this.frModelo;
    }
    
    public void setFrModelo(FrModelo frModelo) {
        this.frModelo = frModelo;
    }
    public FrTipo getFrTipo() {
        return this.frTipo;
    }
    
    public void setFrTipo(FrTipo frTipo) {
        this.frTipo = frTipo;
    }
    public FrVeiculoGrupo getFrVeiculoGrupo() {
        return this.frVeiculoGrupo;
    }
    
    public void setFrVeiculoGrupo(FrVeiculoGrupo frVeiculoGrupo) {
        this.frVeiculoGrupo = frVeiculoGrupo;
    }
    public String getVeiculo() {
        return this.veiculo;
    }
    
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public int getAnoFab() {
        return this.anoFab;
    }
    
    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }
    public int getAnoMod() {
        return this.anoMod;
    }
    
    public void setAnoMod(int anoMod) {
        this.anoMod = anoMod;
    }
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getChassi() {
        return this.chassi;
    }
    
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getRenavam() {
        return this.renavam;
    }
    
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }
    public String getPaTipoId() {
        return this.paTipoId;
    }
    
    public void setPaTipoId(String paTipoId) {
        this.paTipoId = paTipoId;
    }
    public String getPaSubtipoId() {
        return this.paSubtipoId;
    }
    
    public void setPaSubtipoId(String paSubtipoId) {
        this.paSubtipoId = paSubtipoId;
    }
    public String getPaVeiculoId() {
        return this.paVeiculoId;
    }
    
    public void setPaVeiculoId(String paVeiculoId) {
        this.paVeiculoId = paVeiculoId;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public BigDecimal getLtsTanque() {
        return this.ltsTanque;
    }
    
    public void setLtsTanque(BigDecimal ltsTanque) {
        this.ltsTanque = ltsTanque;
    }
    public BigDecimal getMediaIdeal() {
        return this.mediaIdeal;
    }
    
    public void setMediaIdeal(BigDecimal mediaIdeal) {
        this.mediaIdeal = mediaIdeal;
    }
    public int getHodometro() {
        return this.hodometro;
    }
    
    public void setHodometro(int hodometro) {
        this.hodometro = hodometro;
    }
    public String getCartao() {
        return this.cartao;
    }
    
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    public String getHorimetro() {
        return this.horimetro;
    }
    
    public void setHorimetro(String horimetro) {
        this.horimetro = horimetro;
    }
    public Character getDesativado() {
        return this.desativado;
    }
    
    public void setDesativado(Character desativado) {
        this.desativado = desativado;
    }
    public Integer getLcBloqueio() {
        return this.lcBloqueio;
    }
    
    public void setLcBloqueio(Integer lcBloqueio) {
        this.lcBloqueio = lcBloqueio;
    }
    public String getFinalidade() {
        return this.finalidade;
    }
    
    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }
    public String getOrgaoId() {
        return this.orgaoId;
    }
    
    public void setOrgaoId(String orgaoId) {
        this.orgaoId = orgaoId;
    }
    public String getUnidadeId() {
        return this.unidadeId;
    }
    
    public void setUnidadeId(String unidadeId) {
        this.unidadeId = unidadeId;
    }
    public Integer getTipoVeiculo() {
        return this.tipoVeiculo;
    }
    
    public void setTipoVeiculo(Integer tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public Integer getLcMonitor() {
        return this.lcMonitor;
    }
    
    public void setLcMonitor(Integer lcMonitor) {
        this.lcMonitor = lcMonitor;
    }
    public Set getEsAplicDiretaItemCombs() {
        return this.esAplicDiretaItemCombs;
    }
    
    public void setEsAplicDiretaItemCombs(Set esAplicDiretaItemCombs) {
        this.esAplicDiretaItemCombs = esAplicDiretaItemCombs;
    }
    public Set getEsAvaliacaoItensVeiculos() {
        return this.esAvaliacaoItensVeiculos;
    }
    
    public void setEsAvaliacaoItensVeiculos(Set esAvaliacaoItensVeiculos) {
        this.esAvaliacaoItensVeiculos = esAvaliacaoItensVeiculos;
    }
    public Set getLcCombDisps() {
        return this.lcCombDisps;
    }
    
    public void setLcCombDisps(Set lcCombDisps) {
        this.lcCombDisps = lcCombDisps;
    }
    public Set getEsAcessoriosVeiculos() {
        return this.esAcessoriosVeiculos;
    }
    
    public void setEsAcessoriosVeiculos(Set esAcessoriosVeiculos) {
        this.esAcessoriosVeiculos = esAcessoriosVeiculos;
    }
    public Set getEsMultas() {
        return this.esMultas;
    }
    
    public void setEsMultas(Set esMultas) {
        this.esMultas = esMultas;
    }
    public Set getEsMotoristaVeics() {
        return this.esMotoristaVeics;
    }
    
    public void setEsMotoristaVeics(Set esMotoristaVeics) {
        this.esMotoristaVeics = esMotoristaVeics;
    }




}

