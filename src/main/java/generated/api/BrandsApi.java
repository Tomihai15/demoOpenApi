/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package generated.api;

import generated.model.Brand;
import generated.model.BrandsBody;
import generated.model.BrandsIdBody;
import generated.model.BrandsIdBody1;
import generated.model.ErrorResponse;
import generated.model.InlineResponse2002;
import generated.model.InlineResponse201;
import java.util.UUID;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")
@Validated
public interface BrandsApi {

    @Operation(summary = "Create a new brand", description = "Creates a new brand.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "brand" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Brand created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/brands",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse201> createBrand(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BrandsBody body);


    @Operation(summary = "Delete a brand", description = "Deletes a brand.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "brand" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Brand deleted successfully."),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/brands/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteBrand(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the brand.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Retrieve a brand by ID", description = "Retrieves details of a specific brand.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "brand" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Brand details.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Brand.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/brands/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Brand> getBrandById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the brand.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Retrieve all brand", description = "Retrieves a list of all brands.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "brand" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A list of brands.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2002.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/brands",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2002> getBrands(@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Page number." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="1")) @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page, @Min(1) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "Number of items per page." ,schema=@Schema(allowableValues={ "1", "50" }, minimum="1", maximum="50"
, defaultValue="10")) @Valid @RequestParam(value = "per_page", required = false, defaultValue="10") Integer perPage);


    @Operation(summary = "Update a brand", description = "Create or replace an existing brand.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "brand" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Brand updated successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "201", description = "Brand created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/brands/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse201> replaceBrand(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the brand.", required=true, schema=@Schema()) @PathVariable("id") UUID id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BrandsIdBody body);


    @Operation(summary = "Partially update a brand", description = "Update an existing brand.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "brand" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Brand updated successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/brands/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse201> updateBrand(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the brand.", required=true, schema=@Schema()) @PathVariable("id") UUID id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BrandsIdBody1 body);

}

