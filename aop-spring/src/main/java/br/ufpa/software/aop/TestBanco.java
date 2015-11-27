package br.ufpa.software.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gilson on 26/11/15.
 */
public class TestBanco {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Banco banco = context.getBean(Banco.class);

        System.out.println("Depositando 2 reais");
        banco.depositar(2D);
        System.out.println("Depositando -2 reais");
        banco.depositar(-2D);
    }
}