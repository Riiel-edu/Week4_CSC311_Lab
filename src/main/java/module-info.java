module edu.farmingdale.week_4_csc311_lab_work {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.week_4_csc311_lab_work to javafx.fxml;
    exports edu.farmingdale.week_4_csc311_lab_work;
}