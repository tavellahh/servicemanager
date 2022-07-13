/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

import ar.com.bpba.muleservicemanager.getBuild.GetBuild;
import ar.com.bpba.muleservicemanager.getBuilds.Value;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P046456
 */
public class ObtenerBuild {
    
    public GetBuild obtenerBuild(Object sel){
        
        Value value = (Value) sel;
        String getBuild = "http://srvtfsappr01:8080/tfs/An%C3%A1lisis%20y%20Desarrollo/FrontEnd/_apis/build/definitions/" + value.getId() + "?api-version=2.2";
        String response = "";
        try {
            response = ConectorTFS.get(getBuild);
        } catch (Exception ex) {
            Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetBuild gb = new Gson().fromJson(response, GetBuild.class);
        
        return gb;
    }
    
}
