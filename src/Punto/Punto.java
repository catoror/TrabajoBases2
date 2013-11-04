/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Punto;

/**
 *
 * @author Carlos
 */
public class Punto implements Comparable<Punto> 
{
    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int compareTo(Punto o) {
        if (this.x == o.x) {
            return Float.compare(this.y, o.y);
        }
        return Float.compare(this.x, o.x);
    }

    public float distancia(Punto a) 
    {
        return ((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
    }
}