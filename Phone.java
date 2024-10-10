/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.device;

/**
 *
 * @author KJ
 */
public class Phone extends Device implements WithVoicePlan
{
    private double voiceMIN;
    
    Phone(int v, String m, double p)
    {
        super(m, p);
        voiceMIN=v;
    }
    
    @Override
    public void addVoice(int v)
    {
        voiceMIN+=v;
    }
    
    @Override
    public double getBill()
    {
        return voiceMIN*.1;
    }
}
