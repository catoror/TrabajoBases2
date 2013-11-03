package Conexion;

/**
 *
 */
import java.sql.*;

public class Conexion {

    Connection conn;
    Statement sentencia;
    ResultSet resultado;
    
    public void conectar()
    {
        System.out.println("Conexión a la base de datos...");
        try { // Se carga el driver JDBC-ODBC
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver JDBC");
            return;
        }
        try { // Se establece la conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:oracle:thin:@carlos-PC:1521:xe","tbases2", "123");
            sentencia = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("No hay conexión con la base de datos.");
            return;
        }        
    }
    
    public void insertarID(int id)
    {
        conectar();
        try {
            System.out.println("Ola k ase????...");
            resultado = sentencia.executeQuery("insert into conjuntopuntos values("+ id + ",nest_puntos())");
                        
            resultado = sentencia.executeQuery("commit");
            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Consulta finalizada.");        
    }
    
    public void insertarCoordenada(int id, float x, float y)
    {
        conectar();
        try {
            System.out.println("Ola k ase????!!!!!...");
            
            resultado = sentencia.executeQuery("insert into table(select mis_puntos from conjuntopuntos where id_conj = "+ id + ") values("+ x +","+y+")");
            
            resultado = sentencia.executeQuery("commit");
            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Consulta finalizada.");        
    }
    
/*    static public void main(String[] args) 
    {
        /*Connection conn;
        Statement sentencia;
        ResultSet resultado;

        System.out.println("Conexión a la base de datos...");
        try { // Se carga el driver JDBC-ODBC
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver JDBC");
            return;
        }
        try { // Se establece la conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:oracle:thin:@carlos-PC:1521:xe","tbases2", "123");
            sentencia = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("No hay conexión con la base de datos.");
            return;
        }
        try {
            System.out.println("Ola k ase????!!!!!...");
            
            resultado = sentencia.executeQuery("SELECT * FROM conjuntopuntos");
            //Se recorren las tuplas retornadas
            while (resultado.next()) {
                System.out.println(resultado.getInt("id_conj"));
            }
            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Consulta finalizada.");
        Conexion con = new Conexion();
        con.insertarID(7);
        con.insertarCoordenada(7,1,2);
    } //Fin del main*/
}
