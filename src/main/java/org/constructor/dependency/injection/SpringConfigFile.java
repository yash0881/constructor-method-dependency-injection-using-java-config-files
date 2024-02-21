package org.constructor.dependency.injection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddressObj(){
         Address ad = new Address(900, "Pune", 234567);
         return ad;
    }


    @Bean
    public Student createStudentObj(){
        Student st = new Student("Yash", 890, createAddressObj());
        return st;
    }

}
