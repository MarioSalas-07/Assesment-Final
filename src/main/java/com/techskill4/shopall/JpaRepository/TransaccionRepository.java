package com.techskill4.shopall.JpaRepository;

import com.techskill4.shopall.Model.Transaccion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Integer> {
    List<Transaccion> findByCarritoUsuarioId(Long usuarioId);
}
