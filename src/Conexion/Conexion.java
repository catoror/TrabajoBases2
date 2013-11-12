package Conexion;

import java.sql.*;
import Punto.*;

public class Conexion {

    static int iden;
    Connection conn;
    Statement sentencia;
    ResultSet resultado;
    Punto coordenada[];
    int IdDibujo[];

    public Punto[] getCoordenada() {
        return coordenada;
    }

    public int[] getIdDibujo() {
        return IdDibujo;
    }

    public void conectar() {
        try { // Se carga el driver JDBC-ODBC
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver JDBC");
            return;
        }
        try { // Se establece la conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:oracle:thin:@carlos-PC:1521:xe", "tbases2", "123");
            sentencia = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("No hay conexión con la base de datos.");
            return;
        }
    }

    public void insertarID(int id) {
        conectar();
        try {

            int c = 0;

            resultado = sentencia.executeQuery("select count(*) as c from conjuntopuntos where id_conj = " + id);

            resultado.next();

            c = resultado.getInt("c");

            if (c == 0) {
                resultado = sentencia.executeQuery("insert into conjuntopuntos values(" + id + ",nest_puntos())");
                resultado = sentencia.executeQuery("commit");
            }

            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void insertarCoordenada(int id, float x, float y) {
        conectar();
        try {
            resultado = sentencia.executeQuery("insert into table(select mis_puntos from conjuntopuntos where id_conj = " + id + ") values(" + x + "," + y + ")");
            resultado = sentencia.executeQuery("commit");
            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String devolverID_con() {
        conectar();
        String id="";
        try {
            resultado = sentencia.executeQuery("select id_conj as i from dibujo");
            resultado.next();
            
            id = ""+ resultado.getInt("i");
            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return id;

    }
    public String devolverID_gene() {
        conectar();
        String id="";
        try {
            resultado = sentencia.executeQuery("select cond_generacion as i from dibujo");
            resultado.next();
            
            id = resultado.getString("i");
            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return id;

    }
    public String devolverID_para() {
        conectar();
        String id="";
        try {
            resultado = sentencia.executeQuery("select cond_parada as i from dibujo");
            resultado.next();
            
            id = resultado.getString("i");
            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return id;

    }

    public void selectIdDibuo() {
        conectar();
        int i = -1;
        ResultSet tamano;
        try {
            tamano = sentencia.executeQuery("select count(*) as c from dibujo");
            tamano.next();
            IdDibujo = new int[tamano.getInt("c")];

            resultado = sentencia.executeQuery("select id_dibujo from dibujo");

            while (resultado.next()) {
                IdDibujo[++i] = resultado.getInt(1);
            }

            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void selectCoordenada(int id) {
        conectar();
        float x;
        float y;
        int i = -1;
        ResultSet tamano;
        try {
            tamano = sentencia.executeQuery("select count(t2.x) as c  from conjuntopuntos t, TABLE(t.mis_puntos) t2 WHERE id_conj = " + id);
            tamano.next();
            coordenada = new Punto[tamano.getInt("c")];

            resultado = sentencia.executeQuery("select t2.x, t2.y from conjuntopuntos t, TABLE(t.mis_puntos) t2 WHERE id_conj = " + id);

            while (resultado.next()) {
                x = resultado.getFloat("x");
                y = resultado.getFloat("y");
                coordenada[++i] = new Punto(x, y);
            }

            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void insertarIdDibujo(int id_conj, String cond_generacion, String cond_parada, float umbral) {
        conectar();
        try {
            int c = 0;

            resultado = sentencia.executeQuery("select count(*) as c from dibujo");

            resultado.next();

            c = resultado.getInt("c") + 1;

            resultado = sentencia.executeQuery("insert into dibujo values(" + c + "," + id_conj + ", '" + cond_generacion + "', '" + cond_parada + " = " + umbral + "')");
            resultado = sentencia.executeQuery("commit");

            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void insertarCluster(float xmin, float ymin, float xmax, float ymax) {
        iden = 1;
        int id_dibujo = 0;
        conectar();
        try {

            int c = 0;

            resultado = sentencia.executeQuery("select count(*) as d from dibujo");

            resultado.next();

            id_dibujo = resultado.getInt("d");

            resultado = sentencia.executeQuery("select count(*) as c from clusters");

            resultado.next();

            c = resultado.getInt("c");

            iden = iden + c;

            resultado = sentencia.executeQuery("insert into clusters values(" + iden + "," + "(select ref(d) from dibujo d where id_dibujo= " + id_dibujo + "), " + xmin + "," + ymin + "," + xmax + "," + ymax + ", nest_puntos())");

            resultado = sentencia.executeQuery("commit");

            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void insertarPuntosCluster(float x, float y) {
        conectar();
        try {
            resultado = sentencia.executeQuery("insert into table(select puntos_cluster from clusters where id_cluster = " + iden + ") values(" + x + "," + y + ")");

            resultado = sentencia.executeQuery("commit");
            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Punto[] getPoint() {
        return coordenada;
    }
}
