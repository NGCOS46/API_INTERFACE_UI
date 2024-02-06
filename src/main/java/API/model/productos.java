package API.model;

import API.dto.productosDTO;
import jakarta.persistence.*;
import API.model.productos;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="productos")
public class productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproductos")
    private Integer idproductos;

    @Column(name="nombre")
    private String nombre;

    @Column(name="importe")
    private double importe;

    @Column(name="stock")
    private Long stock;

    @ManyToOne
    private proveedor proveedor;

    public productos(int idproductos,String nombre, double importe, long stock, int idproveedor ){
        this.idproductos= idproductos;
        this.nombre= nombre;
        this.importe= importe;
        this.stock=stock;
        this.proveedor=getProveedor();
    }


    public productos(productosDTO productosDTO) {
        this.idproductos = productosDTO.getIdproductos();
        this.nombre = productosDTO.getNombre();
        this.importe = productosDTO.getImporte();
        this.stock = productosDTO.getStock();
        // Aquí puedes manejar la conversión del proveedorDTO a proveedor si es necesario
        this.proveedor = new proveedor(productosDTO.getProveedor());
    }

}
