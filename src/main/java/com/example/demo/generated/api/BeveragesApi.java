/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.demo.generated.api;

import com.example.demo.generated.model.Beverage;
import com.example.demo.generated.model.BeveragesBody;
import com.example.demo.generated.model.BeveragesIdBody;
import com.example.demo.generated.model.BeveragesIdBody1;
import com.example.demo.generated.model.ErrorResponse;
import com.example.demo.generated.model.IdLabelsBody;
import com.example.demo.generated.model.InlineResponse200;
import com.example.demo.generated.model.InlineResponse2001;
import com.example.demo.generated.model.InlineResponse201;
import com.example.demo.generated.model.Label;
import com.example.demo.generated.model.LabelsIdBody;
import com.example.demo.generated.model.LabelsIdBody1;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-30T11:22:53.044021+02:00[Europe/Bucharest]")
@Validated
public interface BeveragesApi {

    @Operation(summary = "Create a new beverage", description = "Creates a new beverage.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "beverage" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Beverage created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse201> createBeverage(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BeveragesBody body);


    @Operation(summary = "Create a new label", description = "Creates a new label.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "label" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Label created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{id}/labels",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse201> createLabel(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverages.", required=true, schema=@Schema()) @PathVariable("id") UUID id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody IdLabelsBody body);


    @Operation(summary = "Delete a beverage", description = "Deletes a beverage.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "beverage" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Beverage deleted successfully."),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteBeverage(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Delete a label", description = "Deletes a label.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "label" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Label deleted successfully."),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{beverageId}/labels/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteLabel(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("beverageId") UUID beverageId, @Parameter(in = ParameterIn.PATH, description = "Unique identifier for the label.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Retrieve a beverage by ID", description = "Retrieves details of a specific beverage.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "beverage" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Beverage details.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Beverage.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Beverage> getBeverageById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Retrieve all beverages", description = "Retrieves a list of all beverages.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "beverage" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A list of beverages.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "204", description = "No beverages found."),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> getBeverages(@Min(1)@Parameter(in = ParameterIn.QUERY, description = "Page number." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="1")) @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page, @Min(5) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "Number of items per page." ,schema=@Schema(allowableValues={ "5", "50" }, minimum="5", maximum="50"
, defaultValue="10")) @Valid @RequestParam(value = "per_page", required = false, defaultValue="10") Integer perPage);


    @Operation(summary = "Retrieve a label by ID and beverage ID", description = "Retrieves details of a specific label.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "label" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Label details.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Label.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{beverageId}/labels/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Label> getLabelById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("beverageId") UUID beverageId, @Parameter(in = ParameterIn.PATH, description = "Unique identifier for the label.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Retrieve all labels", description = "Retrieves a list of all labels.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "label" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A list of labels.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{id}/labels",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> getLabels(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverages.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Update a beverage", description = "Create or Replace an existing beverage.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "beverage" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Beverage updated successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "201", description = "Beverage created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse201> replaceBeverage(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("id") UUID id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BeveragesIdBody body);


    @Operation(summary = "Update a label", description = "Create or Replace an existing label.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "label" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Label updated successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{beverageId}/labels/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse201> replaceLabel(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("beverageId") UUID beverageId, @Parameter(in = ParameterIn.PATH, description = "Unique identifier for the label.", required=true, schema=@Schema()) @PathVariable("id") UUID id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody LabelsIdBody body);


    @Operation(summary = "Partially update a beverage", description = "Update an existing beverage.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "beverage" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Beverage updated successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse201> updateBeverage(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("id") UUID id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody BeveragesIdBody1 body);


    @Operation(summary = "Partially update a label", description = "Update existing label.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "label" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Label updated successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/beverages/{beverageId}/labels/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse201> updateLabel(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the beverage.", required=true, schema=@Schema()) @PathVariable("beverageId") UUID beverageId, @Parameter(in = ParameterIn.PATH, description = "Unique identifier for the label.", required=true, schema=@Schema()) @PathVariable("id") UUID id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody LabelsIdBody1 body);

}

