package com.example.AppLibraryBackend.repositorio;

import com.example.AppLibraryBackend.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository <Libro, Long>{
}
