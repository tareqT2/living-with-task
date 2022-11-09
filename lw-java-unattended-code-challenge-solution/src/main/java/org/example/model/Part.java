package org.example.model;

public enum Part {

	RED_BLOCK_SMALL(10, Color.RED.get_color()),
	RED_BLOCK_MEDIUM(20, Color.RED.get_color()),
	RED_BLOCK_LARGE(40, Color.RED.get_color()),
	
	BLUE_BLOCK_SMALL(10, Color.BLUE.get_color()),
	BLUE_BLOCK_MEDIUM(20, Color.BLUE.get_color()),
	BLUE_BLOCK_LARGE(40, Color.BLUE.get_color());
	
	private String _color;

	private double _weight;

	Part(double weight, String color) {

		this._color = color;
		this._weight = weight;
	}

	public double getWeight() {
		return _weight;
	}
}
