package generated.api;

import generated.model.Brand;
import generated.model.BrandsBody;
import generated.model.BrandsIdBody;
import generated.model.BrandsIdBody1;
import generated.model.ErrorResponse;
import generated.model.InlineResponse2002;
import generated.model.InlineResponse201;
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
public class BrandsApiController implements BrandsApi {

    private static final Logger log = LoggerFactory.getLogger(BrandsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BrandsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse201> createBrand(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BrandsBody body) {
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

    public ResponseEntity<Void> deleteBrand(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the brand.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Brand> getBrandById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the brand.", required=true, schema=@Schema()) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Brand>(objectMapper.readValue("{\r\n  \"brandName\" : \"brandName\",\r\n  \"brandDescription\" : \"brandDescription\",\r\n  \"brandId\" : 0\r\n}", Brand.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Brand>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Brand>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> getBrands(@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Page number." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="1")) @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page,@Min(1) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "Number of items per page." ,schema=@Schema(allowableValues={ "1", "50" }, minimum="1", maximum="50"
, defaultValue="10")) @Valid @RequestParam(value = "per_page", required = false, defaultValue="10") Integer perPage) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\r\n  \"brands\" : [ {\r\n    \"brandName\" : \"brandName\",\r\n    \"brandDescription\" : \"brandDescription\",\r\n    \"brandId\" : 0\r\n  }, {\r\n    \"brandName\" : \"brandName\",\r\n    \"brandDescription\" : \"brandDescription\",\r\n    \"brandId\" : 0\r\n  } ],\r\n  \"links\" : [ {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  }, {\r\n    \"method\" : \"method\",\r\n    \"rel\" : \"rel\",\r\n    \"href\" : \"href\"\r\n  } ]\r\n}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> replaceBrand(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the brand.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BrandsIdBody body) {
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

    public ResponseEntity<InlineResponse201> updateBrand(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the brand.", required=true, schema=@Schema()) @PathVariable("id") UUID id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BrandsIdBody1 body) {
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
