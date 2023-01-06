package com.masai.singleton;

import java.io.Serializable;

public class DatabaseConnector implements Serializable{
	private static volatile DatabaseConnector instance;

	private String URL;
    private String UserName;
    private String Password;
    
    private DatabaseConnector() {}
    
    public static DatabaseConnector getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnector.class) {
                if (instance == null) {
                    instance = new DatabaseConnector();
                }
            }
        }
        return instance;
    }
    
    public static DatabaseConnector createInstance(String URL, String userName, String password) {
        if (instance == null) {
            synchronized (DatabaseConnector.class) {
                if (instance == null) {
                    instance = new DatabaseConnector();
                    instance.URL = URL;
                    instance.UserName = userName;
                    instance.Password = password;
                }
            }
        }
        return instance;
    }

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, ClassNotFoundException {
        throw new java.io.IOException("Cannot be serialized");
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        throw new java.io.IOException("cannot be serialized");
    }
}
    
    
