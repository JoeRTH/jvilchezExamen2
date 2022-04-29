package edu.ilp.jvilchez.Service.Impl;

import edu.ilp.jvilchez.Dao.IEstudianteDao;
import edu.ilp.jvilchez.Entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstudianteServiceImpl {
    @Autowired
    private IEstudianteDao estudianteDao;

    public List<Estudiante> buscarPersona() {return this.estudianteDao.findAll();}
}
