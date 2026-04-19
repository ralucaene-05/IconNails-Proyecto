
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
  
    private static final String URL = "jdbc:mysql://localhost:3306/IconNails";
    private static final String USER = "root";
    private static final String PASS = ""; 

    
    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        if (conectar() != null) {
            System.out.println("¡CONECTADO EXITOSAMENTE!");
        } else {
            System.out.println("ERROR: No se pudo conectar.");
        }
    }
}
