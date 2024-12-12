package com.example.kotlin_spring_crud_web_api

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest
class KotlinSpringCrudWebApiApplicationTests(@Autowired val mockMvc: MockMvc) {

	@Test
	@DisplayName("GET /customers のテスト")
	fun read() {
	}

}
