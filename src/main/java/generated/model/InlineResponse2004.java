package generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import generated.model.ContainerType;
import generated.model.HateoasLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2004
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T22:33:10.071138600+03:00[Europe/Bucharest]")


public class InlineResponse2004   {
  @JsonProperty("container_types")
  @Valid
  private List<ContainerType> containerTypes = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public InlineResponse2004 containerTypes(List<ContainerType> containerTypes) {
    this.containerTypes = containerTypes;
    return this;
  }

  public InlineResponse2004 addContainerTypesItem(ContainerType containerTypesItem) {
    if (this.containerTypes == null) {
      this.containerTypes = new ArrayList<ContainerType>();
    }
    this.containerTypes.add(containerTypesItem);
    return this;
  }

  /**
   * Get containerTypes
   * @return containerTypes
   **/
  @Schema(description = "")
      @Valid
    public List<ContainerType> getContainerTypes() {
    return containerTypes;
  }

  public void setContainerTypes(List<ContainerType> containerTypes) {
    this.containerTypes = containerTypes;
  }

  public InlineResponse2004 links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public InlineResponse2004 addLinksItem(HateoasLink linksItem) {
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
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.containerTypes, inlineResponse2004.containerTypes) &&
        Objects.equals(this.links, inlineResponse2004.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerTypes, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    containerTypes: ").append(toIndentedString(containerTypes)).append("\n");
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
