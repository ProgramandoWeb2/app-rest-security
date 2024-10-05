package pe.edu.cibertec.app_rest_security.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("hasRole('ADMIN')")
@RestController
@RequestMapping("api/v1/test")
public class TestController {


    @GetMapping
    public ResponseEntity<String> testApiRest(){
        return new ResponseEntity<>("API Autorizada", HttpStatus.OK);
    }
}
