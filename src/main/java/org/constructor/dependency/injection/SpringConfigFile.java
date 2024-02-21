package org.constructor.dependency.injection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddressObj(){
         Address ad = new Address();
         ad.setCity("Pune");
         ad.setHno(900);
         ad.setPincode(9000282);
         return ad;
    }


    @Bean
    public Student createStudentObj(){
        Student st = new Student();
        st.setAddress(createAddressObj());
        st.setName("Vishal");
        st.setRoll(20020);
        return st;
    }

}
