package com.masai.singleton;

public enum DatabaseConnectorEnum {
	INSTANCE;
	
	private String URL;
    private String userName;
    private String password;

    
    public static DatabaseConnectorEnum createInstance(String URL, String userName, String password) {
        INSTANCE.URL = URL;
        INSTANCE.userName = userName;
        INSTANCE.password = password;
        return INSTANCE;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
