import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;
public class Test {

  ServicioMeteorologico apiClima = new ServicioAccuWeather(Mockito.mock(AccuWeatherApi));
  //tests implementando el mock de la api para evitar costos de tarifa al testear.
}
