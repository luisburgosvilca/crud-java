package com.example.demo.service;

import com.example.demo.dto.Persona;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonaService {

    List<Persona> findAll();

    Persona save(Persona persona);
}
