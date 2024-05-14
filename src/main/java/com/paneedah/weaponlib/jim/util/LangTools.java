package com.paneedah.weaponlib.jim.util;

import net.minecraft.client.resources.I18n;

public class LangTools {
	/**
     * Formats an unlocalized name into a localized name.
     *
     * @param unlocName The unlocalized name to be formatted.
     * @return The formatted localized name.
     */
	public static String formatName(String unlocName) {
		return I18n.format(unlocName + ".name");
	}
}
