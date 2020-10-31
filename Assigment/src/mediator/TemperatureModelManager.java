package mediator;

import external.Radiator.Radiator;
import model.Temperature;
import model.TemperatureList;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TemperatureModelManager implements TemperatureModel
{

  private PropertyChangeSupport support;
  private TemperatureList list;
  private Radiator radiator;

  public TemperatureModelManager()
  {
    support = new PropertyChangeSupport(this);
    list = new TemperatureList();
  }

  @Override public void addTemperature(String id, double temperature)
  {
    Temperature newTemp = new Temperature(id, temperature);
    list.addTemperature(newTemp);
    support.firePropertyChange(id, null, newTemp);
  }

  @Override public Temperature getLastInsertedTemperature()
  {
    return list.getTemperature(list.getSize()-1);
  }

  @Override public Temperature getLastInsertedTemperature(String id)
  {
    return list.getLastTemperature(id);
  }

  @Override public int getPower()
  {
    return radiator.getPower();
  }

  @Override public void addPropretyChangeListener(PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }

  @Override public void addPropretyChangeListener(String eventName, PropertyChangeListener listener)
  {
    if(eventName.equals("")) addPropretyChangeListener(listener);
    support.addPropertyChangeListener(eventName,listener);
  }

  @Override public void removePropretyChangeListener(PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);
  }

  @Override public void removePropretyChangeListener(String eventName, PropertyChangeListener listener)
  {
    if(eventName.equals("")) removePropretyChangeListener(listener);
    support.removePropertyChangeListener(eventName,listener);
  }
}
