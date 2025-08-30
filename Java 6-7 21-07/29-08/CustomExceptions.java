class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class NotValidBankAccountException extends Exception {
    NotValidBankAccountException(String msg) {
        super(msg);
    }
}
