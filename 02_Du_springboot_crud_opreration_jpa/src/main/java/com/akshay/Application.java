package com.akshay;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.akshay.enitity.User;
import com.akshay.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	 
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		 UserRepository  userRepository =	context.getBean(UserRepository.class);
		 
					
			//		 user.setName("Shubahm Sharma");
			//		  user.setCity("delhi");
			//		  
			//		   User user1 =userRepository.save(user); 
			////		   System.out.println(user1);
			//		 User user= new User();
			//		 user.setName("Yogesh college");
			//		 user.setCity("Mumbai");
			//		
			//		 User user1= new User();
			//		 user1.setName("Mohit School");
			//		 user1.setCity("jaipur");
			//		
			//		 User user2= new User();
			//		 user2.setName("Ritik Sharma");
			//		 user2.setCity("delhi");
			//		 
			//		 User user3= new User();
			//		 user3.setName("Abhishek  yogi");
			//		 user3.setCity("jhujhnu");
			//		 
			////		User resultUser= userRepository.save(user1);  //saving single user only 
			//		 
			//		 
			//		List<User> users= List.of(user,user1,user2,user3);
			//		 userRepository.saveAll(users);
			//	    System.out.println("saved user"+ users);
			//	    System.out.println("done ");
							 
				 
				 // update the user 355   FIND BY ID 
		//		Optional<User> optional=userRepository.findById(404);
		//	  User  user=	optional.get( );
		//	  System.out.println(user);
		//	  
		//	  user.setName("Ankit tiwari");
		//	  user.setCity("bangloor");
		//	User result=	 userRepository.save(user);
		//	System.out.println(result);
	
	
		 
		 // HOW TO GET DATA
//		 
//		  Iterable< User> itr =    userRepository.findAll();
//				itr.forEach(new Consumer<User>() {
//
//					@Override
//					public void accept(User t) {
//						// TODO Auto-generated method stub
//						System.out.println(t);
//						
//					}
//				});
//	
//		 Iterable< User> itr =    userRepository.findAll();
//		 itr.forEach(user->System.out.println(user));
//	
	
		 
		 //Deleting user Element
    
		 userRepository.deleteById(102);
		 System.out.println("deleted user");
		 
	
	}

}
 