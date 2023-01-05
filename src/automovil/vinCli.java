
package automovil;
import java.util.Scanner;
import chasis.vin;
import carroceria.patente;
import engine.engineCode;

public class vinCli {

    public static void main(String[] args) {
        //Initializing
        Scanner scan = new Scanner(System.in);
        vin vin = new vin();        
        patente patente = new patente();
        engineCode eC = new engineCode();
        
        //menu variables
        boolean True = false;
        boolean False = false;
        int op;
        
        while (True==False){
            System.out.println("Select an option");
            System.out.println("1.-VIN\n2.-License Plate\n3.-Engine Code\n4.-Exit");
            op = scan.nextInt();
            switch(op) {
                case 1:
                    vin.vinInput();
                    break;
                case 2:
                    patente.licensePlateInput();
                    break;
                case 3:
                    eC.engineCodeInput();
                    break;
                case 4:
                    True = true;
                    break;
                }
            
        }
    }
}