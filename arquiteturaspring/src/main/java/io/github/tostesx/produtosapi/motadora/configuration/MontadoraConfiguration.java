package io.github.tostesx.produtosapi.motadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.tostesx.produtosapi.motadora.Motor;
import io.github.tostesx.produtosapi.motadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {

    @Bean
    Motor motor() {
		var motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("XPTO-0");
		motor.setLitragem(2.0);
		motor.setTipo(TipoMotor.ASPIRADO);
		return motor;
	}
}
