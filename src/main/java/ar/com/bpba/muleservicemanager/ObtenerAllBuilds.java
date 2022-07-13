/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

import ar.com.bpba.muleservicemanager.getBuilds.Builds;
import ar.com.bpba.muleservicemanager.getBuilds.Value;
import com.google.gson.Gson;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author P046456
 */
public class ObtenerAllBuilds {

    public Builds obtenerAllBuilds() {

        String getBuilds = "http://srvtfsappr01:8080/tfs/An%C3%A1lisis%20y%20Desarrollo/FrontEnd/_apis/build/definitions?api-version=2.2";
        String response = "";
        try {
            response = ConectorTFS.get(getBuilds);
        } catch (Exception ex) {
            Logger.getLogger(ServiceManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        Builds b = new Gson().fromJson(response, Builds.class);
        List<Value> values = b.getValue();

        Collections.sort(values, new Comparator<Value>() {
            @Override
            public int compare(final Value object1, final Value object2) {
                return object1.getName().compareTo(object2.getName());
            }
        });

        return b;

    }

}
