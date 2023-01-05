package engine;
import java.util.Scanner;

public class engineCode {
    Scanner scan = new Scanner(System.in);
    
    String engineCode;
    
    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }
    
    public void engineCodeInput(){
        engineCode = "";
        while (engineCode.length()!=6){
            System.out.println("Insert 6 digit engine code");
            engineCode = scan.nextLine();
        }
        System.out.println("engine code = "+engineCode);
    }
}