package sample;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Main extends Application {

    private DoubleProperty fontSize = new SimpleDoubleProperty(10);

    @Override
    public void start(Stage stage) throws Exception{
        GridPane root = new GridPane();
        createColumn(root);
        createRows(root);
        createComponent(root);
        Scene scene = new Scene(root, 400, 600);
        stage.setScene(scene);
        //root.setGridLinesVisible(true);
        stage.setResizable(false);
        stage.setTitle("Calculator");
        stage.show();
        fontSize.bind(scene.widthProperty().add(scene.heightProperty()).divide(30));
        root.styleProperty().bind(Bindings.concat("-fx-font-size: ", fontSize.asString()));

        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    }

    public static void createColumn(GridPane root){
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(25);
        root.getColumnConstraints().add(column1);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(25);
        root.getColumnConstraints().add(column2);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(25);
        root.getColumnConstraints().add(column3);
        ColumnConstraints column4 = new ColumnConstraints();
        column4.setPercentWidth(25);
        root.getColumnConstraints().add(column4);
    }
    public static void createRows(GridPane root){
        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(16.7);
        root.getRowConstraints().add(row1);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(16.7);
        root.getRowConstraints().add(row2);
        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(16.7);
        root.getRowConstraints().add(row3);
        RowConstraints row4 = new RowConstraints();
        row4.setPercentHeight(16.7);
        root.getRowConstraints().add(row4);
        RowConstraints row5 = new RowConstraints();
        row5.setPercentHeight(16.7);
        root.getRowConstraints().add(row5);
        RowConstraints row6 = new RowConstraints();
        row6.setPercentHeight(16.7);
        root.getRowConstraints().add(row6);
    }
    public static void createComponent(GridPane root){
        Button nol = new Button("0");
        root.add(nol,1, 5);
        nol.setMaxWidth(Double.MAX_VALUE);
        nol.setMaxHeight(Double.MAX_VALUE);

        Button one = new Button("1");
        root.add(one, 0, 4);
        one.setMaxWidth(Double.MAX_VALUE);
        one.setMaxHeight(Double.MAX_VALUE);

        Button two = new Button("2");
        root.add(two, 1, 4);
        two.setMaxWidth(Double.MAX_VALUE);
        two.setMaxHeight(Double.MAX_VALUE);

        Button three = new Button("3");
        root.add(three, 2, 4);
        three.setMaxWidth(Double.MAX_VALUE);
        three.setMaxHeight(Double.MAX_VALUE);

        Button four = new Button("4");
        root.add(four, 0, 3);
        four.setMaxWidth(Double.MAX_VALUE);
        four.setMaxHeight(Double.MAX_VALUE);

        Button five = new Button("5");
        root.add(five, 1, 3);
        five.setMaxWidth(Double.MAX_VALUE);
        five.setMaxHeight(Double.MAX_VALUE);

        Button six = new Button("6");
        root.add(six, 2, 3);
        six.setMaxWidth(Double.MAX_VALUE);
        six.setMaxHeight(Double.MAX_VALUE);

        Button seven = new Button("7");
        root.add(seven, 0, 2);
        seven.setMaxWidth(Double.MAX_VALUE);
        seven.setMaxHeight(Double.MAX_VALUE);

        Button eight = new Button("8");
        root.add(eight, 1, 2);
        eight.setMaxWidth(Double.MAX_VALUE);
        eight.setMaxHeight(Double.MAX_VALUE);

        Button nine = new Button("9");
        root.add(nine, 2, 2);
        nine.setMaxWidth(Double.MAX_VALUE);
        nine.setMaxHeight(Double.MAX_VALUE);

        Button point = new Button(",");
        root.add(point, 2, 5);
        point.setMaxWidth(Double.MAX_VALUE);
        point.setMaxHeight(Double.MAX_VALUE);

        Button pm = new Button("+/-");
        root.add(pm, 0, 5);
        pm.setMaxWidth(Double.MAX_VALUE);
        pm.setMaxHeight(Double.MAX_VALUE);

        Button equal = new Button("=");
        root.add(equal, 3, 5);
        equal.setMaxWidth(Double.MAX_VALUE);
        equal.setMaxHeight(Double.MAX_VALUE);

        Button plus = new Button("+");
        root.add(plus, 3, 4);
        plus.setMaxWidth(Double.MAX_VALUE);
        plus.setMaxHeight(Double.MAX_VALUE);

        Button minus = new Button("−");
        root.add(minus, 3, 3);
        minus.setMaxWidth(Double.MAX_VALUE);
        minus.setMaxHeight(Double.MAX_VALUE);

        Button multiply = new Button("×");
        root.add(multiply, 3, 2);
        multiply.setMaxWidth(Double.MAX_VALUE);
        multiply.setMaxHeight(Double.MAX_VALUE);

        Button division = new Button("÷");
        root.add(division, 3, 1);
        division.setMaxWidth(Double.MAX_VALUE);
        division.setMaxHeight(Double.MAX_VALUE);

        Button percent = new Button("%");
        root.add(percent, 2, 1);
        percent.setMaxWidth(Double.MAX_VALUE);
        percent.setMaxHeight(Double.MAX_VALUE);

        Button square = new Button("x²");
        root.add(square, 1, 1);
        square.setMaxWidth(Double.MAX_VALUE);
        square.setMaxHeight(Double.MAX_VALUE);

        Button clear = new Button("AC");
        root.add(clear, 0, 1);
        clear.setMaxWidth(Double.MAX_VALUE);
        clear.setMaxHeight(Double.MAX_VALUE);

        Label result = new Label("1231397458459884");
        GridPane.setHalignment(result, HPos.RIGHT);
        GridPane.setValignment(result, VPos.CENTER);
        root.add(result, 0, 0, 4, 1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
