package Cluster;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Random;

 public class Graficar extends JFrame 
 {
public  void paint(JPanel pnl, int id) 
{

    Graphics g=pnl.getGraphics();
    g.fillRect(0, 0, pnl.getWidth(), pnl.getHeight());
    Dimension d = pnl.getSize();
    int x = d.width;
    int y = d.height;
    int xmin, ymin;
 
    g.setColor(Color.WHITE);
    g.fillRect(0,0,x,y);
 
    g.setColor(Color.red);
 
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
       int x1;
       int y1;
       int xmax, ymax;
       resultado.next();     
       x1 = resultado.getInt("x")*10+10;
       xmin = x1;
       xmax = x1;
       y1 = y - (resultado.getInt("y")*10+30);
       ymin = y1;
       ymax = y1;
       g.fillOval(x1,y1,10,10);
       while (resultado.next())
       {
 
           x1 = resultado.getInt("x")*10+10;
           y1 = y - (resultado.getInt("y")*10+30);
//           if(xmin > x1)
//           {
//               xmin = x1;
//           }
//           if(ymin > y1)
//           {
//               ymin = y1;
//           }
//           if(xmax < x1)
//           {
//               xmax = x1;
//           }
//           if(ymax < y1)
//           {
//               ymax = y1;
//           }
           g.fillOval(x1,y1,10,10);
         //super.paintComponents(g);
 /*        g.drawOval(resultado.getInt("a"),
         resultado.getInt("b"),
         resultado.getInt("c"),
         resultado.getInt("d"));*/
       }
       conn.close();
//       g.drawRect(xmin, ymin, (xmax - xmin)+10, (ymax-ymin)+10);
     }
     catch(SQLException e)
     {
       System.out.println("Error: "+e.getMessage());
     }
}



public  void paint2(JPanel pnl) 
{

Graphics g=pnl.getGraphics();
g.fillRect(0, 0, pnl.getWidth(), pnl.getHeight());
Dimension d = pnl.getSize();
    int x = d.width;
    int y = d.height;
    int xmin, ymin;
 
    g.setColor(Color.WHITE);
    g.fillRect(0,0,x,y);
 
    g.setColor(Color.red);
 
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
       resultado = sentencia.executeQuery("select deref(id_dibujo).id_dibujo as id_dibujo, id_cluster, c2.x, c2.y, xmin, xmax, ymin, ymax, deref(id_dibujo).id_conj as id_conj, deref(id_dibujo).cond_generacion as cond_generacion, deref(id_dibujo).cond_parada as cond_parada from clusters c, TABLE(c.puntos_cluster) c2 where deref(id_dibujo).id_dibujo=1");
       int id_dibujo, id_cluster, cx, cy, cxmin, cxmax, cymin, cymax, id_conj;
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
            cxmin = resultado.getInt("xmin")*10+10;
            cxmax = resultado.getInt("xmax")*10+10;
            cymax = y - (resultado.getInt("ymin")*10+30);
            cymin = y - (resultado.getInt("ymax")*10+30);
            id_cluster = resultado.getInt("id_cluster");
            cx = resultado.getInt("x")*10+10;
            cy = y - (resultado.getInt("y")*10+30);
            g.fillOval(cx,cy,10,10);
            System.out.println("xmin: "+cxmin);
            System.out.println("xmax: "+cxmax);
            System.out.println("xmax - xmin10: "+(cxmax - cxmin+10));
            System.out.println("ymin: "+cymin);
            System.out.println("ymax: "+cymax);
            System.out.println("ymax - ymin10: "+(cymax - cymin+10));
            red = random.nextFloat();
            green = random.nextFloat();
            blue = random.nextFloat();
            col = new Color(red,green,blue);
            g.setColor(col);
            g.drawRect(cxmin, cymin, (cxmax - cxmin+10), (cymax-cymin+10));
         //super.paintComponents(g);
 /*        g.drawOval(resultado.getInt("a"),
         resultado.getInt("b"),
         resultado.getInt("c"),
         resultado.getInt("d"));*/
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
