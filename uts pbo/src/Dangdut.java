/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS 10
 */
public class Dangdut {
    
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    public void Dangdut(){
        
    }
    
    public void singer(String penyanyi){
        this.penyanyi =  penyanyi;
    }
    public void song(String lagu,String kopi_Dangdut){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
    
}
