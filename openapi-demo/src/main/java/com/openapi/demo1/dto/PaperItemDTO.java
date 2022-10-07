package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.PaperItemKey;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaperItemDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:56:40.073353400+07:00[Asia/Bangkok]")
public class PaperItemDTO {

  @JsonProperty("title")
  private String title;

  @JsonProperty("authors")
  private String authors;

  @JsonProperty("venue")
  private String venue;

  @JsonProperty("paperItemId")
  private PaperItemKey paperItemId;

  public PaperItemDTO title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>
   * @return title
  */
  
  @Schema(name = "title", description = "<a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>", required = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PaperItemDTO authors(String authors) {
    this.authors = authors;
    return this;
  }

  /**
   * <a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>
   * @return authors
  */
  
  @Schema(name = "authors", description = "<a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>", required = false)
  public String getAuthors() {
    return authors;
  }

  public void setAuthors(String authors) {
    this.authors = authors;
  }

  public PaperItemDTO venue(String venue) {
    this.venue = venue;
    return this;
  }

  /**
   * <a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>
   * @return venue
  */
  
  @Schema(name = "venue", description = "<a href=\"https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\" target=\"_blank\">Data Element</a>", required = false)
  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public PaperItemDTO paperItemId(PaperItemKey paperItemId) {
    this.paperItemId = paperItemId;
    return this;
  }

  /**
   * Get paperItemId
   * @return paperItemId
  */
  @Valid 
  @Schema(name = "paperItemId", required = false)
  public PaperItemKey getPaperItemId() {
    return paperItemId;
  }

  public void setPaperItemId(PaperItemKey paperItemId) {
    this.paperItemId = paperItemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaperItemDTO paperItemDTO = (PaperItemDTO) o;
    return Objects.equals(this.title, paperItemDTO.title) &&
        Objects.equals(this.authors, paperItemDTO.authors) &&
        Objects.equals(this.venue, paperItemDTO.venue) &&
        Objects.equals(this.paperItemId, paperItemDTO.paperItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, authors, venue, paperItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaperItemDTO {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    paperItemId: ").append(toIndentedString(paperItemId)).append("\n");
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

