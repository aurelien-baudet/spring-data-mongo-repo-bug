package ws.data;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	public String id;
	
	private ICredentials credentials;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ICredentials getCredentials() {
		return credentials;
	}

	public void setCredentials(ICredentials credentials) {
		this.credentials = credentials;
	}
}
