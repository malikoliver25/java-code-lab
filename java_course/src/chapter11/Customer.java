package chapter11;

public class Customer {

    public static void main(String[] args) {
        Product book = new Book();
        book.setName("The Great Gatsby");
        book.setPrice(10.99);
        book.setColor("Blue");

        System.out.println("Product Name: " + book.getName());
        System.out.println("Product Price: $" + book.getPrice());
        System.out.println("Product Color: " + book.getColor());
    }

}
