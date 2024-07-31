package app;

import app.controller.AdminController;

public class App {

	public static void main(String[] args) {
		AdminController controller = new AdminController();
		try {
		controller.createVeterinarian();}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
