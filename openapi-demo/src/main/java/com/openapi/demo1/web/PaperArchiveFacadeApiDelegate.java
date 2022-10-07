package com.openapi.demo1.web;

import com.openapi.demo1.dto.ConvertToMarkdownForWebsite200Response;
import com.openapi.demo1.dto.CreatePaperItemParameter;
import com.openapi.demo1.dto.PaperItemDTO;
import com.openapi.demo1.dto.PaperItemKey;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link PaperArchiveFacadeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:56:40.073353400+07:00[Asia/Bangkok]")
public interface PaperArchiveFacadeApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /PaperArchiveFacade : convertToMarkdownForWebsite
     * 
     *
     * @param paperItemKey  (optional)
     * @return convertToMarkdownForWebsite successful execution (status code 200)
     * @see PaperArchiveFacadeApi#convertToMarkdownForWebsite
     */
    default ResponseEntity<ConvertToMarkdownForWebsite200Response> convertToMarkdownForWebsite(PaperItemKey paperItemKey) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"anonymous3\" : \"anonymous3\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /PaperArchiveFacade : createPaperItem (write only method)
     * [State Creation Operation](https://microservice-api-patterns.org/patterns/responsibility/operationResponsibilities/StateCreationOperation.html).
     *
     * @param createPaperItemParameter  (optional)
     * @return createPaperItem successful execution (status code 200)
     * @see PaperArchiveFacadeApi#createPaperItem
     */
    default ResponseEntity<PaperItemDTO> createPaperItem(CreatePaperItemParameter createPaperItemParameter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"venue\" : \"venue\", \"paperItemId\" : { \"doi\" : \"doi\" }, \"title\" : \"title\", \"authors\" : \"authors\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /PaperArchiveFacade : lookupPapersFromAuthor (read only method)
     * [Retrieval Operation](https://microservice-api-patterns.org/patterns/responsibility/operationResponsibilities/RetrievalOperation.html).
     *
     * @param author &lt;a href&#x3D;\&quot;https://microservice-api-patterns.org/patterns/structure/elementStereotypes/DataElement\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Data Element&lt;/a&gt; (required)
     * @return lookupPapersFromAuthor successful execution (status code 200)
     * @see PaperArchiveFacadeApi#lookupPapersFromAuthor
     */
    default ResponseEntity<List<PaperItemDTO>> lookupPapersFromAuthor(String author) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"venue\" : \"venue\", \"paperItemId\" : { \"doi\" : \"doi\" }, \"title\" : \"title\", \"authors\" : \"authors\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
