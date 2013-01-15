1) Send post request on url <http://localhost:8080/test-mongo-repo/user> with the raw content below in order to create a new user:

		{
		"credentials":{
		"@class":"ws.data.LoginPassword",
		"login":"test",
		"password":"test"
		}
		}

	=> it creates the user in mongo db



2) Then send post request on url <http://localhost:8080/test-mongo-repo/find> with the raw content below in order to list users:

		{
		"@class":"ws.data.LoginPassword",
		"login":"test",
		"password":"test"
		}

	=> the list is empty

3) You can also try to send post request on url <http://localhost:8080/test-mongo-repo/findeq> with the raw content below in order to list users:

		{
		"@class":"ws.data.LoginPassword",
		"login":"test",
		"password":"test"
		}

	=> the list is empty
