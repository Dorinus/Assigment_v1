package external.Radiator;

public class Power2State implements RadiatorState
{
  private final int power = 2;

  @Override public void turnUp(Radiator radiator)
  {
    radiator.setPowerState(new Power3State(radiator));
  }

  @Override public void turnDown(Radiator radiator)
  {
radiator.setPowerState(new Power1State());
  }

  @Override public int getPower()
  {
    return power;
  }
}
