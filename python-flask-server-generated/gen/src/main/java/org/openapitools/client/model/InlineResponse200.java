/*
 * Beverage E-commerce API
 * API for managing beverages, labels, ingredients, container types, and unit measures in a beverage e-commerce platform.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Beverage;
import org.openapitools.client.model.PaginationLinks;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T11:51:08.794084+02:00[Europe/Bucharest]")
public class InlineResponse200 {
  public static final String SERIALIZED_NAME_BEVERAGES = "beverages";
  @SerializedName(SERIALIZED_NAME_BEVERAGES)
  private List<Beverage> beverages = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<PaginationLinks> links = null;


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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Beverage> getBeverages() {
    return beverages;
  }


  public void setBeverages(List<Beverage> beverages) {
    this.beverages = beverages;
  }


  public InlineResponse200 links(List<PaginationLinks> links) {
    
    this.links = links;
    return this;
  }

  public InlineResponse200 addLinksItem(PaginationLinks linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<PaginationLinks>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaginationLinks> getLinks() {
    return links;
  }


  public void setLinks(List<PaginationLinks> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

