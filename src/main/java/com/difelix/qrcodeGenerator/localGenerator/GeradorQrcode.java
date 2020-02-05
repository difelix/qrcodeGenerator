package com.difelix.qrcodeGenerator.localGenerator;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class GeradorQrcode {

	private static final String CAMINHO_SALVAR_IMAGEM_QRCODE = "./qrcodeGerado.";
	
	/**
	 * Método que gera qrcode de um texto qualquer
	 * @param conteudoQrcode
	 */
	public static void gerarQrcode(ConteudoQrcode conteudoQrcode) {
		try {
			QRCodeWriter qrCodeWriter = new QRCodeWriter();
			BitMatrix bitMatrix = qrCodeWriter.encode(conteudoQrcode.getTexto(),
					BarcodeFormat.QR_CODE, conteudoQrcode.getWidth(),
					conteudoQrcode.getHeight());
			
			Path path = FileSystems.getDefault().getPath(CAMINHO_SALVAR_IMAGEM_QRCODE.
					concat(conteudoQrcode.getExtensaoImagem().name().toLowerCase()));
			MatrixToImageWriter.writeToPath(bitMatrix,
					conteudoQrcode.getExtensaoImagem().name(), path.toFile());		
		} catch (WriterException | IOException e) {
			System.out.println("Erro na geração do qrcode:" + e.getMessage());
		}				
	}
}
