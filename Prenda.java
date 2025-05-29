import java.math.BigDecimal;

public class Prenda {
  //otros atributos.
  private BigDecimal tempAdecuada;

  public boolean cumpleTempAdecuada(BigDecimal temperatura) {
    boolean cumple;
    if(this.tempAdecuada.compareTo(temperatura) <= 0){
      return true;
    }else{
      return false;
    }
  }

  public void setTempAdecuada(BigDecimal tempAdecuada) {
    this.tempAdecuada = tempAdecuada;
  }

  //demas metodos.

}
