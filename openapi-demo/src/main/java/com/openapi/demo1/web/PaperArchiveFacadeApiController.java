package com.openapi.demo1.web;

import com.openapi.demo1.dto.ConvertToMarkdownForWebsite200Response;
import com.openapi.demo1.dto.CreatePaperItemParameter;
import com.openapi.demo1.dto.PaperItemDTO;
import com.openapi.demo1.dto.PaperItemKey;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:56:40.073353400+07:00[Asia/Bangkok]")
@Controller
public class PaperArchiveFacadeApiController implements PaperArchiveFacadeApi {

    private final PaperArchiveFacadeApiDelegate delegate;

    public PaperArchiveFacadeApiController(@Autowired(required = false) PaperArchiveFacadeApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PaperArchiveFacadeApiDelegate() {});
    }

    @Override
    public PaperArchiveFacadeApiDelegate getDelegate() {
        return delegate;
    }

}
