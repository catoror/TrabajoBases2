package Conexion;

/**
 *
 */
import java.sql.*;
import Punto.*;

public class Conexion 
{
    static int iden;
    Connection conn;
    Statement sentencia;
    ResultSet resultado;
    Punto coordenada[];
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
            
            int c=0;
            
            resultado = sentencia.executeQuery("select count(*) as c from conjuntopuntos where id_conj = " + id);
            
            resultado.next();
            
            c = resultado.getInt("c");
            
            if(c==0)
            {
                resultado = sentencia.executeQuery("insert into conjuntopuntos values("+ id + ",nest_puntos())");
                resultado = sentencia.executeQuery("commit");
            }
            
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

    public void selectCoordenada(int id)
    {
        conectar();
        float x;
        float y;
        int i = -1;
        ResultSet tamano;
        try {
            System.out.println("Ola k ase!!!!!...");
            
            tamano = sentencia.executeQuery("select count(t2.x) as c  from conjuntopuntos t, TABLE(t.mis_puntos) t2 WHERE id_conj = " + id);
            tamano.next();
            coordenada = new Punto[tamano.getInt("c")];
            System.out.println(coordenada.length);
            
            resultado = sentencia.executeQuery("select t2.x, t2.y from conjuntopuntos t, TABLE(t.mis_puntos) t2 WHERE id_conj = " + id);
            
            System.out.println("X\tY");
            while (resultado.next()) 
            {
                x = resultado.getFloat("x");
                y = resultado.getFloat("y");
                coordenada[++i] = new Punto(x, y);
                System.out.println(coordenada[i].x + "\t" + coordenada[i].y);
            }
            
            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Consulta finalizada.");        
    }
    
    public void insertarIdDibujo(int id_dibujo, int id_conj, String cond_generacion, String cond_parada, float umbral)
    {
        conectar();
        try {
            System.out.println("Ola k ase???? DIBUJO...");
            
            int c=0;
            
            resultado = sentencia.executeQuery("select count(*) as c from dibujo where id_dibujo = " + id_dibujo);
            
            resultado.next();
            
            c = resultado.getInt("c");
            
            if(c==0)
            {
                resultado = sentencia.executeQuery("insert into dibujo values("+ id_dibujo + "," + id_conj + ", '" + cond_generacion + "', '" + cond_parada + " = " + umbral + "')");
                resultado = sentencia.executeQuery("commit");
            }
            
            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Consulta finalizada.");        
    }

    public void insertarCluster(int id_dibujo, float xmin, float ymin, float xmax, float ymax)
    {
        conectar();
        try 
        {
            System.out.println("Ola k ase???? CLUSTERS...");
            
            int c=0;
            
            resultado = sentencia.executeQuery("select count(*) as c from clusters");
            
            resultado.next();
            
            c = resultado.getInt("c");
            
            iden = iden + c;
            
            resultado = sentencia.executeQuery("insert into clusters values("+ iden +","+ "(select ref(d) from dibujo d where id_dibujo= "+ id_dibujo + "), "+xmin+","+ymin+","+xmax+","+ymax+", nest_puntos())");
            
            resultado = sentencia.executeQuery("commit");
            
            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        }
        catch (SQLException e) 
        {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Consulta finalizada.");        
    }

    public void insertarPuntosCluster(float x, float y)
    {
        conectar();
        try {
            System.out.println("Ola k ase???? PUNTOS!!!!!...");
            
            resultado = sentencia.executeQuery("insert into table(select puntos_cluster from clusters where id_cluster = "+ iden + ") values("+ x +","+y+")");
            
            resultado = sentencia.executeQuery("commit");
            //Se recorren las tuplas retornadas

            conn.close(); //Cierre de la conexión
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Consulta finalizada.");        
    }
    
    public Punto[] getPoint()
    {
        return coordenada;
    }
    
    static public void main(String[] args) 
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
        System.out.println("Consulta finalizada.");*/
        Conexion con = new Conexion();
        
        int id_dibujo = 1;
        int id_conj = 8;
        String gen = "Distancia";
        String par = "Numero_Cluster";
        float umbral = 1.21f;
        float[] xmin = {2,4,9};
        float[] ymin = {2,8,3};
        float[] xmax = {5,7,12};
        float[] ymax = {4,10,6};
        Punto[][] PuntosCluster = {{new Punto(2f,2f), new Punto(3f,4f), new Punto(5f,2f)},{new Punto(4f,8f), new Punto(4f,10f), new Punto(6f,8f), new Punto(7f,10f)},{new Punto(11f,4f), new Punto(12f,3f), new Punto(10f,5f), new Punto(9f,3f), new Punto(12f,6f)}};
        con.insertarIdDibujo(id_dibujo, id_conj, gen, par, umbral);
        for(int id_cluster = 0; id_cluster<3; id_cluster++)
        {
            iden = 1;
            con.insertarCluster(id_dibujo, xmin[id_cluster], ymin[id_cluster], xmax[id_cluster], ymax[id_cluster]);
            for(int j = 0; j < PuntosCluster[id_cluster].length; j++)
            {
                con.insertarPuntosCluster(PuntosCluster[id_cluster][j].x, PuntosCluster[id_cluster][j].y);
            }            
        }
    } //Fin del main
}
