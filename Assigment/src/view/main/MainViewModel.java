package view.main;

import external.Radiator.RadiatorModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import mediator.TemperatureModel;

public class MainViewModel
{

  private StringProperty firstThermTextField, secondThermTextField,thirdThermTextField, errorLabel;
  private TemperatureModel temperatureModel;
  private RadiatorModel radiator;

  public MainViewModel(TemperatureModel temperatureModel, RadiatorModel radiator)
  {
    this.temperatureModel = temperatureModel;
    this.radiator  = radiator;
    firstThermTextField  = new SimpleStringProperty();
    secondThermTextField  = new SimpleStringProperty();
    thirdThermTextField  = new SimpleStringProperty();
    errorLabel  = new SimpleStringProperty();

    firstThermTextField.setValue(temperatureModel.getLastInsertedTemperature("t1").toString());
    secondThermTextField.setValue(temperatureModel.getLastInsertedTemperature("t2").toString());
    thirdThermTextField.setValue(temperatureModel.getLastInsertedTemperature("t3").toString());

  }

  public void addPower()
  {
    radiator.turnUp();
  }

  public void lowerPower()
  {
    radiator.turnDown();
  }


}
