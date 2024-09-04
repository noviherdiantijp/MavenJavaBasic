package assessment3;

//custom checked exception
class InvalidYearException extends Exception {
    public InvalidYearException(String message) {
        super(message);
    }
}