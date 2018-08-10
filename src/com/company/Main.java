package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Scanner tb = new Scanner(System.in);
        System.out.println("Scrhijf een tekst: ");
        String tekst = tb.nextLine();
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(tekst)));
        writer.close();
        
        Scanner rd = new Scanner(new BufferedReader(new FileReader(tekst)));
        while (rd.hasNextLine()){
            String line = rd.nextLine();
        System.out.println(line);}
        rd.close();


    }


}

