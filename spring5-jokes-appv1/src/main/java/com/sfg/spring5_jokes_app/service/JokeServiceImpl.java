package com.sfg.spring5_jokes_app.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokesService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
