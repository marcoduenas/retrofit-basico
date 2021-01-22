package com.prueba.retrofitbasico.interfaces;

import java.util.List;

import com.prueba.retrofitbasico.model.Persona;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IServicePersonas {

	
	@GET("usersFake")
	Call<List<Persona>> obtenerListaPersonaFromURL();
	
}
