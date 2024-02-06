package API.service;

import API.dto.*;
import API.model.*;
import API.repository.ProductosRepository;
import API.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import java.util.List;
import java.util.stream.Collectors;

@Service
public class productoService {

    @Autowired
    private FabricaproductoService fabricaProductoService;

    @Autowired
    private ProductosRepository productoRepository;

    public productosDTO save(productosDTO productoDTO) {
        productos productos = fabricaProductoService.crearProducto(productoDTO);
        productos = productoRepository.save(productos);
        return fabricaProductoService.crearProductoDTO(productos);
    }

    public List<productosDTO> findAll() {
        List<productos> productos = productoRepository.findAll();
        return productos.stream()
                .map(fabricaProductoService::crearProductoDTO)
                .collect(Collectors.toList());
    }

    public productosDTO findById(int id) {
        return productoRepository.findById(id)
                .map(fabricaProductoService::crearProductoDTO)
                .orElse(null);
    }

    public void deleteById(int id) {
        productoRepository.deleteById(id);
    }


}
