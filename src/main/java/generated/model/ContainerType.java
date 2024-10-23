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
 * ContainerType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")


public class ContainerType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("volume")
  private Integer volume = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public ContainerType id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the container type.
   * @return id
   **/
  @Schema(required = true, description = "Unique identifier for the container type.")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ContainerType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of container (e.g., Bottle, Can).
   * @return type
   **/
  @Schema(required = true, description = "Type of container (e.g., Bottle, Can).")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContainerType volume(Integer volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Volume in milliliters.
   * @return volume
   **/
  @Schema(required = true, description = "Volume in milliliters.")
      @NotNull

    public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public ContainerType links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public ContainerType addLinksItem(HateoasLink linksItem) {
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
    ContainerType containerType = (ContainerType) o;
    return Objects.equals(this.id, containerType.id) &&
        Objects.equals(this.type, containerType.type) &&
        Objects.equals(this.volume, containerType.volume) &&
        Objects.equals(this.links, containerType.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, volume, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
