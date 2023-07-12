package domain.enums;

public enum ClientType {
    TEAR1 (0.10){
        @Override
        public String printMessage() {
            return "Tear1";
        }
    },
    TEAR2(0.15){
            @Override
            public String printMessage() {
                return "Tear2";
            }

    },
    TEAR3(0.20){
        @Override
        public String printMessage() {
            return "Tear3";
        }
    }
    ;
    private double discount;
    ClientType (double discount) {
        this.discount = discount;
    }
    public abstract String printMessage();
    public double getDiscount () {
        return discount;
    }

}
