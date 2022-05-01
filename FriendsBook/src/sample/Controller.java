package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label textDisplayName;
    public Label textDisplayAge;
    public Label textDisplayInstagram;
    public TextField txtName;
    public TextField txtAge;
    public TextField txtInstagram;
    public ListView<Person> personList = new ListView<>( );

    public void delete(ActionEvent actionEvent) {
        Person temp;
        temp = personList.getSelectionModel().getSelectedItem();
        personList.getItems().remove(temp);
    }

    public void add(ActionEvent actionEvent)
    {
        Person temp = new Person(txtName.getText(), Integer.parseInt(txtAge.getText()), txtInstagram.getText());
        personList.getItems().add(temp);
        txtName.clear();
        txtAge.clear();
        txtInstagram.clear();
    }

    public void display(MouseEvent mouseEvent) {
        Person temp;
        temp = personList.getSelectionModel().getSelectedItem();
        textDisplayName.setText(temp.name);
        textDisplayAge.setText(Integer.toString(temp.getAge()));
        textDisplayInstagram.setText(temp.getInsta());
    }


}
