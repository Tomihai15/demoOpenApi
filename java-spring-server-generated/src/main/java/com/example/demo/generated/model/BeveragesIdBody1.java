package com.example.demo.generated.model;

import java.util.Objects;
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
 * BeveragesIdBody1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-30T11:22:53.044021+02:00[Europe/Bucharest]")


public class BeveragesIdBody1   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("brandId")
  private UUID brandId = null;

  @JsonProperty("labelId")
  private UUID labelId = null;

  @JsonProperty("containerTypeId")
  private UUID containerTypeId = null;

  @JsonProperty("ingredients")
  @Valid
  private List<UUID> ingredients = null;

  public BeveragesIdBody1 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BeveragesIdBody1 brandId(UUID brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
   **/
  @Schema(description = "")
  
    @Valid
    public UUID getBrandId() {
    return brandId;
  }

  public void setBrandId(UUID brandId) {
    this.brandId = brandId;
  }

  public BeveragesIdBody1 labelId(UUID labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * Get labelId
   * @return labelId
   **/
  @Schema(description = "")
  
    @Valid
    public UUID getLabelId() {
    return labelId;
  }

  public void setLabelId(UUID labelId) {
    this.labelId = labelId;
  }

  public BeveragesIdBody1 containerTypeId(UUID containerTypeId) {
    this.containerTypeId = containerTypeId;
    return this;
  }

  /**
   * Get containerTypeId
   * @return containerTypeId
   **/
  @Schema(description = "")
  
    @Valid
    public UUID getContainerTypeId() {
    return containerTypeId;
  }

  public void setContainerTypeId(UUID containerTypeId) {
    this.containerTypeId = containerTypeId;
  }

  public BeveragesIdBody1 ingredients(List<UUID> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public BeveragesIdBody1 addIngredientsItem(UUID ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new ArrayList<UUID>();
    }
    this.ingredients.add(ingredientsItem);
    return this;
  }

  /**
   * Get ingredients
   * @return ingredients
   **/
  @Schema(description = "")
      @Valid
    public List<UUID> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<UUID> ingredients) {
    this.ingredients = ingredients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeveragesIdBody1 beveragesIdBody1 = (BeveragesIdBody1) o;
    return Objects.equals(this.description, beveragesIdBody1.description) &&
        Objects.equals(this.brandId, beveragesIdBody1.brandId) &&
        Objects.equals(this.labelId, beveragesIdBody1.labelId) &&
        Objects.equals(this.containerTypeId, beveragesIdBody1.containerTypeId) &&
        Objects.equals(this.ingredients, beveragesIdBody1.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, brandId, labelId, containerTypeId, ingredients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeveragesIdBody1 {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    containerTypeId: ").append(toIndentedString(containerTypeId)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
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
