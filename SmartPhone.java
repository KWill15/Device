/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.device;

/**
 *
 * @author KJ
 */
public class SmartPhone extends Device implements WithDataPlan, 
                                                  WithVoicePlan
{
    private int dataMB;
    private int voiceMIN;
    
    SmartPhone(int mb, int v, String m, double p)
    {
        super(m, p);
        dataMB=mb;
        voiceMIN=v;
    }
    
    @Override
    public void addData(int a)
    {
        dataMB+=a;
    }
    
    @Override
    public void addVoice(int v)
    {
        voiceMIN+=v;
    }
    
    @Override
    public double getBill()
    {
        return (voiceMIN*.1)+(dataMB*.5);
    }
}
