public class InvalidReading extends Exception {

    public InvalidReading(Double value) {
        super("InvalidReading = " + value);
    }

}
