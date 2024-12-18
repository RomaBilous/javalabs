import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products; // Список товарів у кошику

    // Конструктор класу
    public Cart() {
        this.products = new ArrayList<>();
    }

    // Метод для додавання товару до кошика
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для видалення товару з кошика
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Метод для обчислення загальної вартості товарів у кошику
    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice(); // Викликаємо getPrice з класу Product
        }
        return total;
    }

    // Метод для виведення інформації про всі товари у кошику
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Кошик містить:\n");
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Загальна вартість: ").append(getTotalPrice());
        return sb.toString();
    }

    // Метод для отримання копії списку товарів
    public List<Product> getProducts() {
        return new ArrayList<>(products); // Повертаємо копію списку, щоб запобігти змінам ззовні
    }

    // Метод для очищення кошика
    public void clear() {
        products.clear(); // Очищення списку товарів у кошику
    }
}
