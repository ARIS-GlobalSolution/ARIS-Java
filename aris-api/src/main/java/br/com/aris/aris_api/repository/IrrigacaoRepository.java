package br.com.aris.aris_api.repository;

import br.com.aris.aris_api.entity.Irrigacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrrigacaoRepository extends JpaRepository<Irrigacao, Long> {
}
