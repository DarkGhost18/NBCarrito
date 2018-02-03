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
public class Molde {

    public String color, modelo, transmision, marca;
    public int puertas;

    public Molde() {
        marca = "Mazda";
        color = "Rojo metalico";
        modelo = "2019";
        transmision = "Automatica";
        puertas = 4;
    }
        //sobrecarga overload
    public Molde(String marca,String color,String modelo,String transmision, int puertas) {
        this.marca=marca;
        this.color=color;
        this.modelo=modelo;
        this.transmision=transmision;
        this.puertas=puertas;               
    }
    public Molde(String marca,String color,String modelo) {
    	this.marca=marca;
    	this.color=color;
    	this.modelo=modelo;
    }
    
    public void setColor(String valor){
    	color=valor;
    }
    public void setMarca(String valor) {
        marca = valor;
    }
    
    public void setModelo(String valor) {
        modelo = valor;
    }
    public void setTransmision(String valor) {
        transmision = valor;
    }
    
    public void setPuertas(int valor) {
        puertas = valor;
    }
    
    public String getColor(){
    	return color;   	
    }
    public String getMarca(){
    	return marca;   
    }
    public String getModelo(){
    	return modelo;   
    }
    public String getTransmision(){
    	return transmision;
    }
    public int getPuertas(){
    	return puertas;   
    }	
}

