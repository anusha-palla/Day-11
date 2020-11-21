package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.src.FileEx;

class FileExTest {

	@Test
	void testFile() {
		FileEx f=new FileEx();
		String actualvalue=f.display("Anusha");
		String expectedvalue="Anusha";
		assertEquals(expectedvalue,actualvalue);
	}

}
