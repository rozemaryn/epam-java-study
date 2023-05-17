module com.kostyanetskaya.epamjavastudy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kostyanetskaya.epamjavastudy to javafx.fxml;
    exports com.kostyanetskaya.epamjavastudy;
}