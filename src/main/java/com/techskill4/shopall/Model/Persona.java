package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido_paterno;
    private String apellido_materno;
    @NotNull
    @Size(min = 1, max = 50)
    private String calle;
    @NotNull
    @Min(value = 1)
    private int num_ext;
    private Integer num_int;
    @Pattern(regexp = "^[0-9]{5}$")
    private int cp;
    @NotNull
    @Size(min = 1, max = 50)
    private String ciudad;
    @NotNull
    @Size(min = 1, max = 50)
    private String telefono;
    @NotNull
    @Size(min = 1, max = 50)
    private String colonia;
}