package br.com.aris.aris_api.service;

import br.com.aris.aris_api.dto.UsuarioRequestDTO;
import br.com.aris.aris_api.dto.UsuarioResponseDTO;
import br.com.aris.aris_api.entity.Usuario;
import br.com.aris.aris_api.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public UsuarioResponseDTO salvar(UsuarioRequestDTO dto) {

        Usuario usuario = new Usuario();

        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setSenha(dto.senha());
        usuario.setDataCadastro(LocalDate.now());

        Usuario salvo = repository.save(usuario);

        return new UsuarioResponseDTO(
                salvo.getIdUsuario(),
                salvo.getNome(),
                salvo.getEmail(),
                salvo.getDataCadastro()
        );
    }

    public Usuario atualizar(Long id, Usuario usuario) {

        Usuario usuarioExistente = buscarPorId(id);

        usuarioExistente.setNome(usuario.getNome());
        usuarioExistente.setEmail(usuario.getEmail());
        usuarioExistente.setSenha(usuario.getSenha());

        return repository.save(usuarioExistente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}