package API.model;

import jakarta.persistence.*;
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
    @JoinColumn(name= "idproveedor")
    private proveedor idproveedor;

    public productos(int idproductos,String nombre, double importe, long stock, int idproveedor ){
        this.idproductos= idproductos;
        this.nombre= nombre;
        this.importe= importe;
        this.stock=stock;
        this.idproveedor=getIdproveedor();
    }





}
