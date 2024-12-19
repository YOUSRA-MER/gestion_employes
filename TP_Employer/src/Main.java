
import Model.*;
import View.*;
import DAO.*;
import Controller.*;
import Model.EmployerModel;
import View.employerView;
public class Main {
    public static void main(String[] args) {
        EmployerDAOimpl DAO = new EmployerDAOimpl();
        EmployerModel Model = new EmployerModel(DAO);
        employerView View = new employerView();
        EmployerController Controller = new EmployerController( Model,View);
    }
}