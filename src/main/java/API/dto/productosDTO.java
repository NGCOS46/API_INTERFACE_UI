package API.dto;
import API.model.productos;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class productosDTO {
    private int idproductos;
    private String nombre;
    private double importe;
    private long stock;
    private proveedorDTO proveedor;



    public productosDTO (productos productos){
        this.idproductos= productos.getIdproductos();
        this.nombre =productos.getNombre();
        this.importe= productos.getImporte();
        this.stock= productos.getStock();;
        this.proveedor= new proveedorDTO(productos.getProveedor());
    }
}
