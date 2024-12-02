package rrcc.com.ms_categoria_server.service;

import org.springframework.stereotype.Service;
import rrcc.com.ms_categoria_server.entity.Categoria;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoriaService {
    List<Categoria> lista();
    Categoria guardar(Categoria categoria);
    Optional<Categoria> buscarPorId(Integer id);
    Categoria actualizar(Categoria categoria);
    void eliminar(Integer id);
}