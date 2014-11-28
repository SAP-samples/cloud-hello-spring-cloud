package helloworld;

import javax.sql.DataSource;

import org.springframework.cloud.CloudException;
import org.springframework.cloud.app.ApplicationInstanceInfo;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ServiceScan
@Profile("cloud")
public class CloudConfig extends AbstractCloudConfig
{
	@Bean()
	public ApplicationInstanceInfo applicationInfo()
	{
		return cloud().getApplicationInstanceInfo();
	}

	@Bean
	public DataSource dataSource()
	{
		DataSource retVal = null;
		
		try
		{
			return connectionFactory().dataSource();
		}
		catch (CloudException ex)
		{
			ex.printStackTrace();
		}
		
		return retVal;	
	}
}
