
package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Main {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException, InterruptedException {
        String todoUrl = "https://jsonplaceholder.typicode.com/todos";
        try (var httpClient = HttpClient.newHttpClient()) {
            var httpRequest = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(todoUrl))
                    .build();
            var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            var respBody = response.body();
            var todos = objectMapper.readValue(respBody, new TypeReference<List<Todo>>() {});
            for (var t : todos) {
                System.out.println(t);
            }
        }
    }

    private record Todo(int userId, int id, String title, boolean completed) {

    }
}
