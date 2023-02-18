package org.ccnal.facturacion.modelo;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;
import org.openxava.annotations.Stereotype;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentYearCalculator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

public class Factura {
    @Id
    @GeneratedValue(generator = "system-uui")
    @Hidden
    @GenericGenerator(name = "system-uui", strategy = "uui")
    @Column(length = 32)
    private String oid;

    @DefaultValueCalculator(CurrentYearCalculator.class)
    @Column(length = 4)
    private int anyo;
    @Column(length = 6)
    private String numero;
    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    private LocalDate fecha;

    @Stereotype("MENU")

    private String observaciones;


}
