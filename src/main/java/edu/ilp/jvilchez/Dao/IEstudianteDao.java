package edu.ilp.jvilchez.Dao;

import edu.ilp.jvilchez.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
    @Async
    @Query("from Estudiante est where est.codigo= :codigoEstudiante")
    Estudiante buscarPorCodigoEstudiante(@Param("codigoEstudiante") String codigoEstudiante);
}
