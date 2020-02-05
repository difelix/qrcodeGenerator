package com.difelix.qrcodeGenerator.localGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConteudoQrcode {
	
	private String texto;
	private ExtensaoImagem extensaoImagem;
	private int width;
	private int height;
}
