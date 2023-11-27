package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private byte status;
    @NotNull
    @Size(min = 1, max = 50)
    private String usuario;
    @NotNull
    @Size(min = 1, max = 50)
    private String contrasenia;
    @NotNull
    @Size(min = 1, max = 50)
    @Email
    private String correo_electronico;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
}