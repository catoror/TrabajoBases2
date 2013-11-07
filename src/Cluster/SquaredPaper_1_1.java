/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredpaper;

/**
 *
 * @author Carlos
 */

/*Este ejemplo fue tomado de internet y fue modificado para acceder y
 pintar figuras desde la BD*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.sql.*;

public class SquaredPaper_1_1 extends JPanel {

    private Dimension area;
    private JPanel panelppal;

    public SquaredPaper_1_1() {
        super(new BorderLayout());
        area = new Dimension(0, 0);
        JPanel panelseg = new JPanel(new GridLayout(0, 1));
        //panelseg.setFocusable(true);

        panelppal = new PanelPrincipal_1();
        panelppal.setBackground(Color.white);
        //panelppal.addMouseListener(this);

        JScrollPane jscrollgrafica = new JScrollPane(panelppal);
        jscrollgrafica.setPreferredSize(new Dimension(200, 200));

        add(jscrollgrafica, BorderLayout.CENTER);
        
    }
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ScrollDemo2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new SquaredPaper_1_1();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

class PanelPrincipal_1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void paint(Graphics g) {
        Dimension d = getSize();
        int x = d.width;
        int y = d.height;
        int xmin, ymin;

        g.setColor(Color.WHITE);
        g.fillRect(0,0,x,y);

        g.setColor(Color.red);

        g.drawLine(10,0,10,y);
        g.drawLine(0,y-20,x,y-20);

        String cad;
        int xmas = 10;
        int ymas = y-20;

       for(int i = 1; i<30; i++)
       {
         cad = ""+ i;
         xmas = xmas + 10;
         ymas = ymas - 10;
         g.drawString(cad, xmas, (y-5));
         g.drawString(cad, 10, ymas);
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
           
           while (resultado.next())
           {
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
                System.out.println("xmin: " + cxmin);
                System.out.println("xmax: " + cxmax);
                System.out.println("xmax - xmin + 10: " + (cxmax - cxmin + 10));
                System.out.println("ymin: " + cymin);
                System.out.println("ymax: " + cymax);
                System.out.println("ymax - ymin + 10: " + (cymax - cymin+10));
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
           System.out.println("Error: " + e.getMessage());
         }
    }
}
