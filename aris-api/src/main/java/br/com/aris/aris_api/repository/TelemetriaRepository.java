package br.com.aris.aris_api.repository;

import br.com.aris.aris_api.entity.Telemetria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelemetriaRepository extends JpaRepository<Telemetria, Long> {
}
