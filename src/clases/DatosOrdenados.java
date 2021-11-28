/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;

/**
 *
 * @author Noemí Lara Acono
 */
public class DatosOrdenados {
    private int [] valores; 

    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }
    
    public int getSize(){
        return valores.length; 
    }
    
    @Override
    public String toString(){
        String cad = "Datos ordenados: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
    
}
