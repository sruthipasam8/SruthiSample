package com.example.sample.controller;

import com.example.sample.model.Breed;
import com.example.sample.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping(value = "breeds/list/all")
    public Response getBreedList() throws IOException {
        Response response = new Response();
        try {
            File file = ResourceUtils.getFile("classpath:inputData.json");
            String string = new String(Files.readAllBytes(file.toPath()));
            Breed breed = new ObjectMapper().readValue(string, Breed.class);
            response.setMessage(breed);
            response.setStatus("success");
            return response;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return response;

    }

}
