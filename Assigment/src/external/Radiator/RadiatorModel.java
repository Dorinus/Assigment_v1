package external.Radiator;

public interface RadiatorModel
{
  void turnUp();
  void turnDown();
  int getPower();
  void setPowerState(RadiatorState state);
}
