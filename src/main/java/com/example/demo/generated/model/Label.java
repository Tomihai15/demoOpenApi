package com.example.demo.generated.model;

import java.util.Objects;
import com.example.demo.generated.model.HateoasLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Label
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-30T11:22:53.044021+02:00[Europe/Bucharest]")


public class Label   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public Label id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the label.
   * @return id
   **/
  @Schema(required = true, description = "Unique identifier for the label.")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Label name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the label.
   * @return name
   **/
  @Schema(required = true, description = "Name of the label.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Label description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the label.
   * @return description
   **/
  @Schema(description = "Detailed description of the label.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Label links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public Label addLinksItem(HateoasLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<HateoasLink>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @Schema(description = "")
      @Valid
    public List<HateoasLink> getLinks() {
    return links;
  }

  public void setLinks(List<HateoasLink> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.id, label.id) &&
        Objects.equals(this.name, label.name) &&
        Objects.equals(this.description, label.description) &&
        Objects.equals(this.links, label.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
