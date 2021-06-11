package com.app;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@EntityScan(basePackages = {"com.app.test"})
public class BeDacnpmApplication implements CommandLineRunner {
	@Autowired
	private EntityManager em;
//	@Autowired
//	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BeDacnpmApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		initCity(em);
//		User user = new User();
//		user.setFullname("Le Trung Nghia");
//		em.persist(user);

//		Optional<User> findById = repository.findUserWithAddressById(1L);
//		findById.ifPresent((user) -> {
//			City city = new City();
//			District district = new District();
//			Ward ward = new Ward();
//			city.setId(1L);
//			district.setId(1L);
//			ward.setId(1L);
//			user.addAddress(new Address(city, district, ward, ""));
//			repository.save(user);
//		});
		
//		User user = new User("Le Trung Nghia", "letrungnghia145", "17130132", "nghia1k45@gmail.com", "0868880758");
//		repository.save(user);

//		City city = new City();
//		District district = new District();
//		Ward ward = new Ward();
//		String detail = "details";
//		city.setId(1L);
//		district.setId(1L);
//		ward.setId(1L);
//		Address address = new Address(city, district, ward, detail);
//		repository.findUserWithAddressById(1L).ifPresent((user) -> {
//			user.addAddress(address);
//			repository.save(user);
//		});

	}

//	private void initCity(EntityManager em) {
//		List<City> cities = new ArrayList<>();
//		cities.add(new City("HCM", 1000L, 1000L));
//		cities.add(new City("BT", 1000L, 1000L));
//		cities.add(new City("TN", 1000L, 1000L));
//
//		for (City city : cities) {
//			em.persist(city);
//		}
//		List<District> districts = new ArrayList<>();
//		districts.add(new District("TD", 1000L, 1000L));
//		districts.add(new District("Q1", 1000L, 1000L));
//		districts.add(new District("Q2", 1000L, 1000L));
//
//		for (District district : districts) {
//			em.persist(district);
//		}
//		em.find(City.class, 1L).setDistricts(Set.copyOf(districts));
//
//		List<Ward> wards = new ArrayList<>();
//		wards.add(new Ward("LT", 1000L, 1000L));
//		wards.add(new Ward("LD", 1000L, 1000L));
//		wards.add(new Ward("HBC", 1000L, 1000L));
//
//		for (Ward ward : wards) {
//			em.persist(ward);
//		}
//
//		em.find(District.class, 1L).setWards(Set.copyOf(wards));
//
//	}
}
