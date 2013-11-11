/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cluster;

/**
 *
 * @author Carlos
 */

/*Este ejemplo fue tomado de internet y fue modificado para acceder y
 pintar figuras desde la BD*/

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.math.*;
import java.util.HashSet;
 
public class SquaredPaper extends JFrame 
{
 public  void paint(JPanel pnl) 
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
         xmas = xmas + 10;
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
           resultado = sentencia.executeQuery("select t2.x, t2.y from conjuntopuntos t, TABLE(t.mis_puntos) t2 WHERE id_conj = 8");
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
               if(xmin > x1)
               {
                   xmin = x1;
               }
               if(ymin > y1)
               {
                   ymin = y1;
               }
               if(xmax < x1)
               {
                   xmax = x1;
               }
               if(ymax < y1)
               {
                   ymax = y1;
               }
               g.fillOval(x1,y1,10,10);
             //super.paintComponents(g);
     /*        g.drawOval(resultado.getInt("a"),
             resultado.getInt("b"),
             resultado.getInt("c"),
             resultado.getInt("d"));*/
           }
           conn.close();
           g.drawRect(xmin, ymin, (xmax - xmin)+10, (ymax-ymin)+10);
         }
         catch(SQLException e)
         {
           System.out.println("Error: " + e.getMessage());
         }
 }
 
// public static void main(String args[]) 
// {
//   SquaredPaper DrawWindow = new SquaredPaper();
// 
//   DrawWindow.setSize(1360,720);
//   DrawWindow.setResizable(false);
//   DrawWindow.setLocation(5, 5);
//   DrawWindow.setTitle("Pintando figuras almacenadas en la BD");    
//   DrawWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   
//   DrawWindow.setVisible(true);
// }
}