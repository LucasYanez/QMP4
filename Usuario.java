import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
  Armario armarioUsuario = new Armario();
  BigDecimal temperatura;

  public List<Atuendo> generarSugerencia(){
    List<Prenda> prendasAdecuadas = armarioUsuario.filtrarRopaTempAdecuada(this.temperatura);
    return this.armarAtuendos(prendasAdecuadas);
  }

  void obtenerCondicionesClimaticas(ServicioMeterorologico apiClima, String ciudad){
    this.temperatura = apiClima.getTemperatura(ciudad);
  }

  List<Atuendo> armarAtuendos(List<Prenda> prendas){
    List<Atuendo> atuendos = new ArrayList<>();
    //logica de combinacion de prendas con la lista de prendas para armar atuendos.
    return atuendos;
  }

  //demas metodos.

}
