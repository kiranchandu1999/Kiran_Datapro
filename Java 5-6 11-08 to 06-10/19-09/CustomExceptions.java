// unchecked exception
class InvalidAccountException extends RuntimeException {
    InvalidAccountException(String msg) {
        super(msg);
    }
}

// checked exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}