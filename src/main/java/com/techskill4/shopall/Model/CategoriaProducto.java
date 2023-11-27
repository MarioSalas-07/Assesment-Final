package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoriasproductos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 50)
    private String nombre;
    private String descripcion;

}