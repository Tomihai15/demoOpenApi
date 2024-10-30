package com.example.demo.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * HateoasLink
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T23:06:47.905007700+03:00[Europe/Bucharest]")


public class HateoasLink   {
  @JsonProperty("rel")
  private String rel = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("method")
  private String method = null;

  public HateoasLink rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Relationship type (e.g., self, next).
   * @return rel
   **/
  @Schema(required = true, description = "Relationship type (e.g., self, next).")
      @NotNull

    public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public HateoasLink href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference.
   * @return href
   **/
  @Schema(required = true, description = "Hyperlink reference.")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public HateoasLink method(String method) {
    this.method = method;
    return this;
  }

  /**
   * HTTP method (e.g., GET, POST).
   * @return method
   **/
  @Schema(required = true, description = "HTTP method (e.g., GET, POST).")
      @NotNull

    public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HateoasLink hateoasLink = (HateoasLink) o;
    return Objects.equals(this.rel, hateoasLink.rel) &&
        Objects.equals(this.href, hateoasLink.href) &&
        Objects.equals(this.method, hateoasLink.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HateoasLink {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
