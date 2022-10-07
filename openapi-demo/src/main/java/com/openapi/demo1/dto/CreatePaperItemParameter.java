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
 * CreatePaperItemParameter
 */

@JsonTypeName("createPaperItemParameter")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:56:40.073353400+07:00[Asia/Bangkok]")
public class CreatePaperItemParameter {

  @JsonProperty("who")
  private String who;

  @JsonProperty("what")
  private String what;

  @JsonProperty("where")
  private String where;

  public CreatePaperItemParameter who(String who) {
    this.who = who;
    return this;
  }

  /**
   * <a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>
   * @return who
  */
  
  @Schema(name = "who", description = "<a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>", required = false)
  public String getWho() {
    return who;
  }

  public void setWho(String who) {
    this.who = who;
  }

  public CreatePaperItemParameter what(String what) {
    this.what = what;
    return this;
  }

  /**
   * <a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>
   * @return what
  */
  
  @Schema(name = "what", description = "<a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>", required = false)
  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public CreatePaperItemParameter where(String where) {
    this.where = where;
    return this;
  }

  /**
   * <a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>
   * @return where
  */
  
  @Schema(name = "where", description = "<a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>", required = false)
  public String getWhere() {
    return where;
  }

  public void setWhere(String where) {
    this.where = where;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaperItemParameter createPaperItemParameter = (CreatePaperItemParameter) o;
    return Objects.equals(this.who, createPaperItemParameter.who) &&
        Objects.equals(this.what, createPaperItemParameter.what) &&
        Objects.equals(this.where, createPaperItemParameter.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(who, what, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaperItemParameter {\n");
    sb.append("    who: ").append(toIndentedString(who)).append("\n");
    sb.append("    what: ").append(toIndentedString(what)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

