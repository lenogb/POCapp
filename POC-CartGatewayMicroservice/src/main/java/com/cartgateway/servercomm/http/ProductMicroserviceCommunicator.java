package com.cartgateway.servercomm.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.cartgateway.logger.GatewayLogger;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ProductMicroserviceCommunicator {

	//-----------------------------------------------------------------//
	// SEND DATA TO PRODUCT MICROSERVICE USING HTTPCLIENT CLASS
	//-----------------------------------------------------------------//
	
//	@Value("${PATH.TO.PRODUCT-MICROSERVICE}")
	@Value("http://localhost:8887/api/v1/cartRelatedOperations")
	private String otherServletsContextPath;
	@Autowired GatewayLogger logger;
	
	HttpClient client = HttpClient.newHttpClient();
	
	public int sendRequestToProductMicroservice(
			String uri, 
			Object requestBody) throws IOException, InterruptedException {
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonInputString = mapper.writeValueAsString(requestBody);
		byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
		
			HttpRequest req = HttpRequest.newBuilder()
		         .uri(URI.create(otherServletsContextPath+uri))
		         .PUT(HttpRequest.BodyPublishers.ofByteArray(input))
		         .build();
		
			HttpResponse<byte[]> future = client
					    .send(
					      req,
					      HttpResponse.BodyHandlers.ofByteArray());
			
			logger.logThis(
					"Sent request to: "+future.uri()+" ["+future.request().method()+"]"
					+". Response status code: "+future.statusCode()+" ["+HttpStatus.valueOf(future.statusCode())+"]"
					);
			
			return future.statusCode();
		
	}
}
