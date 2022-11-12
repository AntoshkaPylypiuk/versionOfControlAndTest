module ua.lv.pylypiuk.anton.homework2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ua.lv.pylypiuk.anton.homework2 to javafx.fxml;
    exports ua.lv.pylypiuk.anton.homework2;
}