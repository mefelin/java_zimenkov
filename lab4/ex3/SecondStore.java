package lab4.ex3;

import java.util.*;

enum Catalog {
    ELECTRONICS, CLOTHING, BOOKS
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    public String getUsername() {
        return username;
    }
}

class OnlineStore {
    private Map<Catalog, List<Product>> catalog;
    private List<User> users;

    public OnlineStore() {
        catalog = new HashMap<>();
        users = new ArrayList<>();
        initializeCatalog();
    }

    private void initializeCatalog() {
        catalog.put(Catalog.ELECTRONICS, Arrays.asList(
                new Product("Laptop", 999.99),
                new Product("Smartphone", 499.99)
        ));
        catalog.put(Catalog.CLOTHING, Arrays.asList(
                new Product("T-Shirt", 19.99),
                new Product("Jeans", 39.99)
        ));
        catalog.put(Catalog.BOOKS, Arrays.asList(
                new Product("Java Programming", 29.99),
                new Product("Design Patterns", 24.99)
        ));
    }

    public void registerUser(String username, String password) {
        users.add(new User(username, password));
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.authenticate(password) && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void displayCatalog() {
        System.out.println("Catalog:");
        for (Catalog category : Catalog.values()) {
            System.out.println(category);
        }
    }

    public void displayProductsInCatalog(Catalog category) {
        List<Product> products = catalog.get(category);
        if (products != null) {
            System.out.println("Products in " + category + " catalog:");
            for (Product product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("Catalog not found.");
        }
    }
}

public class SecondStore {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        store.registerUser("ms", "123");
        store.registerUser("md", "456");

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Main Menu:");
            System.out.println("1. Login");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter your username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter your password: ");
                        String password = scanner.nextLine();
                        User currentUser = store.authenticateUser(username, password);
                        if (currentUser != null) {
                            System.out.println("Authentication successful.");
                            store.displayCatalog();

                            System.out.print("Enter the catalog you want to view (or 0 to exit): ");
                            String catalogInput = scanner.nextLine();
                            if (catalogInput.equals("0")) {
                                choice = 0;
                                break;
                            }
                            try {
                                Catalog selectedCatalog = Catalog.valueOf(catalogInput.toUpperCase());
                                store.displayProductsInCatalog(selectedCatalog);
                            } catch (IllegalArgumentException e) {
                                System.out.println("Invalid catalog selection.");
                            }
                        } else {
                            System.out.println("Authentication failed. Please check your username and password.");
                        }
                    }
                    case 0 -> System.out.println("Exiting the program.");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
