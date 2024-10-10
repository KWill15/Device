/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.device;

/**
 *
 * @author KJ
 */
public class Tablet extends Device implements WithDataPlan
{
    private int dataMB;
    
    Tablet (int mb, String m, double p)
    {
        super(m,p);
        dataMB=mb;
    }
    
    @Override
    public void addData(int a)
    {
        dataMB+=a;
    }
         
    @Override
    public double getBill()
    {
        return dataMB*.5;
    }
}
