package generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import generated.model.HateoasLink;
import generated.model.Ingredient;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T22:33:10.071138600+03:00[Europe/Bucharest]")


public class InlineResponse2003   {
  @JsonProperty("ingredients")
  @Valid
  private List<Ingredient> ingredients = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public InlineResponse2003 ingredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public InlineResponse2003 addIngredientsItem(Ingredient ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new ArrayList<Ingredient>();
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
    public List<Ingredient> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  public InlineResponse2003 links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public InlineResponse2003 addLinksItem(HateoasLink linksItem) {
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
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.ingredients, inlineResponse2003.ingredients) &&
        Objects.equals(this.links, inlineResponse2003.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredients, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
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
