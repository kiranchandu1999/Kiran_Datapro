class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class NotValidAccountException extends Exception {
    NotValidAccountException(String s) {
        super(s);
    }
}
