package br.com.aris.aris_api.repository;

import br.com.aris.aris_api.entity.TipoSensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoSensorRepository extends JpaRepository<TipoSensor, Long> {
}
