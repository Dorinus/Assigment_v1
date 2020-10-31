package mediator;

import model.Temperature;
import util.PropretyChangeSubject;

public interface TemperatureModel extends PropretyChangeSubject
{
  void addTemperature(String id, double temperature);
  Temperature getLastInsertedTemperature();
  Temperature getLastInsertedTemperature(String id);
  int getPower();
}
