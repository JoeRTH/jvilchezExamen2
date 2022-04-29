package edu.ilp.jvilchez.Dao;

import edu.ilp.jvilchez.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
