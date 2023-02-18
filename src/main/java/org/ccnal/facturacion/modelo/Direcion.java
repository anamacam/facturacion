package org.ccnal.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable @Getter @Setter
public class Direcion {
    @Column(length = 30)
    private String viaPublica;
    @Column(length = 5)
    private int codigoPostal;
    @Column(length = 20)
    private String municipio;
    @Column(length = 30)
    private String provincia;
}
