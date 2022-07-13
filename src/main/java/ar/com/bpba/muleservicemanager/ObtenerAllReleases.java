/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

import ar.com.bpba.muleservicemanager.getreleases.Releases;
import ar.com.bpba.muleservicemanager.getreleases.Value;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P046456
 */
public class ObtenerAllReleases {
    
    public Releases obtenerAllReleases(){
        
        String getReleases = "http://srvtfsappr01:8080/tfs/An%C3%A1lisis%20y%20Desarrollo/FrontEnd/_apis/release/definitions?api-version=2.2-preview";
        String response = "";
        Releases r=null;
        try {
            response = ConectorTFS.get(getReleases);
            r = new Gson().fromJson(response, Releases.class);
        } catch (Exception ex) {
            Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    
}
