package com.yash.productservice;

import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

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
