module com.codedotorg {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.codedotorg to javafx.fxml;
    exports com.codedotorg;
}
