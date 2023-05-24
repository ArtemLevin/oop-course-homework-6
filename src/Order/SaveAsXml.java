package Order;

import java.io.FileWriter;
import java.io.IOException;

public class SaveAsXml  implements SaveInterface {
    @Override
    public void saveTheOrder(Order order) {
        String fileName = "order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<clientNam>:" + order.getClientName() + "</clientNam> \n");
            writer.write("<product>:" +order.getProduct()+"</product> \n");
            writer.write("<qnt>:"+order.getQnt()+"</qnt> \n");
            writer.write("<price>:"+order.getPrice()+"</price> \n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
