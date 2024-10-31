package com.example.demo.generated.model;

import java.util.Objects;
import com.example.demo.generated.model.Beverage;
import com.example.demo.generated.model.HateoasLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-30T11:22:53.044021+02:00[Europe/Bucharest]")


public class InlineResponse200   {
  @JsonProperty("beverages")
  @Valid
  private List<Beverage> beverages = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public InlineResponse200 beverages(List<Beverage> beverages) {
    this.beverages = beverages;
    return this;
  }

  public InlineResponse200 addBeveragesItem(Beverage beveragesItem) {
    if (this.beverages == null) {
      this.beverages = new ArrayList<Beverage>();
    }
    this.beverages.add(beveragesItem);
    return this;
  }

  /**
   * Get beverages
   * @return beverages
   **/
  @Schema(description = "")
      @Valid
    public List<Beverage> getBeverages() {
    return beverages;
  }

  public void setBeverages(List<Beverage> beverages) {
    this.beverages = beverages;
  }

  public InlineResponse200 links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public InlineResponse200 addLinksItem(HateoasLink linksItem) {
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
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.beverages, inlineResponse200.beverages) &&
        Objects.equals(this.links, inlineResponse200.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beverages, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    beverages: ").append(toIndentedString(beverages)).append("\n");
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
