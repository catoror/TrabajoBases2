/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Punto;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Punto implements Comparable<Punto> 
{
    ArrayList<Punto> al;
    public float x;
    public float y;


    public Punto(float x, float y) 
    {
        this.x = x;
        this.y = y;
    }
    
    public float getX(){
        return  this.x;
    }
    
    public float getY(){
        return  this.y;
    }
    
    @Override
    public int compareTo(Punto o) 
    {
        float dist1 = distancia(new Punto(this.x, this.y));
        float dist2 = distancia(o);
        return Float.compare(dist1, dist2);
    }

    public float distancia(Punto a) 
    {
        return ((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
    }
}