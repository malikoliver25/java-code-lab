package chapter11;

public class Book implements Product {

    private double price;
    private String name;
    private String color;
    private String author;
    private int pageCount;
    private String publisher;

    public int getPageCount() {
        return pageCount;
    }

    public String getPublisher() {
        return publisher;
    }


    public String getAuthor() {
        return author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

}
