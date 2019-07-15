package com.ecommerce.carrinho.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Documentação de teste")
public class TestSwagger {

    @ApiOperation(value = "Exemplo para teste da API")
    @GetMapping(value = "/teste", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String get() {
        return "teste";
    }
}
