package com.example.azuretestapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class AzureTestAppApplicationTests {

    @Autowired
    Model model;

    @Test
    void iEquals0() {
        assertThat(model.i).isEqualTo(0);
    }

    @Test
    void jEquals1() {
        assertThat(model.j).isEqualTo(1);
    }
}
