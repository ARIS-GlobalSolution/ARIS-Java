package br.com.aris.aris_api.repository;

import br.com.aris.aris_api.entity.Sensores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensores, Long> {
}
