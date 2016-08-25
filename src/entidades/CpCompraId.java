package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1



/**
 * CpCompraId generated by hbm2java
 */
public class CpCompraId  implements java.io.Serializable {


     private int ganoId;
     private int tipoCompraId;
     private int compraId;

    public CpCompraId() {
    }

    public CpCompraId(int ganoId, int tipoCompraId, int compraId) {
       this.ganoId = ganoId;
       this.tipoCompraId = tipoCompraId;
       this.compraId = compraId;
    }
   
    public int getGanoId() {
        return this.ganoId;
    }
    
    public void setGanoId(int ganoId) {
        this.ganoId = ganoId;
    }
    public int getTipoCompraId() {
        return this.tipoCompraId;
    }
    
    public void setTipoCompraId(int tipoCompraId) {
        this.tipoCompraId = tipoCompraId;
    }
    public int getCompraId() {
        return this.compraId;
    }
    
    public void setCompraId(int compraId) {
        this.compraId = compraId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CpCompraId) ) return false;
		 CpCompraId castOther = ( CpCompraId ) other; 
         
		 return (this.getGanoId()==castOther.getGanoId())
 && (this.getTipoCompraId()==castOther.getTipoCompraId())
 && (this.getCompraId()==castOther.getCompraId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getGanoId();
         result = 37 * result + this.getTipoCompraId();
         result = 37 * result + this.getCompraId();
         return result;
   }   


}


