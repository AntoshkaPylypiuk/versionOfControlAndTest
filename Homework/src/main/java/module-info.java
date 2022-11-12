module ua.lv.pylypiuk.anton.homework {
    requires javafx.controls;
    requires javafx.fxml;


    opens ua.lv.pylypiuk.anton.homework to javafx.fxml;
    exports ua.lv.pylypiuk.anton.homework;
}