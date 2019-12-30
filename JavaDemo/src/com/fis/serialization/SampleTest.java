package com.fis.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SampleTest {
	public static void main(String[] args)  
            throws Exception  
    { 
		Sample2 sample = new Sample2(10,20); 
          
        System.out.println("i = " + sample.i); 
        System.out.println("j = " + sample.j); 
          
        // Serializing B's(subclass) object  
          
        //Saving of object in a file 
        FileOutputStream fos = new FileOutputStream("abc.ser"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
              
        // Method for serialization of B's class object 
        oos.writeObject(sample); 
              
        // closing streams 
        oos.close(); 
        fos.close(); 
              
        System.out.println("Object has been serialized"); 
          
        // De-Serializing B's(subclass) object  
          
        // Reading the object from a file 
        FileInputStream fis = new FileInputStream("abc.ser"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
              
        // Method for de-serialization of B's class object 
        Sample2 sample2 = (Sample2)ois.readObject(); 
              
        // closing streams 
        ois.close(); 
        fis.close(); 
              
        System.out.println("Object has been deserialized"); 
          
        System.out.println("i = " + sample2.i); 
        System.out.println("j = " + sample2.j); 
    } 
}
