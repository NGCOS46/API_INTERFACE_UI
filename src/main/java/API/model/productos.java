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
    @Column(name="idproducto")
    private Integer idproducto;

    @Column(name="nombre")
    private String nombre;

    @Column(name="importe")
    private double importe;

    @Column(name="stock")
    private Long stock;

    @OneToMany
    @JoinColumn(name= "idproveedor")
    private Integer idproveedor;

    public productos(int idproducto,String nombre, double importe, long stock, int idproveedor ){
        this.idproducto= idproducto;
        this.nombre= nombre;
        this.importe= importe;
        this.stock=stock;
        this.idproveedor=idproveedor;
    }





}
