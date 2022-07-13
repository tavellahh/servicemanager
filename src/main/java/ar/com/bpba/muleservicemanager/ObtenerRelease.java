/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

import ar.com.bpba.muleservicemanager.getdetallerelease.DetalleRelease;
import ar.com.bpba.muleservicemanager.getreleases.Releases;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P046456
 */
public class ObtenerRelease {
    
    public DetalleRelease obtenerDetalleRelease(String id){
        
        String getReleases = "http://srvtfsappr01:8080/tfs/An%C3%A1lisis%20y%20Desarrollo/FrontEnd/_apis/release/definitions/"+id+"?api-version=2.2-preview";
        String response = "";
        DetalleRelease dr = null;
        
          try {
            response = ConectorTFS.get(getReleases);
            dr = new Gson().fromJson(response, DetalleRelease.class);
        } catch (Exception ex) {
            Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dr;
        
        
        
    }
    
    
}
