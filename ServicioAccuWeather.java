import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ServicioAccuWeather implements ServicioMeterorologico{

  AccuWeatherAPI apiClima;

  @Override
  public BigDecimal getTemperatura(String ciudad) {
    HashMap<String,Object> temperatura = (HashMap<String, Object>) apiClima.getWeather(ciudad).get(0).get("Temperature");
    String unidad = (String) temperatura.get("Unit");
    BigDecimal temp = BigDecimal.valueOf(Long.parseLong(temperatura.get("Value").toString()));
    if(unidad.equals("F")){
      long tempLng = Long.parseLong(temperatura.get("Value").toString());
      tempLng = (tempLng-32) *5/9;
      temp = BigDecimal.valueOf(tempLng);
    }
    return temp;
  }

  ServicioAccuWeather(AccuWeatherAPI api){
    this.apiClima = api;
  }



}
