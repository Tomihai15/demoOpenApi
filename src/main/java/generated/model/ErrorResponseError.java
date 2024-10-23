package generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import generated.model.HateoasLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponseError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")


public class ErrorResponseError   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("links")
  @Valid
  private List<HateoasLink> links = null;

  public ErrorResponseError code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * HTTP status code.
   * @return code
   **/
  @Schema(required = true, description = "HTTP status code.")
      @NotNull

    public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorResponseError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message.
   * @return message
   **/
  @Schema(required = true, description = "Error message.")
      @NotNull

    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorResponseError links(List<HateoasLink> links) {
    this.links = links;
    return this;
  }

  public ErrorResponseError addLinksItem(HateoasLink linksItem) {
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
    ErrorResponseError errorResponseError = (ErrorResponseError) o;
    return Objects.equals(this.code, errorResponseError.code) &&
        Objects.equals(this.message, errorResponseError.message) &&
        Objects.equals(this.links, errorResponseError.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
