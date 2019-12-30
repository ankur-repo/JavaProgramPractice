package com.fis.serialization;

import java.io.Serializable;

public class Sample2 extends Sample1 implements Serializable{
	int j; 
    
    // parameterized constructor 
    public Sample2(int i, int j)  
    { 
        super(i); 
        this.j = j; 
    } 
}
