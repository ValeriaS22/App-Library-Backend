package com.example.AppLibraryBackend.repositorio;

import com.example.AppLibraryBackend.modelos.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepositorio extends JpaRepository<Prestamo, Long> {
}
