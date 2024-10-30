package com.example.demo.generated.api;

import com.example.demo.generated.model.Ingredient;
import com.example.demo.generated.model.IngredientsBody;
import com.example.demo.generated.model.IngredientsIdBody;
import com.example.demo.generated.model.IngredientsIdBody1;
import com.example.demo.generated.model.InlineResponse2003;
import com.example.demo.generated.model.InlineResponse201;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")
@RestController
public class IngredientsApiController implements IngredientsApi {

    private static final Logger log = LoggerFactory.getLogger(IngredientsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IngredientsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse201> createIngredient(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody IngredientsBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\r\n  \"links\" : [ {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  }, {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  } ],\r\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteIngredient(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the ingredient.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Ingredient> getIngredientById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the ingredient.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Ingredient>(objectMapper.readValue("{\r\n  \"name\" : \"name\",\r\n  \"allergenInfo\" : \"allergenInfo\",\r\n  \"links\" : [ {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  }, {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  } ],\r\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n}", Ingredient.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Ingredient>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Ingredient>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> getIngredients() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\r\n  \"ingredients\" : [ {\r\n    \"name\" : \"name\",\r\n    \"allergenInfo\" : \"allergenInfo\",\r\n    \"links\" : [ {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    }, {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    } ],\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"name\" : \"name\",\r\n    \"allergenInfo\" : \"allergenInfo\",\r\n    \"links\" : [ {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    }, {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    } ],\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  } ],\r\n  \"links\" : [ null, null ]\r\n}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> replaceIngredient(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the ingredient.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody IngredientsIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\r\n  \"links\" : [ {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  }, {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  } ],\r\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> updateIngredient(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the ingredient.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody IngredientsIdBody1 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\r\n  \"links\" : [ {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  }, {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  } ],\r\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

}
