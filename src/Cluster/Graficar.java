package Cluster;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Random;

 public class Graficar extends JFrame 
 {
public  void paint(JPanel pnl, int id, float[] xmin, float[] xmax,float[] ymin,float[] ymax) 
{

    Graphics g=pnl.getGraphics();
    g.fillRect(0, 0, pnl.getWidth(), pnl.getHeight());
    Dimension d = pnl.getSize();
    int x = d.width;
    int y = d.height;
    //float xmin, ymin;
 
    g.setColor(Color.WHITE);
    g.fillRect(0,0,x,y);
 
    g.setColor(Color.BLACK);
 
    g.drawLine(15,0,15,y);
    g.drawLine(0,y-25,x,y-25);
 
    int xmas = 5;
    int ymas = y-15;
 
   for(int i = 1; i<999; i++)
   {
     xmas = xmas+10;
     ymas = ymas - 10;
     g.drawLine(xmas, y-22, xmas, y-28);
     g.drawLine(12, ymas, 18, ymas);
   }
 
    g.setColor(Color.blue);  
 
     Connection conn;
     Statement sentencia;
     ResultSet resultado;
 
     try
     { // Se carga el driver JDBC-ODBC
      Class.forName ("oracle.jdbc.driver.OracleDriver");
     }
     catch( Exception e ) 
     {
       System.out.println("No se pudo cargar el driver JDBC");
       return;           
     }
 
     try
     { // Se establece la conexión con la base de datos Oracle Express
       conn = DriverManager.getConnection("jdbc:oracle:thin:@carlos-PC:1521:xe","tbases2","123");
       sentencia = conn.createStatement();
     }
     catch( SQLException e ) 
     {
       System.out.println("No hay conexión con la base de datos.");
       return;
     }
 
     try 
     {
       //Se recorren las tuplas retornadas
       resultado = sentencia.executeQuery("select t2.x, t2.y from conjuntopuntos t, TABLE(t.mis_puntos) t2 WHERE id_conj = " + id);
       float x1;
       float y1;
//       float xmax, ymax;
       resultado.next();     
       x1 = resultado.getFloat("x")*10+10;
//       xmin = x1;
//       xmax = x1;
       y1 = y - (resultado.getFloat("y")*10+30);
//       ymin = y1;
//       ymax = y1;
       g.fillOval((int)x1,(int)y1,10,10);
       while (resultado.next())
       { 
           x1 = resultado.getInt("x")*10+10;
           y1 = y - (resultado.getInt("y")*10+30);
           g.fillOval((int)x1,(int)y1,10,10);
       }
       conn.close();
       
       Random random = new Random();
       float red;
       float green;
       float blue;
       Color col;
       
       for(int i = 0; i<xmin.length; i++)
       {
            red = random.nextFloat();
            green = random.nextFloat();
            blue = random.nextFloat();
            col = new Color(red,green,blue);
            g.setColor(col);
           g.drawRect((int)xmin[i]*10+10, y-(int)(ymax[i])*10-30, (int)(xmax[i] - xmin[i])*10+10, (int)(ymax[i]-ymin[i])*10+10);
       }
//       g.drawRect(xmin, ymin, (xmax - xmin)+10, (ymax-ymin)+10);
     }
     catch(SQLException e)
     {
       System.out.println("Error: "+e.getMessage());
     }
}

public  void paint2(JPanel pnl, int id)
{

Graphics g=pnl.getGraphics();
g.fillRect(0, 0, pnl.getWidth(), pnl.getHeight());
Dimension d = pnl.getSize();
    int x = d.width;
    int y = d.height;
    float xmin, ymin;
 
    g.setColor(Color.WHITE);
    g.fillRect(0,0,x,y);
 
    g.setColor(Color.BLACK);
 
    g.drawLine(15,0,15,y);
    g.drawLine(0,y-25,x,y-25);
 
    int xmas = 5;
    int ymas = y-15;
 
   for(int i = 1; i<999; i++)
   {
     xmas = xmas+10;
     ymas = ymas - 10;
     g.drawLine(xmas, y-22, xmas, y-28);
     g.drawLine(12, ymas, 18, ymas);
   }
 
    g.setColor(Color.blue);    
 
     Connection conn;
     Statement sentencia;
     ResultSet resultado;
 
     try
     { // Se carga el driver JDBC-ODBC
      Class.forName ("oracle.jdbc.driver.OracleDriver");
     }
     catch( Exception e ) 
     {
       System.out.println("No se pudo cargar el driver JDBC");
       return;           
     }
 
     try
     { // Se establece la conexión con la base de datos Oracle Express
       conn = DriverManager.getConnection("jdbc:oracle:thin:@carlos-PC:1521:xe","tbases2","123");
       sentencia = conn.createStatement();
     }
     catch( SQLException e ) 
     {
       System.out.println("No hay conexión con la base de datos.");
       return;
     }
 
     try 
     {
       //Se recorren las tuplas retornadas
       resultado = sentencia.executeQuery("select deref(id_dibujo).id_dibujo as id_dibujo, id_cluster, c2.x, c2.y, xmin, xmax, ymin, ymax, deref(id_dibujo).id_conj as id_conj, deref(id_dibujo).cond_generacion as cond_generacion, deref(id_dibujo).cond_parada as cond_parada from clusters c, TABLE(c.puntos_cluster) c2 where deref(id_dibujo).id_dibujo=" + id);
       int id_dibujo, id_cluster, id_conj;
       float cx, cy, cxmin, cxmax, cymin, cymax;
       String cond_generacion, cond_parada;
                  
       Random random = new Random();
       float red;
       float green;
       float blue;
       Color col;
       
       while (resultado.next())
       {
            g.setColor(Color.BLUE);
            id_dibujo = resultado.getInt("id_dibujo");
            cond_generacion = resultado.getString("cond_generacion");
            cond_parada = resultado.getString("cond_parada");
            cxmin = resultado.getFloat("xmin");
            cxmax = resultado.getFloat("xmax");
            cymin = (resultado.getFloat("ymin"));
            cymax = (resultado.getFloat("ymax"));
            id_cluster = resultado.getInt("id_cluster");
            cx = resultado.getFloat("x")*10+10;
            cy = y - (resultado.getFloat("y")*10+30);
            g.fillOval((int)cx,(int)cy,10,10);
            red = random.nextFloat();
            green = random.nextFloat();
            blue = random.nextFloat();
            col = new Color(red,green,blue);
            g.setColor(col);
            g.drawRect((int)cxmin*10+10, y-(int)(cymax)*10-30, (int)(cxmax-cxmin)*10+10, (int)(cymax-cymin)*10+10);
       }
       conn.close();      
     }
     catch(SQLException e)
     {
       System.out.println("Error: "+e.getMessage());
     }
}
}

 // public static void main(String args[]) 
 // {
 //   Graficar DrawWindow = new Graficar();
 // 
 //   DrawWindow.setSize(1360,720);
 //   DrawWindow.setResizable(false);
 //   DrawWindow.setLocation(5, 5);
 //   DrawWindow.setTitle("Pintando figuras almacenadas en la BD");    
 //   DrawWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //   
 //   DrawWindow.setVisible(true);
 // }
