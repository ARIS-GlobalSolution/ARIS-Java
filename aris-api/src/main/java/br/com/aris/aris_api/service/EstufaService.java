package br.com.aris.aris_api.service;

import br.com.aris.aris_api.entity.Estufa;
import br.com.aris.aris_api.repository.EstufaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstufaService {

    private final EstufaRepository repository;

    public List<Estufa> listarTodos() {
        return repository.findAll();
    }

    public Estufa buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estufa não encontrada"));
    }

    public Estufa salvar(Estufa estufa) {
        return repository.save(estufa);
    }

    public Estufa atualizar(Long id, Estufa estufa) {
        Estufa existente = buscarPorId(id);

        existente.setNome(estufa.getNome());
        existente.setLocalizacao(estufa.getLocalizacao());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
