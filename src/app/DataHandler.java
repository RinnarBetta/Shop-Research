package app;

// Оброблення вхідних даних різного типу
public class DataHandler {
    // Узагальнений нестатичний метод, який має параметр
    // як масив узагальненого типу та повертає String значення
    // обробленого масиву
    public String handleData(String[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // Цикл обробки масиву узагальненого типу
        for (String item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }
        return sb.toString();
    }
    public String handleData(Double[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // Цикл обробки масиву узагальненого типу
        for (Double item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }
        return sb.toString();
    }
}