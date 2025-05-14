class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class NotValidAccountException extends Exception {
    NotValidAccountException(String msg) {
        super(msg);
    }
}
