package view.main;

import core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainViewController
{
  @FXML private Label firstThermTextField;
  @FXML private Label secondThermTextField;
  @FXML private Label thirdThermTextField;
  @FXML private Label errorLabel;
  private ViewHandler viewHandler;
  private MainViewModel viewModel;

  public void init(ViewHandler vh, MainViewModel vm){
    viewHandler = vh;
    viewModel = vm;
  }






  @FXML private void onSecondScreen(ActionEvent actionEvent)
  {
    viewHandler.openSecondScreen();
  }

  public void onUpButton(ActionEvent actionEvent)
  {
    viewModel.addPower();
  }

  public void onDownButton(ActionEvent actionEvent)
  {
    viewModel.lowerPower();
  }
}
