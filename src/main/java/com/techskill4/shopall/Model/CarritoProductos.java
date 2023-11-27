package com.techskill4.shopall.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "carrito_productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarritoProductos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private int cantidad;
    private byte estatus;
    @ManyToOne
    @JoinColumn(name = "id_carrito")
    private Carrito carrito;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public CarritoProductos(long l, String producto1, double v) {
    }
}
