package com.example.demo.generated.api;

import com.example.demo.generated.model.ContainerType;
import com.example.demo.generated.model.ContainertypesBody;
import com.example.demo.generated.model.ContainertypesIdBody;
import com.example.demo.generated.model.InlineResponse2004;
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
public class ContainerTypesApiController implements ContainerTypesApi {

    private static final Logger log = LoggerFactory.getLogger(ContainerTypesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContainerTypesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse201> createContainerType(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ContainertypesBody body) {
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

    public ResponseEntity<Void> deleteContainerType(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the container type.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContainerType> getContainerTypeById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the container type.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContainerType>(objectMapper.readValue("{\r\n  \"volume\" : 0,\r\n  \"links\" : [ {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  }, {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  } ],\r\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"type\" : \"type\"\r\n}", ContainerType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContainerType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContainerType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2004> getContainerTypes() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\r\n  \"container_types\" : [ {\r\n    \"volume\" : 0,\r\n    \"links\" : [ {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    }, {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    } ],\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n    \"type\" : \"type\"\r\n  }, {\r\n    \"volume\" : 0,\r\n    \"links\" : [ {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    }, {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    } ],\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n    \"type\" : \"type\"\r\n  } ],\r\n  \"links\" : [ null, null ]\r\n}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> updateContainerType(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the container type.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ContainertypesIdBody body) {
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
