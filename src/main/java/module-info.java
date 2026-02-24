module com.laughingalpaca.fsc_full_stack_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.laughingalpaca.fsc_full_stack_project to javafx.fxml;
    exports com.laughingalpaca.fsc_full_stack_project;
}