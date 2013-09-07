package Reika.ReactorCraft.Registry;

import java.util.Random;

import Reika.DragonAPI.Libraries.Java.ReikaStringParser;

public enum FluoriteTypes {

	BLUE(0, 38, 255),
	PINK(255, 255, 236),
	ORANGE(255, 155, 0),
	MAGENTA(178, 0, 255),
	GREEN(0, 188, 18),
	RED(255, 50, 50),
	WHITE(1024, 1024, 1024), //to ensure pure white
	YELLOW(255, 216, 0);

	public final int red;
	public final int green;
	public final int blue;

	public static final FluoriteTypes[] colorList = values();

	private FluoriteTypes(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}

	public String getOreTextureName() {
		return "ReactorCraft:fluorite_"+this.getColorName();
	}

	public String getBlockTextureName() {
		return "ReactorCraft:floblock_"+this.getColorName();
	}

	public String getColorName() {
		return this.name().toLowerCase();
	}

	public static FluoriteTypes getRandomColor() {
		Random r = new Random();
		int c = colorList.length;
		return colorList[r.nextInt(c)];
	}

	public String getBlockName() {
		return ReikaStringParser.capFirstChar(this.name())+" Fluorite Block";
	}

	public String getOreName() {
		return ReikaStringParser.capFirstChar(this.name())+" Fluorite Ore";
	}

	public String getItemName() {
		return ReikaStringParser.capFirstChar(this.name())+" Fluorite";
	}

}
