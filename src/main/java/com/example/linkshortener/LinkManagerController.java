package com.example.linkshortener;

import com.example.linkshortener.link.LinkService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@AllArgsConstructor
@RequestMapping("/links")
class LinkManagerController {
    private final static Logger LOG = Logger.getLogger(LinkManagerController.class.getName());

    private final LinkService linkService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<?> createLink(@RequestBody CreateLinkDto link) {
       try{
           return ResponseEntity.created(null).body(linkService.createLink(link.toDto()));

       }catch (LinkAlreadyExistException e) {
           LOG.info(e.getMessage());
           return ResponseEntity.badRequest().body(new ExceptionResponse(e.getMessage()));
       }

    }

}
