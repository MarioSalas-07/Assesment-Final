package com.techskill4.shopall.JpaRepository;

import com.techskill4.shopall.Model.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, Integer> {
}
