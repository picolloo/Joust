/* This file is part of the DualRpcServer libraries
   Copyright (c) 2004-2005, Vick Perry

   This library is free software; you can redistribute it and/or
   modify it under the terms of the BSD license. See the contents
   of the file LICENSE.txt for more details.
 */
package br.ufsc.inf.leobr.servidor;

import org.apache.log4j.Logger;

import com.retrogui.dualrpc.server.IServerCallbackHandler;

/**
 * Lost connection handler will terminate client if connection is broken. You
 * could also display a dialog to the user, etc.
 */
public class ConexaoPerdidaTratadorServidor implements IServerCallbackHandler {

	public ServerHandler serverHandler = null;

	public static Logger logger = Logger.getLogger(ConexaoPerdidaTratadorServidor.class
			.getName());

	public ConexaoPerdidaTratadorServidor(ServerHandler serverHandler ) {
		this.serverHandler = serverHandler;
	}

	/**
	 * M�todo de callback chamado quando a conex�o � perdida.
	 */
	public void brokenConnection() {

		logger.info("Conex�o com o cliente foi perdida. tratando...");
		serverHandler.tratarExcecaoConexaoPerdida();

	}

}
