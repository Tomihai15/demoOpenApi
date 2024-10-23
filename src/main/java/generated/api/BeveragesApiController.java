package generated.api;

import generated.model.Beverage;
import generated.model.BeveragesBody;
import generated.model.BeveragesIdBody;
import generated.model.BeveragesIdBody1;
import generated.model.ErrorResponse;
import generated.model.IdLabelsBody;
import generated.model.InlineResponse200;
import generated.model.InlineResponse2001;
import generated.model.InlineResponse201;
import generated.model.Label;
import generated.model.LabelsIdBody;
import generated.model.LabelsIdBody1;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T22:33:10.071138600+03:00[Europe/Bucharest]")
@RestController
public class BeveragesApiController implements BeveragesApi {

    private static final Logger log = LoggerFactory.getLogger(BeveragesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BeveragesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse201> createBeverage(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BeveragesBody body) {
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

    public ResponseEntity<InlineResponse201> createLabel(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody IdLabelsBody body) {
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

    public ResponseEntity<Void> deleteBeverage(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteLabel(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the label.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Beverage> getBeverageById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Beverage>(objectMapper.readValue("{\r\n  \"labelId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"containerTypeId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n  \"brandId\" : 0,\r\n  \"description\" : \"description\",\r\n  \"ingredients\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ],\r\n  \"links\" : [ {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  }, {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  } ],\r\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n}", Beverage.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Beverage>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Beverage>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> getBeverages(@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Page number." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="1")) @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page,@Min(5) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "Number of items per page." ,schema=@Schema(allowableValues={ "5", "50" }, minimum="5", maximum="50"
, defaultValue="10")) @Valid @RequestParam(value = "per_page", required = false, defaultValue="10") Integer perPage) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\r\n  \"beverages\" : [ {\r\n    \"labelId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n    \"containerTypeId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n    \"brandId\" : 0,\r\n    \"description\" : \"description\",\r\n    \"ingredients\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ],\r\n    \"links\" : [ {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    }, {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    } ],\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"labelId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n    \"containerTypeId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\r\n    \"brandId\" : 0,\r\n    \"description\" : \"description\",\r\n    \"ingredients\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ],\r\n    \"links\" : [ {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    }, {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    } ],\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  } ],\r\n  \"links\" : [ null, null ]\r\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Label> getLabelById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the label.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Label>(objectMapper.readValue("{\r\n  \"name\" : \"name\",\r\n  \"description\" : \"description\",\r\n  \"links\" : [ {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  }, {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  } ],\r\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n}", Label.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Label>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Label>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> getLabels() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\r\n  \"links\" : [ null, null ],\r\n  \"labels\" : [ {\r\n    \"name\" : \"name\",\r\n    \"description\" : \"description\",\r\n    \"links\" : [ {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    }, {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    } ],\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"name\" : \"name\",\r\n    \"description\" : \"description\",\r\n    \"links\" : [ {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    }, {\r\n      \"method\" : \"method\",\r\n      \"rel\" : \"rel\",\r\n      \"href\" : \"href\"\r\n    } ],\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  } ]\r\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> replaceBeverage(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BeveragesIdBody body) {
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

    public ResponseEntity<InlineResponse201> replaceLabel(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the label.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody LabelsIdBody body) {
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

    public ResponseEntity<InlineResponse201> updateBeverage(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BeveragesIdBody1 body) {
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

    public ResponseEntity<InlineResponse201> updateLabel(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the label.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody LabelsIdBody1 body) {
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
