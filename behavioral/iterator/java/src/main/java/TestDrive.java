public class TestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(
                DinerMenu.getInstance(),
                PancakeHouseMenu.getInstance(),
                new CafeMenu()
        );
        waitress.printMenu();
    }
}
