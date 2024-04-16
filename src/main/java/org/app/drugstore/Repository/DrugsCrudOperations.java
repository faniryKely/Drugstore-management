package org.app.drugstore.Repository;

import org.app.drugstore.Model.Drugs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugsCrudOperations extends JpaRepository<Drugs , Integer> {
}
