package tds.practica_final.adapters.repository;

import tds.practica_final.modelo.Gasto;
import java.util.List;

public interface GastoRepository {
    void añadirGasto(Gasto gasto);
    void borrarGasto(int id);
    void actualizarGasto(Gasto gasto);
    Gasto obtenerGasto(int id);
    List<Gasto> obtenerTodosLosGastos();
}