/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chasis;
import java.util.Scanner;

public class vin {
    Scanner scan = new Scanner(System.in);
    String vin;

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    
    
    
    public void vinInput(){
        System.out.println("Input a vin number");
        vin = scan.nextLine();
        
        while (vin.length() != 17){
            System.out.println("Input a vin number");
            System.out.println("hi");
            vin = scan.nextLine();
        }
      System.out.println("the vin is = "+vin);
    }
}