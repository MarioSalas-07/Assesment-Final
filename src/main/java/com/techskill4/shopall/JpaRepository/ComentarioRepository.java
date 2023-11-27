package com.techskill4.shopall.JpaRepository;

import com.techskill4.shopall.Model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
    List<Comentario> findByProductoId(Long productoId);
}
