package org.ccnal.facturacion.calculadores;

import lombok.Getter;
import lombok.Setter;
import org.openxava.calculators.ICalculator;
import org.openxava.jpa.XPersistence;

import javax.management.Query;

public class CalculadorAnyo implements ICalculator {

    @Getter @Setter
    private int anyo;

    @Override
    public Object calculate() throws Exception {
        Query query = (Query) XPersistence.getManager()
                .createQuery("select max (f.numero) from Factura f where f.anyo = :anyo");
        query.setParameter("anyo",anyo);
        Integer ultimoNumero = (Integer) query.getSingleResult();
        int i = ultimoNumero + 1;
        return ultimoNumero == null ? :  ultimoNumero + 1;
    }
}
