package generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T22:33:10.071138600+03:00[Europe/Bucharest]")


public class Brand   {
  @JsonProperty("brandId")
  private Integer brandId = null;

  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("brandDescription")
  private String brandDescription = null;

  public Brand brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Unique identifier for the brand
   * @return brandId
   **/
  @Schema(required = true, description = "Unique identifier for the brand")
      @NotNull

    public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public Brand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Name of the brand
   * @return brandName
   **/
  @Schema(required = true, description = "Name of the brand")
      @NotNull

    public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public Brand brandDescription(String brandDescription) {
    this.brandDescription = brandDescription;
    return this;
  }

  /**
   * Description of the brand
   * @return brandDescription
   **/
  @Schema(description = "Description of the brand")
  
    public String getBrandDescription() {
    return brandDescription;
  }

  public void setBrandDescription(String brandDescription) {
    this.brandDescription = brandDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brand brand = (Brand) o;
    return Objects.equals(this.brandId, brand.brandId) &&
        Objects.equals(this.brandName, brand.brandName) &&
        Objects.equals(this.brandDescription, brand.brandDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandName, brandDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brand {\n");
    
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    brandDescription: ").append(toIndentedString(brandDescription)).append("\n");
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
