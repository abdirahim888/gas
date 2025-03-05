package main.module;
import user.UserService;
import Item.ItemService;
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ItemService itemService = new ItemService();
        userService.addUser("Alice", 25);
        userService.addUser("Bob", 30);
        itemService.addItem("Laptop", 999.99);
        itemService.addItem("Smartphone", 499.99);
        System.out.println("Users in the system:");
        userService.getUsers().forEach(System.out::println);
        System.out.println("\nAvailable items:");
        itemService.getItems().forEach(System.out::println);
    }
}

