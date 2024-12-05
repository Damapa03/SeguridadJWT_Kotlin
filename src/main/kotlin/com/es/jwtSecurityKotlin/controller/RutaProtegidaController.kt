package com.es.jwtSecurityKotlin.controller

import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rutas_protegidas")
class RutaProtegidaController {


    @GetMapping("/recurso1")
    fun getRecursoProtegidoUno () : String {
        return "Este recurso sólo puede ser accedido por usuarios registrados en la BDD \uD83E\uDD75"
    }

    @PostMapping("/recurso2")
    fun getRecursoProtegidoDos () : String {
        return "Este recurso sólo puede ser accedido por usuarios registrados en la BDD ☆*: .｡. o(≧▽≦)o .｡.:*☆"
    }

    @GetMapping("/usuairo_autenticado")
    fun saludarUsuarioAutenticado(authentication: Authentication): String{

        // Objetivo es saludar al usuario autenticado
       val userName =  authentication.name

        return "HAil" + userName
    }
}