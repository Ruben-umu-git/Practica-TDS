package tds.practica_final;

import junit.framework.TestCase;
import tds.practica_final.modelo.Gasto;
import tds.practica_final.modelo.Categoria;
import java.time.LocalDate;

public class GastoTest extends TestCase {

    public void testCrearGastoConId() {
        LocalDate fecha = LocalDate.of(2026, 6, 15);
        Gasto gasto = new Gasto(1, "Supermercado", 45.50, fecha, "Alimentación", "Raquel");

        assertEquals(1, gasto.getId());
        assertEquals("Supermercado", gasto.getConcepto());
        assertEquals(45.50, gasto.getCantidad());
        assertEquals(fecha, gasto.getFecha());
        assertEquals("Alimentación", gasto.getCategoria());
        assertEquals("Raquel", gasto.getPersona());
    }

    public void testCrearGastoSinId() {
        LocalDate fecha = LocalDate.now();
        Gasto gasto = new Gasto("Gasolina", 30.0, fecha, "Transporte", "Luis");

        assertEquals(-1, gasto.getId());
        assertEquals("Gasolina", gasto.getConcepto());
        assertEquals(30.0, gasto.getCantidad());
        assertEquals("Transporte", gasto.getCategoria());
    }

    public void testModificarGastoSetters() {
        Gasto gasto = new Gasto("Cine", 10.0, LocalDate.now(), "Ocio", "María");
        
        gasto.setCantidad(12.50);
        gasto.setConcepto("Cine y palomitas");
 
        assertEquals(12.50, gasto.getCantidad());
        assertEquals("Cine y palomitas", gasto.getConcepto());
    }

    public void testCrearCategoria() {
        Categoria cat = new Categoria(1, "Transporte");
        assertEquals(1, cat.getId());
        assertEquals("Transporte", cat.getNombre());
        assertEquals("Transporte", cat.toString());
    }
}