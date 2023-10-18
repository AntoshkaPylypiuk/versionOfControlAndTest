package ua.lv.pylypiuk.anton.youtubetutorialfxdb;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxOther;

    @FXML
    private TextField signUpCountry;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpName;

    @FXML
    private Label welcomeText;

    @FXML
    void initialize() {

        SignUpButton.setOnAction(actionEvent -> {

            signUpNewUser();
        });
    }
    private void signUpNewUser() {

        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpLastName.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String location = signUpCountry.getText();
        String gender = "";
        if (signUpCheckBoxMale.isSelected())
            gender = "Чоловік";
        if (signUpCheckBoxFemale.isSelected())
            gender = "Жінка";
        else
            gender = "Бойовий вертоліт";

        User user = new User(firstName,lastName,userName,password,location,gender);

        dbHandler.signUpUser(user);
    }
}
