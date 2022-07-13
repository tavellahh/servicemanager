/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

import ar.com.bpba.muleservicemanager.getBuild.BuildRoot;
import ar.com.bpba.muleservicemanager.getBuilds.Value;
import ar.com.bpba.muleservicemanager.response.ResponseTFS;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P046456
 */
public class ObtenerBuild {

    public String obtenerBuild(int id) throws Exception {

        String getBuild = "http://srvtfsappr01:8080/tfs/An%C3%A1lisis%20y%20Desarrollo/FrontEnd/_apis/build/definitions/" + id + "?api-version=2.2";
        String response = ConectorTFS.get(getBuild);
        

        return response;
    }

}
