package proj06;

import java.util.Scanner;

public class Proj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Data d1 = new Data();
        
        System.out.println("Informe o dia: ");
        d1.setDia(read.nextByte());
        
        System.out.println("Informe o mes: ");
        d1.setMes(read.nextByte());
        
        System.out.println("Informe o ano: ");
        d1.setAno(read.nextInt());
        
        System.out.println(d1.toString());
        
    }
    
}
