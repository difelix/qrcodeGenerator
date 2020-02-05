package com.difelix.qrcodeGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.difelix.qrcodeGenerator.localGenerator.ConteudoQrcode;
import com.difelix.qrcodeGenerator.localGenerator.ExtensaoImagem;
import com.difelix.qrcodeGenerator.localGenerator.GeradorQrcode;

@SpringBootApplication
public class QrcodeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrcodeGeneratorApplication.class, args);
		
		ConteudoQrcode conteudoQrcode = ConteudoQrcode.builder()
				.texto("Isso é um qrcode desenvolvido por difelix")
				.extensaoImagem(ExtensaoImagem.PNG)
				.width(300)
				.height(300)
				.build();
		
		GeradorQrcode.gerarQrcode(conteudoQrcode);
	}

}
