package edu.ilp.jvilchez.Dao;

import edu.ilp.jvilchez.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
}
