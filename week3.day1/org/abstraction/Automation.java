package org.abstraction;

public class Automation extends MultipleLangauge implements TestTool, Language {

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby is a language programming");
	}

	public static void main(String[] args) {

		Automation at = new Automation();

		at.python();
		at.ruby();
		at.Java();
		at.Selenium();
	}

	public void Java() {
		// TODO Auto-generated method stub

		System.out.println("Java is a language programming");

	}

	public void Selenium() {
		// TODO Auto-generated method stub

		System.out.println("Selenium is a Webdriver");

	}

}
