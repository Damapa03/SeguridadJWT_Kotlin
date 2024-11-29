package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/secretos_extra_confidenciales")
class SecretosExtraConfidencialesController {

    @PostMapping("/ficha1")
    fun getFichaUno (): String {
        return "Secreto de estado crack"
    }

    @GetMapping("/ficha2")
    fun getFichaDos (): String {
        return "No Secreto de estado crack"
    }


}