package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1



/**
 * CpProtocoloId generated by hbm2java
 */
public class CpProtocoloId  implements java.io.Serializable {


     private int anoProtoco;
     private int numero;

    public CpProtocoloId() {
    }

    public CpProtocoloId(int anoProtoco, int numero) {
       this.anoProtoco = anoProtoco;
       this.numero = numero;
    }
   
    public int getAnoProtoco() {
        return this.anoProtoco;
    }
    
    public void setAnoProtoco(int anoProtoco) {
        this.anoProtoco = anoProtoco;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CpProtocoloId) ) return false;
		 CpProtocoloId castOther = ( CpProtocoloId ) other; 
         
		 return (this.getAnoProtoco()==castOther.getAnoProtoco())
 && (this.getNumero()==castOther.getNumero());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAnoProtoco();
         result = 37 * result + this.getNumero();
         return result;
   }   


}


