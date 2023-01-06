package com.masai.singleton;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		DatabaseConnector dbc1 = DatabaseConnector.createInstance("jdbc:mysql://localhost:3306/springbootcrudapp", "root", "Mummy@123");
        System.out.println("dbc1= " + dbc1);
        DatabaseConnector dbc2 = DatabaseConnector.getInstance();
        System.out.println("dbc2= " + dbc2);
        DatabaseConnector dbc3 = DatabaseConnector.createInstance("jdbc:mysql://localhost:3306/test3", "root", "Mummy@123");
		System.out.println("dbc3= " + dbc3);

		//Using Enum
		DatabaseConnectorEnum dbce1 = DatabaseConnectorEnum.createInstance("jdbc:mysql://localhost:3306/springbootcrudapp", "root", "Mummy@123");
		DatabaseConnectorEnum dbce2 = DatabaseConnectorEnum.INSTANCE;
		System.out.println("dbce1= " + dbce1);
		System.out.println("dbce2= " + dbce2);
        
	}

}
