/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesstranslate2;

/**
 *
 * @author Ale
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class GuessTranslate2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        
        Scanner s = new Scanner(System.in);
        String csvFile = "D:/prova.csv";
        String line = "";
        String cvsSplitBy = ",";
        String parola;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                
               
                String[] file = line.split(cvsSplitBy);
                System.out.println("Traduci: ");
                parola = s.nextLine();
                if ("rosso".equals(parola)) {
                    System.out.println(file[1]);
                }
               

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
    

