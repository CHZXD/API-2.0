package com.jkalango.webapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkalango.webapi.jogadores.DadosCadastroJogador;
import com.jkalango.webapi.jogadores.Jogador;
import com.jkalango.webapi.jogadores.JogadorRepository;


@RestController
@RequestMapping("/jogador")
public class JogadorController {
@Autowired
private JogadorRepository repository;

    //O qu é injeção de Dependência?

    @PostMapping
    public void cadastrar (@RequestBody DadosCadastroJogador dados){
        //System.out.println(dados);
        //Jogador j = new Jogador(dados);
        repository.save(new Jogador(dados));

    }
}
