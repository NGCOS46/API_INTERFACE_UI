package API.service;

import API.model.*;
import API.dto.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Fabricaproveedor {
    public proveedor crearProveedor(proveedorDTO proveedorDTO) {
        return new proveedor(proveedorDTO);
    }

    public proveedorDTO crearProveedorDTO(proveedor proveedor) {
        return new proveedorDTO(proveedor);
    }

    public List<proveedorDTO> crearProveedorDTO(List<proveedor> listaProveedores) {
        List<proveedorDTO> proveedorDTOS = new ArrayList<>();
        listaProveedores.forEach(proveedor -> proveedorDTOS.add(crearProveedorDTO(proveedor)));
        return proveedorDTOS;
    }
}
