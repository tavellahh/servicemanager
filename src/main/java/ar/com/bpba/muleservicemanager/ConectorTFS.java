/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

import ar.com.bpba.muleservicemanager.response.ResponseTFS;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ConectorTFS {

    public static int post(String body, String url) throws Exception {

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(AuthScope.ANY, new NTCredentials(Variables.usuario, Variables.password, "", ""));
        HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(credsProvider).build();
       
        HttpPost post = new HttpPost(url); //Provide Request URL

        StringEntity input = new StringEntity(body);
        input.setContentType("text/json; charset=utf-8");
        post.setEntity(input);
        post.setHeader("Content-type", "application/json; charset=utf-8");

        HttpResponse response = client.execute(post);
        HttpEntity responseEntity = response.getEntity();
        System.out.println(EntityUtils.toString(responseEntity));

        return response.getStatusLine().getStatusCode();
    }

    public static String get(String url) throws Exception {
        HttpGet httpGet = new HttpGet(url);
        String rtfs = "";
        

        
        
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(AuthScope.ANY, new NTCredentials(Variables.usuario, Variables.password, "", ""));
        HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(credsProvider).build();
        HttpResponse response = client.execute(httpGet);

        HttpEntity responseEntity = response.getEntity();
        if (responseEntity != null) {
            rtfs =EntityUtils.toString(responseEntity);
        }

        return rtfs;
    }
    
     public static int put(String url, String body) throws Exception {
         
         
         
       
        HttpPut put = new HttpPut(url);
        put.addHeader("content-type", "application/json");
        put.setEntity(new StringEntity(body, StandardCharsets.UTF_8));
        

        
        HttpResponse response = getClient().execute(put);
        HttpEntity responseEntity = response.getEntity();
        
        System.out.println(EntityUtils.toString(responseEntity));  
        return response.getStatusLine().getStatusCode();
         
         
     }
     
     private static HttpClient getClient(){
         CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(AuthScope.ANY, new NTCredentials(Variables.usuario, Variables.password, "", ""));
        HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(credsProvider).build();
        
        return client;
     }

}
