package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringContactsApplication{


	public static void main(String[] args) {
		SpringApplication.run(SpringContactsApplication.class, args);
	}
	}
//		
//		/*
//		 * ApplicationContext appContext = new
//		 * AnnotationConfigApplicationContext(BeanConfiguration.class);
//		 * 
//		 * Contact c = appContext.getBean("contact", Contact.class);
//		 * 
//		 * System.out.println(c.toString());
//		 */
//	}
//	
//	@Autowired
//	ContactRepository repo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		//Using an existing bean
//		Contact c = appContext.getBean("contact", Contact.class);
//		c.setRelationship("best friend");
//		repo.save(c);
//		
//		//Create a bean to use - not managed by Spring
//		Contact d = new Contact("Sandra Boyton", "555-555-5556", "friend");
//		Address a = new Address("987 Elm Court", "Altoona", "IA");
//		d.setAddress(a);
//		repo.save(d);
//		
//		List<Contact> allMyContacts = repo.findAll();
//		for(Contact people: allMyContacts) {
//			System.out.println(people.toString());
//		}
//		
//		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
//		((AbstractApplicationContext) appContext).close();
//	
//	}
//
//}
