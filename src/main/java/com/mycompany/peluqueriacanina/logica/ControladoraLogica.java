
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardarDuenio(Duenio due){
        controlPersis.guardarDuenio(due);
    }
    public void guardarMascota(Mascota masco){
        controlPersis.guardarMascota(masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int numCliente) {
        controlPersis.borrarMascota(numCliente);
    }

    public void editarMascota(Mascota masco) {
        controlPersis.editarMascota(masco);
    }

    public Mascota traerMascota(int numCliente) {
        return controlPersis.traerMascota(numCliente);
    }

    public void editarDuenio(Duenio duenio) {
        controlPersis.editarDuenio(duenio);
    }

    public Duenio traerDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }
}
