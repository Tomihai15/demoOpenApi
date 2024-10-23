package generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContainertypesIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")


public class ContainertypesIdBody   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("volume")
  private Float volume = null;

  public ContainertypesIdBody type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContainertypesIdBody volume(Float volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
   **/
  @Schema(description = "")
  
    public Float getVolume() {
    return volume;
  }

  public void setVolume(Float volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainertypesIdBody containertypesIdBody = (ContainertypesIdBody) o;
    return Objects.equals(this.type, containertypesIdBody.type) &&
        Objects.equals(this.volume, containertypesIdBody.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainertypesIdBody {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
