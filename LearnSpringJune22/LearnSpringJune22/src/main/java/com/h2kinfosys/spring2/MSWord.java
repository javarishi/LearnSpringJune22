package com.h2kinfosys.spring2;

public class MSWord {

	private String version;
	private SpellChecker spellChecker;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println(spellChecker.getLanguage());
		this.spellChecker = spellChecker;
	}
}
