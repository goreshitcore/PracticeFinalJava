public class BoardingApp {

    enum Membership {
        GOLD(500),SILVER(300),BRONZE(150),NONE(0);
        private int fee;

        private Membership(int fee) {
            this.fee = fee;

        }

             // Getter
    public int getFee() {
        return fee;
        }
    
        public void setFee(int fee) {
        this.fee = fee;
      }
    }

    
    public static void main (String[] args) {
        for ( Membership m : Membership.values()) {
            System.out.println(m.getFee());
        }
    }
}