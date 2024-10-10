/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.device;

/**
 *
 * @author KJ
 */
public abstract class Device 
{
private String model;
private double price;

Device (String m, double p)
{
    model=m;
    price=p;
}
    
public String getModel()
{
    return model;
}

public double getPrice()
{
    return price;
}

public void setPrice(double p)
{
    price=p;
}

public void setModel(String m)
{
    model=m;
}

public abstract double getBill();
}
