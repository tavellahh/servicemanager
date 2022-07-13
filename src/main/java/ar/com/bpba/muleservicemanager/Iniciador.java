/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

import ar.com.bpba.muleservicemanager.getBuild.Build;
import ar.com.bpba.muleservicemanager.getBuild.BuildRoot;
import ar.com.bpba.muleservicemanager.getBuilds.Builds;
import ar.com.bpba.muleservicemanager.getBuilds.Value;
import ar.com.bpba.muleservicemanager.getdetallerelease.DetalleRelease;
import ar.com.bpba.muleservicemanager.getdetallerelease.Task;
import ar.com.bpba.muleservicemanager.getreleases.Releases;
import ar.com.bpba.muleservicemanager.response.ResponseTFS;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public static void main(String[] args) throws Exception {


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

    private static void option1() throws Exception {
        System.out.println("Processing . . .");

        int count = 0;
        int maxTries = 5;
        int totalHost = 0;

        ObtenerAllBuilds oab = new ObtenerAllBuilds();
        Builds builds = oab.obtenerAllBuilds();
        ObtenerBuild ob = new ObtenerBuild();

        int total = builds.value.size();

        for (Value v : builds.getValue()) {

            while (true) { //Reintentar por fallo de conexion
                System.out.println(v.getId() + " " + total--);
                try {
                    BuildRoot buildRoot = null;
                    try {
                        buildRoot = new Gson().fromJson(ob.obtenerBuild(v.getId()), BuildRoot.class);

                    } catch (ClassNotFoundException e) {
                        System.out.println("Id sin informacion: " + v.getId());
                        break;
                    }
                    if (buildRoot.getBuild() != null) {
                        for (Build build : buildRoot.getBuild()) {
                            if (build.getInputs().getHost() != null) {
                                if (build.getInputs().getHost().equals("10.1.13.85")) {
                                    ++totalHost;
                                }
                            }
                        }

                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Failed -----------------------> : " + v.getId());
                    try {
                        Thread.sleep(20000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (++count == maxTries) {
                        System.out.println("Close connection for several errors.");
                        throw e;
                    }
                }
            }

        }
        System.out.println("Total host to delete: " + totalHost);
    }

    private static void option2() {
        System.out.println("Thanks for choosing option 2");
    }

    private static void option3() {
        System.out.println("Thanks for choosing option 3");
    }
}
