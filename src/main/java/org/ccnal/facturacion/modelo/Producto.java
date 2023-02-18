package org.ccnal.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter @Setter
public class Producto {

    @Id
    @Column(length = 9)
    private int numero;

    @Column(length = 50)
    @Required
    private String descripcion;

    @ManyToOne
            (fetch = FetchType.LAZY, optional=true)
    @DescriptionsList
    Categoria categoria;
    @Money
    private BigDecimal precio;

    @File
    @Column(length = 32)
    private String fotos;

    @TextArea
    private String observaciones;


}
