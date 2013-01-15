package ws.data;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/mongo.xml")
public class TestMongoRepo {
	@Autowired
	UserRepository repository;
	
	@Before
	public void create() {
		System.err.println(repository);
		User user = new User();
		LoginPassword credentials = new LoginPassword();
		credentials.setLogin("test");
		credentials.setPassword("test");
		user.setCredentials(credentials);
		repository.save(user);
	}
	
	@Test
	public void find() {
		LoginPassword credentials = new LoginPassword();
		credentials.setLogin("test");
		credentials.setPassword("test");
		Assert.assertTrue("should not be empty", repository.findByCredentials(credentials).size()>0);
	}
	@Test
	public void findeq() {
		LoginPassword credentials = new LoginPassword();
		credentials.setLogin("test");
		credentials.setPassword("test");
		Assert.assertTrue("should not be empty", repository.findByCredentialsEquals(credentials).size()>0);
	}

}
