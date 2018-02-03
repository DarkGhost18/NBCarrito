/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/**
 *
 * @author Dark Ghost
 */
public class Carrito {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Molde carrito1 = new Molde();
        //carrito1.color = "Aqua blue";
        
        carrito1.setColor("Rojo Metalico");
        carrito1.setModelo("2019");
        carrito1.setMarca("Mazda");
        carrito1.setTransmision("Automatico");
        carrito1.setPuertas(4);
       
        //System.out.println("El color es: "+ carrito1.color);
        //System.out.println("La marca es: "+ carrito1.marca);
        //System.out.println("La transmision: "+ carrito1.transmision);
        //System.out.println("Num. Puertas: "+ carrito1.puertas);
        
        System.out.println("El color es: "+ carrito1.color);
        System.out.println("La marca es: " + carrito1.marca);
        System.out.println("La transmision es: " + carrito1.transmision);
        System.out.println("El modelo es: " + carrito1.modelo);
        System.out.println("Num. Puertas: "	+ carrito1.puertas);
        
        System.out.println("°|°|°|°|°|°|°|°|°|°|°|°|°|");
        
        Molde carrito2 = new Molde("Kia","Naranja con negro","2021","Automatico",4);
        	 System.out.println(carrito2.getMarca());
             System.out.println(carrito2.getColor());
             System.out.println(carrito2.getTransmision());
             System.out.println(carrito2.getModelo());
             System.out.println(carrito2.getPuertas());
        
        
        System.out.println("°|°|°|°|°|°|°|°|°|°|°|°|°|");
        
        Molde carrito3= new Molde("Ferrari","Azul Metalico","2019");
        carrito3.setTransmision("Automatica");
        carrito3.setPuertas(5);
        
        System.out.println(carrito3.getMarca());
        System.out.println(carrito3.getColor());
        System.out.println(carrito3.getTransmision());
        System.out.println(carrito3.getModelo());
        System.out.println(carrito3.getPuertas());
        
        
        		
        
        
    }
    
}
