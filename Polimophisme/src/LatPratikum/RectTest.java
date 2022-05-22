/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatPratikum;

/**
 *
 * @author Member
 */
public class RectTest extends Rect{
    public static void main (String[]args){
        Rect nilai1 = new Rect(1,1,4,4);
        Rect nilai2 = new Rect(2,3,5,6);
        Rect u = nilai2.union(nilai1);
        Rect i = nilai2.intersection(nilai1);
        
        if(u.isInside(nilai1.x1, nilai2.y1))
            System.out.println("< " + nilai2.x1 + "," + nilai2.y1 + " > "+ " is inside the union");
            System.out.println(nilai1 + " union " + nilai2 + " = " + u);
            System.out.println(nilai1 + " intersect " + nilai2 + " = " + i);
    }
}
