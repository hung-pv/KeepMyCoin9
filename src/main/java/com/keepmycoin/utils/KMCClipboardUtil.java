/*******************************************************************************
 * Copyright 2018 HungPV
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.keepmycoin.utils;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class KMCClipboardUtil {

	public static void setText(String text, String name) {
		if (text == null) {
			text = "";
		}
		try {
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text), null);
			if (text.equals("")) {
				System.out.println("Clipboard cleared");
			} else if (name == null)
				System.out.println("(Copied to clipboard)");
			else
				System.out.println(String.format("(%s was copied to clipboard)", name));
		} catch (Exception e) {
		}
	}

	public static void clear() {
		setText(null, null);
	}
}
