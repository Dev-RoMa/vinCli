/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carroceria;
import java.util.Scanner;
/**
 *
 * @author rodri
 */
public class patente {
    Scanner scan = new Scanner(System.in);
    int licensePlateNumbers;
    String licensePlateChar;

    public int getLicensePlateNumbers() {
        return licensePlateNumbers;
    }

    public void setLicensePlateNumbers(int licensePlateNumbers) {
        this.licensePlateNumbers = licensePlateNumbers;
    }

    public String getLicensePlateChar() {
        return licensePlateChar;
    }

    public void setLicensePlateChar(String licensePlateChar) {
        this.licensePlateChar = licensePlateChar;
    }
    
    
    
    public void licensePlateInput(){
        System.out.println("Input License plate first 4 words");
        licensePlateChar = scan.nextLine();
        //String licensePlate;
        while (licensePlateChar.length() != 4){
            System.out.println("Input words into the first 4 digits");
            if (licensePlateChar.length() <= 4 || licensePlateChar.length() >= 4){
                for (int i = 0; i < 10; i++){
                String str = Integer.toString(i);
                if (licensePlateChar.equals(str)){
                    System.out.println("Only Words A-Z please");
                }}
                System.out.println("please only 4 digits long ");}
            try{
            licensePlateChar = scan.nextLine();
            }catch (Exception numbers){
                System.out.println("Please Input only Words");}
        }
        System.out.println("Please input license plate Last 2 numbers = ");
        try{
        licensePlateNumbers = scan.nextInt();
        }catch(Exception words){
        System.out.println("Only numbers!");
        }
        //numbers of the license plate
        String str = Integer.toString(licensePlateNumbers);
        int size = str.length();
        System.out.println("The length of the last 2 numbers is = "+size);
        while (size !=2){
            System.out.println("Please Input 2 number digits");
            String cont = scan.nextLine();
            try{
            licensePlateNumbers = scan.nextInt();
            }catch(Exception words){
            System.out.println("Only numbers!");
            }
            str = Integer.toString(licensePlateNumbers);
            size = str.length();
        }
        System.out.println("The license plate of the vehicle is = "+licensePlateChar+str);
    }
}
