package com.yash.product.service;

import com.yash.product.service.dto.ProductRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

@SpringBootTest
@Testcontainers
class ProductServiceApplicationTests {

//	@Container
//	static MongoDBContainer mongoDBContainer= new MongoDBContainer("mongo:4.4.2");
//
//	@Autowired
//	MockMvc mockMvc;
//
//	@Autowired
//	ObjectMapper objectMapper;
//
//	@DynamicPropertySource
//	static  void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri",mongoDBContainer::getReplicaSetUrl);
//	}
//	@Test
//	void shouldCreateProduct() throws Exception {
//
//		ProductRequest productRequest= getProductRequest();
//	 	String productRequestString= objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(productRequestString))
//				.andExpect(MockMvcResultMatchers.status().isCreated()
//);
//
//	}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder().name("oneplus 2t")
//				.price(BigDecimal.valueOf(30000))
//				.description("good one")
//				.build();
//	}

}
