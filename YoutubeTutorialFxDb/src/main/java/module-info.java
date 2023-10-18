module ua.lv.pylypiuk.anton.youtubetutorialfxdb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ua.lv.pylypiuk.anton.youtubetutorialfxdb to javafx.fxml;
    exports ua.lv.pylypiuk.anton.youtubetutorialfxdb;
}