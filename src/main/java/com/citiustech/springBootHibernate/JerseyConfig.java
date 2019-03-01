package com.citiustech.springBootHibernate;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig()
    {    
		//register(MyResource.class);
        packages("com.citiustech.springBootHibernate");
    }
}
