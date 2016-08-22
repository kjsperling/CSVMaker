package kjsperling.csvmaker.util;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EncodingUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;


public class RESTUtil {


    public RESTcreds login(String qaBox,String username, String password){

        String token="";
        String url;
        RESTcreds restCreds = null;

        try {

            URI uri = new URIBuilder()
                .setScheme("http")
                .setHost(qaBox+"-backend:8181")
                .setPath("/rest-services/login")
                .setParameter("username",username)
                .setParameter("password",password)
                .setParameter("version","*")
                .build();

            HttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(uri);
            httpGet.setHeader("Content-type", "application/json");
            HttpResponse response = httpClient.execute(httpGet);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
            String output;

            StringBuilder stringBuilder = new StringBuilder();


            while ((output = bufferedReader.readLine()) != null) {
                System.out.println(output);
                stringBuilder.append(output);
            }
            bufferedReader.close();

            String json = stringBuilder.toString();

            JSONObject jsonObject = new JSONObject(json);

            token = jsonObject.get("BhRestToken").toString();
            url = jsonObject.get("restUrl").toString();

            String path = new URL(url).getPath();

            restCreds = new RESTcreds(token,path.toString(),qaBox);

            System.out.print(token);

        }catch (IOException e){
            e.printStackTrace();
        }catch (URISyntaxException e){
            e.printStackTrace();
        }

        return restCreds;
    }

    public void getCategories(RESTcreds restCreds){

        try {

            URI uri = new URIBuilder()
                    .setScheme("http")
                    .setHost(restCreds.getQaBox()+"-backend:8181")
                    .setPath(restCreds.getPath()+"query/Category")
                    .setParameter("fields","name")
                    .setParameter("where","id is not null")
                    .setParameter("BhRestToken",restCreds.getRestToken())
                    .build();

            HttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(uri);
            httpGet.setHeader("Content-type", "application/json");
            HttpResponse response = httpClient.execute(httpGet);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
            String output;

            StringBuilder stringBuilder = new StringBuilder();

            while ((output = bufferedReader.readLine()) != null) {
                System.out.println(output);
                stringBuilder.append(output);
            }
            bufferedReader.close();

            String json = stringBuilder.toString();

            JSONObject jsonObject = new JSONObject(json);

            JSONArray jsonArray = jsonObject.getJSONArray("data");

            jsonToList("name",jsonArray);

         }catch (IOException e){
            e.printStackTrace();
        }catch (URISyntaxException e){
            e.printStackTrace();
        }
    }

    private ArrayList jsonToList(String thing,JSONArray jsonArray){

        ArrayList<String> list = new ArrayList<String>();

        for (int i=0;i<jsonArray.length();i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            list.add(jsonObject.getString(thing));
        }
        return list;
    }


}
