package com.graphql.platform;

import com.graphql.platform.entities.Artist;
import com.graphql.platform.repositories.AlbumRepository;
import com.graphql.platform.repositories.ArtistRepository;
import com.graphql.platform.repositories.SongRepository;
import com.graphql.platform.services.ArtifactoryService;
import graphql.schema.idl.RuntimeWiring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}
}
