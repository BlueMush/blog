package com.example.blog;

import com.example.blog.main.controller.MainController;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
@AllArgsConstructor
class BlogApplicationTests {

	private final MainController mainController;

	@Test
	void contextLoads() {
	}
}
