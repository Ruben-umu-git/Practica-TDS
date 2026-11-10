package tds.practica_final.modelo;

import java.time.LocalDate;

public class Gasto {
    private int id; // Identificador único para la base de datos (JDBC)
    private String concepto;
    private double cantidad;
    private LocalDate fecha;
    private String categoria;
    private String persona; // Opcional: útil para cuentas compartidas

    // Constructor completo
    public Gasto(int id, String concepto, double cantidad, LocalDate fecha, String categoria, String persona) {
        this.id = id;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.categoria = categoria;
        this.persona = persona;
    }

    // Constructor sin ID (para cuando creamos un gasto nuevo antes de guardarlo en BD)
    public Gasto(String concepto, double cantidad, LocalDate fecha, String categoria, String persona) {
        this.id = -1;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.categoria = categoria;
        this.persona = persona;
    }

    // --- Getters y Setters ---
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "id=" + id +
                ", concepto='" + concepto + '\'' +
                ", cantidad=" + cantidad +
                ", fecha=" + fecha +
                ", categoria='" + categoria + '\'' +
                ", persona='" + persona + '\'' +
                '}';
    }
}
