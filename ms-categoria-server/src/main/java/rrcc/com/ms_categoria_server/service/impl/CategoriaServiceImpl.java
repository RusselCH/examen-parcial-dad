package rrcc.com.ms_categoria_server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rrcc.com.ms_categoria_server.entity.Categoria;
import rrcc.com.ms_categoria_server.repository.CategoriaRepository;
import rrcc.com.ms_categoria_server.service.CategoriaService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> lista() {
        return categoriaRepository.findAll();
    }
    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
    @Override
    public Optional<Categoria> buscarPorId(Integer id){
        return categoriaRepository.findById(id);
    }
    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
    @Override
    public void eliminar(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
