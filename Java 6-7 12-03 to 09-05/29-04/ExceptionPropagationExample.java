// repository
class PaymentRepository {
    String getPaymentDetails(String paymentId) {
        // handled NumberFormatException
        try {
            int id = Integer.parseInt(paymentId);
            int rem = 100 % id;
            if(id != 0) {
                return "Here is payment details for this id: " + id;
            }
            else {
                return "No payment details";
            }
        }
        catch(NumberFormatException e) {
            System.out.println("Not a valid paymentId: " + e.getMessage());
        }

        return "No details due to exception";
    }
}

// service
class PaymentService {
    PaymentRepository repo;

    PaymentService(PaymentRepository repo) {
        this.repo = repo;
    }

    String getDetailsFromRepo(String id) {
        // handled ArithmeticException here
        try {
            return repo.getPaymentDetails(id);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
        return "No details";
    }
}

class ExceptionPropagationExample {
    public static void main(String[] args) {
        // create repository
        PaymentRepository repo = new PaymentRepository();

        // payment service object
        PaymentService service = new PaymentService(repo);
        String details1 = service.getDetailsFromRepo("0");
        System.out.println(details1);

        // exception case
        String details2 = service.getDetailsFromRepo("8a");
        System.out.println(details2);

        String details3 = service.getDetailsFromRepo("64");
        System.out.println(details3);
    }
}