package com.example.sample.controller;

import com.example.sample.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {

    @Test
    public void test() throws IOException {
        SampleController sampleController = new SampleController();
        Response breedList = sampleController.getBreedList();
        System.out.println(new ObjectMapper().writeValueAsString(breedList));
    }

}