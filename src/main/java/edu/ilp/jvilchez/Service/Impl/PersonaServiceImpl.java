package edu.ilp.jvilchez.Service.Impl;

import edu.ilp.jvilchez.Dao.IPersonaDao;
import edu.ilp.jvilchez.Entity.Persona;
import edu.ilp.jvilchez.Service.Intef.IPersonaServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonaServiceImpl implements IPersonaServiceIntef {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {return this.personaDao.findAll();}

    }