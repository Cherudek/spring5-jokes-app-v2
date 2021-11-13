package com.gm.chuckjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChuckjokesApplication {

	private static final String WELCOME_MESSAGE = " /$$$$$$  /$$                           /$$             /$$   /$$                               /$$          \n" +
			" /$$__  $$| $$                          | $$            | $$$ | $$                              |__/          \n" +
			"| $$  \\__/| $$$$$$$  /$$   /$$  /$$$$$$$| $$   /$$      | $$$$| $$  /$$$$$$   /$$$$$$   /$$$$$$  /$$  /$$$$$$$\n" +
			"| $$      | $$__  $$| $$  | $$ /$$_____/| $$  /$$/      | $$ $$ $$ /$$__  $$ /$$__  $$ /$$__  $$| $$ /$$_____/\n" +
			"| $$      | $$  \\ $$| $$  | $$| $$      | $$$$$$/       | $$  $$$$| $$  \\ $$| $$  \\__/| $$  \\__/| $$|  $$$$$$ \n" +
			"| $$    $$| $$  | $$| $$  | $$| $$      | $$_  $$       | $$\\  $$$| $$  | $$| $$      | $$      | $$ \\____  $$\n" +
			"|  $$$$$$/| $$  | $$|  $$$$$$/|  $$$$$$$| $$ \\  $$      | $$ \\  $$|  $$$$$$/| $$      | $$      | $$ /$$$$$$$/\n" +
			" \\______/ |__/  |__/ \\______/  \\_______/|__/  \\__/      |__/  \\__/ \\______/ |__/      |__/      |__/|_______/ \n" +
			"                                                                                                              ";

	public static void main(String[] args) {
		System.out.println(WELCOME_MESSAGE);
		SpringApplication.run(ChuckjokesApplication.class, args);
	}

}
