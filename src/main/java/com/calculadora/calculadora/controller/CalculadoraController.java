package com.calculadora.calculadora.controller;
import com.calculadora.calculadora.model.Valores;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @PostMapping("/api/soma")
    public int somar(@RequestBody Valores valores) {
        return valores.getValor1() + valores.getValor2();
    }
}
