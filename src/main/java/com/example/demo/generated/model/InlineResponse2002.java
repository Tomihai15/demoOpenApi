package com.example.demo.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * InlineResponse2002
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")


public class InlineResponse2002   {
  @JsonProperty("brands")
  @Valid
  private List<Brand> brands = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public InlineResponse2002 brands(List<Brand> brands) {
    this.brands = brands;
    return this;
  }

  public InlineResponse2002 addBrandsItem(Brand brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<Brand>();
    }
    this.brands.add(brandsItem);
    return this;
  }

  /**
   * Get brands
   * @return brands
   **/
  @Schema(description = "")
      @Valid
    public List<Brand> getBrands() {
    return brands;
  }

  public void setBrands(List<Brand> brands) {
    this.brands = brands;
  }

  public InlineResponse2002 links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public InlineResponse2002 addLinksItem(HateoasLink linksItem) {
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
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.brands, inlineResponse2002.brands) &&
        Objects.equals(this.links, inlineResponse2002.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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
