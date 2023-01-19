package com.toannguyen.service1;

import com.toannguyen.service1.repositories.BookRepository;
import com.toannguyen.service1.models.entities.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class Service1Application {
	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
	@Bean
	CommandLineRunner clr(BookRepository repo) {
		return args -> repo.deleteAll()
				.thenMany(Flux.just(
						new Book("The Lord of the Rings: The Return of the King", "J.R.R. Tolkien"),
						new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling"),
						new Book("Star Wars: The Truce at Bakura", "Kathy Tyers"),
						new Book("The Phoenix Project", "Gene Kim/Kevin Behr/George Spafford")))
				.flatMap(repo::save)
				.log()
				.subscribe();
	}
}
