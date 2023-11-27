package com.techskill4.shopall.JpaRepository;

import com.techskill4.shopall.Model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolReposotory extends JpaRepository<Rol, Integer> {
}
