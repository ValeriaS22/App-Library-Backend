package com.example.AppLibraryBackend.servicios;

import com.example.AppLibraryBackend.modelos.Libro;
import com.example.AppLibraryBackend.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    // Instanciar el repositorio de libro
    @Autowired // permite inyectar objetos
    private LibroRepositorio libroRepositorio;

    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    public Libro saveLibro(Libro libro){
        return libroRepositorio.save(libro);
    }

    // Listar los libros
    public List<Libro> getAllLibros(){
        return libroRepositorio.findAll();
    }

}
