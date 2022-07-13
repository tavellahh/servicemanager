/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

import ar.com.bpba.muleservicemanager.getBuilds.Builds;
import ar.com.bpba.muleservicemanager.getBuilds.Value;
import ar.com.bpba.muleservicemanager.getdetallerelease.DetalleRelease;
import ar.com.bpba.muleservicemanager.getdetallerelease.Task;
import ar.com.bpba.muleservicemanager.getreleases.Releases;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultListModel;

/**
 *
 * @author P046456
 */
public class Iniciador {

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    public static void main(String[] args) {
        String[] options = {"1- Option 1",
            "2- Option 2",
            "3- Option 3",
            "4- Exit",};
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 4) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        option1();
                        break;
                    case 2:
                        option2();
                        break;
                    case 3:
                        option3();
                        break;
                    case 4:
                        System.exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }
// Options

    private static void option1() {
        System.out.println("Processing . . .");
        ObtenerAllBuilds oab = new ObtenerAllBuilds();
        Builds builds = oab.obtenerAllBuilds();
          for (Value v : builds.getValue()) {

            System.out.println(v.getId());

        }
        
    }

    private static void option2() {
        System.out.println("Thanks for choosing option 2");
    }

    private static void option3() {
        System.out.println("Thanks for choosing option 3");
    }
}


