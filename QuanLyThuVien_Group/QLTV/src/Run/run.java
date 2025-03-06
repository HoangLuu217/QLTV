/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Run;


import DAO.*;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class run {

    public run() {
          DatabaseConnection cn = new DatabaseConnection();
          
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseConnection cnn = new DatabaseConnection();
      if(cnn != null){
          System.out.println("ok");
      }else{
          System.out.println("Not Ok");
      }
        
        BookDAO bD = new BookDAO();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book: ");
        String bookID = sc.nextLine();
                }
    
}
