package external.Radiator;

import util.PropretyChangeSubject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Radiator implements PropretyChangeSubject, RadiatorModel
{
  private RadiatorState radiatorState;
  private PropertyChangeSupport support;

  public Radiator()
  {
    this.radiatorState = new OffState();
  }

  @Override  public void turnUp(){
    radiatorState.turnUp(this);
    support.firePropertyChange("TurnUp", null, getPower());
  }

  @Override public void turnDown(){
    radiatorState.turnDown(this);
    support.firePropertyChange("TurnDown" ,null, getPower());
  }

  @Override public int getPower(){
    return radiatorState.getPower();
  }

  @Override public  void setPowerState(RadiatorState state){
    radiatorState = state;
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
