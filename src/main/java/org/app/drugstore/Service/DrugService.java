package org.app.drugstore.Service;

import lombok.Data;
import org.app.drugstore.Model.Drugs;
import org.app.drugstore.Repository.DrugsCrudOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DrugService {
    private DrugsCrudOperations drugsCrudOperations;
    private Drugs drugs;

    public List<Drugs> findAll() {
        return drugsCrudOperations.findAll();
    }
    public Optional<Drugs> findById(int id) {
        return drugsCrudOperations.findById(id);
    }
    public Drugs save(Drugs toSave) {
        return drugsCrudOperations.save(toSave);
    }

    public String deleteById(int id) {
        drugsCrudOperations.deleteById(id);
        return "Drugs deleted !";
    }
}
