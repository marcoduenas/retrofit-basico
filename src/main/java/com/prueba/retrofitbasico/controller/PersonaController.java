package com.prueba.retrofitbasico.controller;

import java.util.List;

import com.prueba.retrofitbasico.interfaces.IServicePersonas;
import com.prueba.retrofitbasico.model.Persona;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PersonaController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String urlBaseDelServicio = "https://androidtutorials.herokuapp.com/";

		Retrofit retrofit = new Retrofit.Builder().baseUrl(urlBaseDelServicio)
				.addConverterFactory(GsonConverterFactory.create()).build();

		IServicePersonas service = retrofit.create(IServicePersonas.class);

		Call<List<Persona>> respuesta = service.obtenerListaPersonaFromURL();

		respuesta.enqueue(new Callback<List<Persona>>() {

			@Override
			public void onResponse(Call<List<Persona>> call, Response<List<Persona>> response) {
				// TODO Auto-generated method stub

				if (!response.isSuccessful()) {
					System.out.println("Ocurrió un error" + response.code());
					return;
				}

				List<Persona> listaPersona = response.body();
				
				for (Persona persona: listaPersona) {
					System.out.println("nombre: " + persona.getName());
				}
				
			}

			@Override
			public void onFailure(Call<List<Persona>> call, Throwable t) {
				// TODO Auto-generated method stub
				System.out.println("Ocurrió un error fatal" + t.getMessage());
			}

		});

	}

}
