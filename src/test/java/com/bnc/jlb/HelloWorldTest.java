package com.bnc.jlb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld("junit");
        assertThat(helloWorld.toString()).isNotBlank();
        assertThat(helloWorld.toString()).isEqualTo("Hello junit");
    }

}
