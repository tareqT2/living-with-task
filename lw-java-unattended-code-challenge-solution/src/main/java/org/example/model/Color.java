package org.example.model;

public enum Color {
	
	RED("red"),
	BLUE("blue");

	private String _color;
	Color(String _color) {
		this._color = _color;
	}
	
	public String get_color() {
		return _color;
	}
}
