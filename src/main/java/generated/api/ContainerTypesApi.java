/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package generated.api;

import generated.model.ContainerType;
import generated.model.ContainertypesBody;
import generated.model.ContainertypesIdBody;
import generated.model.ErrorResponse;
import generated.model.InlineResponse2004;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T22:33:10.071138600+03:00[Europe/Bucharest]")
@Validated
public interface ContainerTypesApi {

    @Operation(summary = "Create a new container type", description = "Creates a new container type.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "container-type" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Container type created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/container-types",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse201> createContainerType(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ContainertypesBody body);


    @Operation(summary = "Delete a container type", description = "Deletes a container type.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "container-type" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Container type deleted successfully."),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/container-types/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteContainerType(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the container type.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Retrieve a container type by ID", description = "Retrieves details of a specific container type.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "container-type" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Container type details.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ContainerType.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/container-types/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ContainerType> getContainerTypeById(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the container type.", required=true, schema=@Schema()) @PathVariable("id") UUID id);


    @Operation(summary = "Retrieve all container types", description = "Retrieves a list of all container types.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "container-type" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A list of container types.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2004.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/container-types",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2004> getContainerTypes();


    @Operation(summary = "Update a container type", description = "Updates an existing container type.", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "container-type" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Container type updated successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication failed.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access forbidden.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Resource not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/container-types/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse201> updateContainerType(@Parameter(in = ParameterIn.PATH, description = "Unique identifier for the container type.", required=true, schema=@Schema()) @PathVariable("id") UUID id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ContainertypesIdBody body);

}

