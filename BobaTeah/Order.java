/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bobatea;

/**
 *
 * @author anggarasaputra
 */
public class Order {

    public static BobaTea Small = new Size();
    public static BobaTea Medium = new Size();
    public static BobaTea Large = new Size();
    switch(this) {
        case Small:
            return "small";
        
        case Medium:
            return "Medium";
            
        case Large:
            return "Large";
         
        default:
            return null;
    }
}
