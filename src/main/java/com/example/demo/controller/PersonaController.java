package com.example.demo.controller;

import com.example.demo.dto.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> listarClientes() {
        return personaService.findAll();
    }

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona) {
        return personaService.save(persona);
    }
//
//    @GetMapping("/{id}")
//    public Producto obtenerProducto(@PathVariable Long id) {
//        return productoRepository.findById(id).orElse(null);
//    }
//
//    @PutMapping("/{id}")
//    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto productoActualizado) {
//        Producto productoExistente = productoRepository.findById(id).orElse(null);
//
//        if (productoExistente == null) {
//            return null; // Manejo de errores
//        }
//
//        productoExistente.setNombre(productoActualizado.getNombre());
//        productoExistente.setPrecio(productoActualizado.getPrecio());
//
//        return productoRepository.save(productoExistente);
//    }
//
//    @DeleteMapping("/{id}")
//    public void eliminarProducto(@PathVariable Long id) {
//        productoRepository.deleteById(id);
//    }
}
