package com.example.demo.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IngredientsIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-30T11:22:53.044021+02:00[Europe/Bucharest]")


public class IngredientsIdBody   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("allergen_info")
  private String allergenInfo = null;

  public IngredientsIdBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientsIdBody allergenInfo(String allergenInfo) {
    this.allergenInfo = allergenInfo;
    return this;
  }

  /**
   * Get allergenInfo
   * @return allergenInfo
   **/
  @Schema(description = "")
  
    public String getAllergenInfo() {
    return allergenInfo;
  }

  public void setAllergenInfo(String allergenInfo) {
    this.allergenInfo = allergenInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientsIdBody ingredientsIdBody = (IngredientsIdBody) o;
    return Objects.equals(this.name, ingredientsIdBody.name) &&
        Objects.equals(this.allergenInfo, ingredientsIdBody.allergenInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, allergenInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientsIdBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    allergenInfo: ").append(toIndentedString(allergenInfo)).append("\n");
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