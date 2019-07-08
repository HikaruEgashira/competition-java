public class hello {
    public static void main(String[] args) {
        switch (args.length) {
        case 0:
            System.out.println("Hello World.");
            break;
        case 1:
            System.out.println("Hello second World.");
            break;
        case 3:
            System.out.println("Hello 3D World.");
            break;
        default:
            System.err.println("Cannot find" + args.length + "D World...");
            break;
        }
    }
}