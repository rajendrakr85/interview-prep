package com.pack.box;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.concurrent.*;

public class RestCaller100 {
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final String URL = "http://localhost:8080/api/your-endpoint";

    public static void main(String[] args) throws Exception {
        int requestCount = 1000;

        List<CompletableFuture<Void>> futures = new ArrayList();

        for (int i = 0; i < requestCount; i++) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .GET()
                    .build();

            CompletableFuture<Void> future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenAccept(response -> {
                        System.out.println("[" + Thread.currentThread().getName() + "] Response: " + response.body());
                    });

            futures.add(future);
        }

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
        System.out.println("All requests completed.");
    }
}
