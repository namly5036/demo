package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConvertToMarkdownForWebsite200Response
 */

@JsonTypeName("convertToMarkdownForWebsite_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:56:40.073353400+07:00[Asia/Bangkok]")
public class ConvertToMarkdownForWebsite200Response {

  @JsonProperty("anonymous3")
  private String anonymous3;

  public ConvertToMarkdownForWebsite200Response anonymous3(String anonymous3) {
    this.anonymous3 = anonymous3;
    return this;
  }

  /**
   * <a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>
   * @return anonymous3
  */
  
  @Schema(name = "anonymous3", description = "<a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>", required = false)
  public String getAnonymous3() {
    return anonymous3;
  }

  public void setAnonymous3(String anonymous3) {
    this.anonymous3 = anonymous3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertToMarkdownForWebsite200Response convertToMarkdownForWebsite200Response = (ConvertToMarkdownForWebsite200Response) o;
    return Objects.equals(this.anonymous3, convertToMarkdownForWebsite200Response.anonymous3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymous3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertToMarkdownForWebsite200Response {\n");
    sb.append("    anonymous3: ").append(toIndentedString(anonymous3)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

