package com.example.AppLibraryBackend.modelos;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idbook", nullable = false, length = 20, unique = true)
    private long id;
    private String nombre;
}
