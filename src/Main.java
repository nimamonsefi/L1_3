/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Shape shape=new Shape();
        
        System.out.print("Enter The Length : ");
        shape.setLength(scanner.nextDouble());
        
        System.out.print("Enter The Width : ");
        shape.setWidth(scanner.nextDouble());
        
        System.out.println("Area : "+shape.area());
        System.out.println("Perimeter : "+shape.perimeter());
        
    }
    
}
