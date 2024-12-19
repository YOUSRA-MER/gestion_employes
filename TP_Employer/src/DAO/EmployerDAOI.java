package DAO;
import Model.*;

import java.util.ArrayList;

public interface EmployerDAOI {
    public void ajouterEmployer (Employer NvEmployer );
    public void modifierEmployer(Employer NvEmployer );
    public void supprimerEmployer(int Id);
    public ArrayList<Employer> getAllEmployer();
}
