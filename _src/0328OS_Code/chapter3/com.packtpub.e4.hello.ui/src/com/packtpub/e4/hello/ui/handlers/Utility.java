/*
 * Copyright (c) 2013, Alex Blewitt, Bandlem Ltd
 * Copyright (c) 2013, Packt Publishing Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.packtpub.e4.hello.ui.handlers;

public class Utility {
	public static boolean breakpoint(String msg, Object... args) {
		return breakpoint(true,msg,args);
	}
	public static boolean breakpoint(boolean stop, String msg, Object... args) {
		if (args.length == 0) {
			System.out.println(msg);
		} else {
			System.out.println(String.format(msg, args));
		}
		return stop;
	}
}
