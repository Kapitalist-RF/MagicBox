public class Main {

    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<String>(5);
        MagicBox<Number> numberMagicBox = new MagicBox<>(5);
        String str = "Name";
        for (int i = 0; i <= stringMagicBox.sizeItems(); i++) {
            try {
                System.out.println(stringMagicBox.add(str + i));
                System.out.println(stringMagicBox.pick());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(numberMagicBox.add(3.5));
        System.out.println(numberMagicBox.add(8.5));
        System.out.println(numberMagicBox.add(5));
        System.out.println(numberMagicBox.add(3));
        System.out.println(numberMagicBox.add(0.15));
        System.out.println(numberMagicBox.pick());


    }

}
