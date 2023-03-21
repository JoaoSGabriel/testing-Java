public class App {
    public static void main(String[] args) {
        App p = new App();
        int number = (int) Math.floor(Math.random() * 10);
        p.seeMultiple(number);
    }

    void seeMultiple(int number) {
        String text = "Tabela de multiplicação de " + number;
        System.out.println(text);

        for(int i = 0; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}
