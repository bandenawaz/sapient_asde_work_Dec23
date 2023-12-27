package org.example.jep321.httpclientapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class APITester {

    public static void main(String[] args) {

        //1. Create a HttpClient instance using
        //HttpClient.newBuilder() instance
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        try {
            //2. Create HttpRequest instance using
            //HttpRequest.newBuilder() instance
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
                    .build();
            //3. Make request using httpClient.send()
           //and get response object

                HttpResponse<String> response =
                        httpClient.send(request,
                                HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code : " + response.statusCode());
            System.out.println("Headers : " +response.headers());
            System.out.println("Body : "+ response.body());
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
