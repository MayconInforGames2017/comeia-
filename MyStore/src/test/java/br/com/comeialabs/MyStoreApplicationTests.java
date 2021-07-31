package br.com.comeialabs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.comeialabs.domain.Salesperson;
import br.com.comeialabs.repository.SalespersonRepository;

@SpringBootTest
class MyStoreApplicationTests {

	@Autowired
	private SalespersonRepository salespersonRepository;

	@Test
	void save() {
		Salesperson salesperson = new Salesperson();
		salesperson.setName("Maycon");

		Salesperson salesperson1 = new Salesperson();
		salesperson1.setName("Maycon");

		Salesperson salesperson2 = new Salesperson();
		salesperson2.setName("Maycon");

		Salesperson salesperson3 = new Salesperson();
		salesperson3.setName("Maycon");

		Salesperson salesperson4 = new Salesperson();
		salesperson4.setName("Maycon");

		Salesperson salesperson5 = new Salesperson();
		salesperson5.setName("Maycon");

		salespersonRepository.saveAll(
				Arrays.asList(salesperson, salesperson1, salesperson2, salesperson3, salesperson4, salesperson5));
	}

	@Test
	void list() {
		Optional<Salesperson> optSalesperson = salespersonRepository.findById(4);

		Salesperson salesperson = optSalesperson.orElseThrow(() -> new RuntimeException("Não encontrado"));
	}

	@Test
	void test() {
		List<Salesperson> salespersons = salespersonRepository.findAll();

		for (Salesperson salesperson : salespersons) {
			System.out.println(salesperson);
		}
	}

	@Test
	void excluir() {
		List<Salesperson> salespersons = salespersonRepository.findAll();
		
		salespersons.stream().filter(new Predicate<Salesperson>() {

			@Override
			public boolean test(Salesperson t) {
				if (t.getId() >= 6 ) {
					return false;
				}
				return true;
			}
		})
		.collect(Collectors.toList())
		.forEach(s -> System.out.println(s));
	}

}
