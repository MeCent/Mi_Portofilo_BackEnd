package com.portfolio.mec.Repository;

import com.portfolio.mec.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHys extends JpaRepository<Hys, Integer>{
    public Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
