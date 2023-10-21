package com.example.demo.service.impl;

import com.example.demo.dto.Persona;
import com.example.demo.entity.PersonaEntity;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.service.PersonaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;
    @Override
    public List<Persona> findAll() {
        List<PersonaEntity> p = personaRepository.findAll();
        List<Persona> p2 = new ArrayList<>();
        for(PersonaEntity per : p){
            Persona persona = new Persona();
            BeanUtils.copyProperties (per,persona);
            p2.add(persona);
        }
        return p2;
    }

    @Override
    public Persona save(Persona persona) {

        PersonaEntity personaEntity = new PersonaEntity();
        BeanUtils.copyProperties(persona,personaEntity);

        try{
            personaEntity =  personaRepository.save(personaEntity);
            persona.setId(personaEntity.getId());
            return persona;
        }catch(Exception e){
            e.getMessage();
            return null;
        }



    }
}
