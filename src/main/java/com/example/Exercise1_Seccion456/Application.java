package com.example.Exercise1_Seccion456;

import com.example.Exercise1_Seccion456.entities.Laptop;
import com.example.Exercise1_Seccion456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"Asus","Vivabook",12,3500000.4);
		Laptop laptop2 = new Laptop(null,"Xiaomi","Performace",4,800000.4);
		Laptop laptop3 = new Laptop(null,"Asus","Vivabook",8,3000000.4);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);


	}

}
