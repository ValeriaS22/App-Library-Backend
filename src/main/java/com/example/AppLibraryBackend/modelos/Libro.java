package com.example.AppLibraryBackend.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/*@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter*/
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private long id;
    @Column(nullable = false, length = 30)
    private String nombre;

    // Relacion o asociacion de que un libro puede tener varios prestamos
    @OneToMany(mappedBy = "libro") // Dominante
    @JsonManagedReference
    private List<Prestamo> prestamos;

    // Constructores
    public Libro(){}

    public Libro(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Get y set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
