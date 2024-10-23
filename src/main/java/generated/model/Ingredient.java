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
 * Ingredient
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T22:33:10.071138600+03:00[Europe/Bucharest]")


public class Ingredient   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("allergenInfo")
  private String allergenInfo = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public Ingredient id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the ingredient.
   * @return id
   **/
  @Schema(required = true, description = "Unique identifier for the ingredient.")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Ingredient name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the ingredient.
   * @return name
   **/
  @Schema(required = true, description = "Name of the ingredient.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ingredient allergenInfo(String allergenInfo) {
    this.allergenInfo = allergenInfo;
    return this;
  }

  /**
   * Allergen information.
   * @return allergenInfo
   **/
  @Schema(description = "Allergen information.")
  
    public String getAllergenInfo() {
    return allergenInfo;
  }

  public void setAllergenInfo(String allergenInfo) {
    this.allergenInfo = allergenInfo;
  }

  public Ingredient links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public Ingredient addLinksItem(HateoasLink linksItem) {
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
    Ingredient ingredient = (Ingredient) o;
    return Objects.equals(this.id, ingredient.id) &&
        Objects.equals(this.name, ingredient.name) &&
        Objects.equals(this.allergenInfo, ingredient.allergenInfo) &&
        Objects.equals(this.links, ingredient.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, allergenInfo, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ingredient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    allergenInfo: ").append(toIndentedString(allergenInfo)).append("\n");
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
