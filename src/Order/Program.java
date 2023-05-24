package Order;

public class Program {

    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        SaveAsJson saveAsJson = new SaveAsJson();
        saveAsJson.saveTheOrder(order);
        SaveAsXml saveAsXml = new SaveAsXml();
        saveAsXml.saveTheOrder(order);

    }

}