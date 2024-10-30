package com.example.demo.generated.api;

import com.example.demo.generated.model.ContainerType;
import com.example.demo.generated.model.ContainertypesBody;
import com.example.demo.generated.model.ContainertypesIdBody;
import com.example.demo.generated.model.ErrorResponse;
import com.example.demo.generated.model.InlineResponse2004;
import com.example.demo.generated.model.InlineResponse201;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-30T11:22:53.044021+02:00[Europe/Bucharest]")
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
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"links\" : [ {\n    \"method\" : \"method\",\n    \"rel\" : \"rel\",\n    \"href\" : \"href\"\n  }, {\n    \"method\" : \"method\",\n    \"rel\" : \"rel\",\n    \"href\" : \"href\"\n  } ],\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
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
                return new ResponseEntity<ContainerType>(objectMapper.readValue("{\n  \"volume\" : 0,\n  \"links\" : [ {\n    \"method\" : \"method\",\n    \"rel\" : \"rel\",\n    \"href\" : \"href\"\n  }, {\n    \"method\" : \"method\",\n    \"rel\" : \"rel\",\n    \"href\" : \"href\"\n  } ],\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"type\" : \"type\"\n}", ContainerType.class), HttpStatus.NOT_IMPLEMENTED);
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
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\n  \"container_types\" : [ {\n    \"volume\" : 0,\n    \"links\" : [ {\n      \"method\" : \"method\",\n      \"rel\" : \"rel\",\n      \"href\" : \"href\"\n    }, {\n      \"method\" : \"method\",\n      \"rel\" : \"rel\",\n      \"href\" : \"href\"\n    } ],\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"type\" : \"type\"\n  }, {\n    \"volume\" : 0,\n    \"links\" : [ {\n      \"method\" : \"method\",\n      \"rel\" : \"rel\",\n      \"href\" : \"href\"\n    }, {\n      \"method\" : \"method\",\n      \"rel\" : \"rel\",\n      \"href\" : \"href\"\n    } ],\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"type\" : \"type\"\n  } ],\n  \"links\" : [ null, null ]\n}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
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
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"links\" : [ {\n    \"method\" : \"method\",\n    \"rel\" : \"rel\",\n    \"href\" : \"href\"\n  }, {\n    \"method\" : \"method\",\n    \"rel\" : \"rel\",\n    \"href\" : \"href\"\n  } ],\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

}
