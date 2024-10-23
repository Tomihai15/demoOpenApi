package generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import generated.model.HateoasLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Beverage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")


public class Beverage   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("brandId")
  private Integer brandId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("labelId")
  private UUID labelId = null;

  @JsonProperty("containerTypeId")
  private UUID containerTypeId = null;

  @JsonProperty("ingredients")
  @Valid
  private List<UUID> ingredients = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public Beverage id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the beverage.
   * @return id
   **/
  @Schema(required = true, description = "Unique identifier for the beverage.")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Beverage brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * ID of the brand associated with the beverage
   * @return brandId
   **/
  @Schema(required = true, description = "ID of the brand associated with the beverage")
      @NotNull

    public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public Beverage description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the beverage.
   * @return description
   **/
  @Schema(description = "Detailed description of the beverage.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Beverage labelId(UUID labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * Unique identifier of the associated label.
   * @return labelId
   **/
  @Schema(required = true, description = "Unique identifier of the associated label.")
      @NotNull

    @Valid
    public UUID getLabelId() {
    return labelId;
  }

  public void setLabelId(UUID labelId) {
    this.labelId = labelId;
  }

  public Beverage containerTypeId(UUID containerTypeId) {
    this.containerTypeId = containerTypeId;
    return this;
  }

  /**
   * Unique identifier of the container type.
   * @return containerTypeId
   **/
  @Schema(required = true, description = "Unique identifier of the container type.")
      @NotNull

    @Valid
    public UUID getContainerTypeId() {
    return containerTypeId;
  }

  public void setContainerTypeId(UUID containerTypeId) {
    this.containerTypeId = containerTypeId;
  }

  public Beverage ingredients(List<UUID> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public Beverage addIngredientsItem(UUID ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new ArrayList<UUID>();
    }
    this.ingredients.add(ingredientsItem);
    return this;
  }

  /**
   * List of ingredient IDs.
   * @return ingredients
   **/
  @Schema(description = "List of ingredient IDs.")
      @Valid
    public List<UUID> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<UUID> ingredients) {
    this.ingredients = ingredients;
  }

  public Beverage links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public Beverage addLinksItem(HateoasLink linksItem) {
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
    Beverage beverage = (Beverage) o;
    return Objects.equals(this.id, beverage.id) &&
        Objects.equals(this.brandId, beverage.brandId) &&
        Objects.equals(this.description, beverage.description) &&
        Objects.equals(this.labelId, beverage.labelId) &&
        Objects.equals(this.containerTypeId, beverage.containerTypeId) &&
        Objects.equals(this.ingredients, beverage.ingredients) &&
        Objects.equals(this.links, beverage.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brandId, description, labelId, containerTypeId, ingredients, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beverage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    containerTypeId: ").append(toIndentedString(containerTypeId)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
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
