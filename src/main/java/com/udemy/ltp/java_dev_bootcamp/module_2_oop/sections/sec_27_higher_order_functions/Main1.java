package main.java.com.udemy.ltp.java_dev_bootcamp.module_2_oop.sections.sec_27_higher_order_functions;

import java.util.Arrays;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		List<String> facts = Arrays.asList(
			"Marie Curie was the first woman to win a Nobel Prize.",
			"She received the Nobel Prize in Physics in 1903, and the Nobel Prize in Chemistry in 1911.",
			"Curie was a pioneer in the field of radioactivity, and her work led to the development of X-ray technology.",
			"She was the first woman to become a professor at the Sorbonne, and the first woman to be entombed on her own merits in the Panthéon.",
			"Curie died at the age of 66 from complications related to her prolonged exposure to radiation.",
			"She is remembered as one of the most influential scientists in history.",
			"Her legacy lives on through the Marie Curie Cancer Care charity, which provides care and support to people with terminal illnesses.",
			"Curie's contributions to science and medicine have been recognized and celebrated worldwide."
		);

		/*
			- Functional interface: Consumer
			- Lambda expression: receives a parameter & produces a side-effect
			- Example: x -> {code}
		*/
		facts.forEach(fact -> System.out.println(fact));
	}
}
