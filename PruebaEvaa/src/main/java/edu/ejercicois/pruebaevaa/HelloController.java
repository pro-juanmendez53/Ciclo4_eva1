package edu.ejercicois.pruebaevaa;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

 //Inciso b
    @FXML
    private Label Label1s1;

 //Inciso a
    @FXML
    protected void Button1d1 ()
    {
        welcomeText.setText("Hola, has iniciado");
    }

 //Inciso c
    @FXML
    public TextField TextField1 ;
    @FXML
    private Label Label2;
    @FXML
    protected void Button2 ()
    {
        Label2.setText(TextField1.getText());
    }

 //Inciso d
    @FXML
    public TextArea TextArea1;
    @FXML
    public TextField TextField2;
    @FXML
    protected void Button3 ()
    {
        TextArea1.appendText(TextField2.getText() + "\n");
        TextField2.setText("");
    }

 //Inciso e
    @FXML
    public ChoiceBox<String> ChoiceBox1;
    public String [] food = {"pizza", "sushi", "ramen"};

 //Inciso f
    @FXML
    public ComboBox<String> ComboBox1;
    public String [] animals = {"Pez" , "Gato" , "Perrp"};

 //Inciso g
    @FXML
    protected RadioButton RButton1,RButton2;
    @FXML
    private Label Label3;
    public void getTip(ActionEvent event )
    {
        if (RButton1.isSelected())
        {
            Label3.setText(RButton1.getText());
        }
        else if (RButton2.isSelected())
        {
            Label3.setText(RButton2.getText());
        }
    }

 //Inciso i
    @FXML
    protected ProgressBar ProgressBar1;
    @FXML
    private Label Label5;
    @FXML
    protected Button Button5;
    double progress;
    public void increaseProgress ()
    {
        if (progress<1)
        {
            progress += 0.1;
            System.out.println(progress);
            ProgressBar1.setProgress(progress);
            Label5.setText(Integer.toString((int)Math.round(progress * 100)) + "%");
        }
    }

 //Inciso j
    @FXML
    protected Slider Slider1;
    @FXML
    private Label Label6;
    int mTemp;

 //Inciso k
    @FXML
    protected TableView<?> TableView1;

 //Inciso L
    @FXML
    protected TreeView TreeView1;
    public void selectItem ()
    {

    }

 //Inciso M
    @FXML
    protected MenuBar MenuBar1;

 //Inciso N
    @FXML
    public TextField Entradaf;
    @FXML
    public Tooltip pest;

 //Inciso O
    @FXML
    void showDialog (ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Este es un ejemplo de Alert");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isEmpty())
        {
            System.out.println("Cerrar");
        }

    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1 )
    {
        ChoiceBox1.getItems().addAll(food);
        ComboBox1.getItems().addAll(animals);

        Slider1.valueProperty().addListener(new ChangeListener<Number>()
        {
            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2)
            {
                mTemp = (int) Slider1.getValue();
                Label6.setText(Integer.toString(mTemp) + "C");
            }

        });

        TreeItem<String> rootItem= new TreeItem<>("Animes");
        TreeItem<String> branchItem1 = new TreeItem<>("Shonen");
        TreeItem<String> branchItem2 = new TreeItem<>("Seinen");
        TreeItem<String> branchItem3 = new TreeItem<>("Shojo");

        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);
        TreeView1.setRoot(rootItem);
    }


}
