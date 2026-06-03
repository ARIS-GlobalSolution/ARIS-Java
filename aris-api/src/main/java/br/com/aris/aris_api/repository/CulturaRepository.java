package br.com.aris.aris_api.repository;

import br.com.aris.aris_api.entity.Culturas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CulturaRepository extends JpaRepository<Culturas, Long> {
}
