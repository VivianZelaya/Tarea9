/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea9;

/**
 *
 * @author DELL
 */
public final class Datos extends Info {
    
    private double codigo;
    private double precio;
    private double cantidad;
    
    public Datos(){
        
    }
    
    public Datos(double _codigo, double _precio, double _cantidad){
        this.setCodigo(_codigo);
    }
    
    public void setCodigo(double _codigo){
        this.codigo = _codigo;
    }
    
    public double getCodigo(){
        return this.codigo;
    }
    
    public void setPrecio(double _precio){
        this.precio = _precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setCantidad(double _cantidad){
        this.cantidad = _cantidad;
    }
    
    public double getCantidad(){
        return this.cantidad;
    }
}
