module gym.app.team13gymapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens gym.app.team13gymapp to javafx.fxml;
    exports gym.app.team13gymapp;
}