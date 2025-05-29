import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Armario {
  private List<Prenda> prendas = new ArrayList<>();

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public List<Prenda> filtrarRopaTempAdecuada(BigDecimal temperatura) {
    return (prendas.stream().filter(prenda -> prenda.cumpleTempAdecuada(temperatura))).collect(Collectors.toList());
  }

}
