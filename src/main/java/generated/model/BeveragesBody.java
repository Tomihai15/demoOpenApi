package generated.model;

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
 * BeveragesBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")


public class BeveragesBody   {
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

  public BeveragesBody description(String description) {
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

  public BeveragesBody brandId(UUID brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public UUID getBrandId() {
    return brandId;
  }

  public void setBrandId(UUID brandId) {
    this.brandId = brandId;
  }

  public BeveragesBody labelId(UUID labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * Get labelId
   * @return labelId
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public UUID getLabelId() {
    return labelId;
  }

  public void setLabelId(UUID labelId) {
    this.labelId = labelId;
  }

  public BeveragesBody containerTypeId(UUID containerTypeId) {
    this.containerTypeId = containerTypeId;
    return this;
  }

  /**
   * Get containerTypeId
   * @return containerTypeId
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public UUID getContainerTypeId() {
    return containerTypeId;
  }

  public void setContainerTypeId(UUID containerTypeId) {
    this.containerTypeId = containerTypeId;
  }

  public BeveragesBody ingredients(List<UUID> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public BeveragesBody addIngredientsItem(UUID ingredientsItem) {
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
    BeveragesBody beveragesBody = (BeveragesBody) o;
    return Objects.equals(this.description, beveragesBody.description) &&
        Objects.equals(this.brandId, beveragesBody.brandId) &&
        Objects.equals(this.labelId, beveragesBody.labelId) &&
        Objects.equals(this.containerTypeId, beveragesBody.containerTypeId) &&
        Objects.equals(this.ingredients, beveragesBody.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, brandId, labelId, containerTypeId, ingredients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeveragesBody {\n");
    
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
