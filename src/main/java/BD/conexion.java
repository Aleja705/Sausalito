
package BD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private Connection conectar = null;
    
    
    String usuario = "root";
    String contraseña = "root";
    String bd = "sausalito";
    String ip = "127.0.0.1"; 
    String puerto = "3306"; 
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    
    public Connection conectar() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de MySQL: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return conectar;
    }

    
    public void cerrarConexion() {
        try {
            if (conectar != null && !conectar.isClosed()) {
                conectar.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

}

