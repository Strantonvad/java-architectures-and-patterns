package Decorator;

public class Main {
    public static void main(String[] args) {
        String inputData = "Name,Id\nIvan Ivanov,100\nPeter Sidorov,103";
        DataSourceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(
                new FileDataSource("pattern/out/Output.txt")));
        encoded.writeData(inputData);
        DataSource plain = new FileDataSource("pattern/out/Output.txt");

        System.out.println("Input ----------------");
        System.out.println(inputData);
        System.out.println("Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("Decoded --------------");
        System.out.println(encoded.readData());
    }
}
