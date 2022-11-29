package com.anti;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Hello world!
 *
 *
 * https://www.youtube.com/watch?v=5MmlRZZxTqk tutorial
 * https://www.youtube.com/watch?v=5MmlRZZxTqk
 */

public class GetData {
	
	

	// public static final String POSTS_API_URL =
	// "https://jsonplaceholder.typicode.com/posts";

	public static void teszt() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest req = HttpRequest.newBuilder().GET().header("accept", "application/json")
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts")).build();

		HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());

		ObjectMapper mapper = new ObjectMapper();
		List<Post> posts = mapper.readValue(response.body(), new TypeReference<List<Post>>() {
		});

		// posts.forEach(System.out::println);

	}

	public static void teszt2() throws IOException {
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url("https://jsonplaceholder.typicode.com/posts").get().build();

		Response response = client.newCall(request).execute();

		// System.out.println(response.body().string());

		String s = response.body().string();
		//System.out.println(s);

		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(s);

		// mapper.readValues(p, valueType)
		/*
		 * readValue() can be used for any and all types, including JsonNode. readTree()
		 * only works for JsonNode (tree model); and is added for convenience.
		 * System.out.println(node.get(1));
		 * System.out.println(node.get(1).get("title"));
		 */
		
		System.out.println(node.get(1));
		System.out.println(node.get(1).get("title"));
		
		
		
		 // List<Post> posts = mapper.readValue(response.body().string(), new
		// TypeReference<List<Post>>() {});
		// posts.forEach(System.out::println);
		//System.out.println(posts.get(5).getTitle());

	}

	public static void teszt3() throws IOException {
		OkHttpClient client = new OkHttpClient();

		// Request request = new
		// Request.Builder().url("https://jsonplaceholder.typicode.com/posts").get().build();

		Request request = new Request.Builder().url("https://api.apilayer.com/fixer/convert?to=HUF&from=EUR&amount=1")
				.get().addHeader("apikey", "IMMy5Mf4lmd0K9Qib9nc7gwFCjKdyKdH").build();

		ResponseBody response = client.newCall(request).execute().body();

		System.out.println(response.string());

	}

	public static void teszt4() throws IOException {
		// You may choose readTree when you do not know exact type of the Object, and
		// readValue when you know the Object type for sure.
		// Read value can be used for your own java classes:
		String json = "{\"a\":2, \"b\":\"a string\", \"c\": [6.7, 6, 5.6, 8.0]}";
		ObjectMapper mapper = new ObjectMapper();
		Foo foo = mapper.readValue(json, Foo.class);
       System.out.println(foo.getC() [3] );
	}

}
