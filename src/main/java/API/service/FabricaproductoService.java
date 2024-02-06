package API.service;

import API.model.productos;
import API.dto.productosDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaproductoService {
    public productos crearProducto (productosDTO productosDTO){
        return new productos(productosDTO);
    }

    public productosDTO crearProductoDTO(productos productos){
        return new productosDTO(productos);
    }

    public List<productosDTO> crearproductoDTO(List<productos> listaProductos){
        List<productosDTO> productosDTOS = new ArrayList<>();
        listaProductos.forEach((productos -> productosDTOS.add(crearProductoDTO(productos))));
        return productosDTOS;
    }



}


