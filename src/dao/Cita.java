package controller; // 

import database.ConexionBD;
import datos.Cita;
import java.sql.*;

public class CitaDAO {

    public void insertarCita(Cita cita) {
        String sql = "INSERT INTO citas (nombre_cliente, servicio, precio) VALUES ";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, cita.getNombreCliente());
            pst.setString(2, cita.getServicio());
            pst.setDouble(3, cita.getPrecio());

            pst.executeUpdate();
            System.out.println("Cita guardada en MySQL!");

        } catch (SQLException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    // 3. MÉTODO PARA BORRAR 
    public void eliminarCita(int id) {
        String sql = "DELETE FROM citas WHERE id = ?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, id);
            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Cita con ID " + id + " eliminada correctamente.");
            } else {
                System.out.println("No se encontró ninguna cita con ese ID.");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar cita: " + e.getMessage());
        }
    }

    // 4. MÉTODO PARA ACTUALIZAR 
    public void actualizarCita(int id, String nuevoServicio, double nuevoPrecio) {
        String sql = "UPDATE citas SET servicio = ?, precio = ? WHERE id = ?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, nuevoServicio);
            pst.setDouble(2, nuevoPrecio);
            pst.setInt(3, id);

            int filas = pst.executeUpdate();
            if (filas > 0) {
                System.out.println(" Cita actualizada con éxito.");
            } else {
                System.out.println(" No se encontró la cita con ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println(" Error al actualizar: " + e.getMessage());
        }
    }
}

