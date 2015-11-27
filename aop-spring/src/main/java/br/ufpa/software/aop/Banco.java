package br.ufpa.software.aop;

import org.springframework.stereotype.Component;

/**
 * Created by gilson on 26/11/15.
 */
@Component
public class Banco {

    public void depositar(Double valor) {
        if (valor < 0) {
            throw new RuntimeException("Valor inválido.");
        }
    }
}
