public class Order {

    
        public enum Status
        {
            ready,out,received,complete;	
        }
    
        private Status status;
        
        public Status getStatus()
        {
            return this.status;
        }
    
    
        public void next() {
            switch (status) {
                case ready:
                    status = Status.out; // Transition from ready to out
                    break;
                case out:
                    status = Status.received; // Transition from out to received
                    break;
                case received:
                    status = Status.complete; // Transition from received to complete
                    break;
                case complete:
                    // Status remains complete; no transition
                    break;
            }
        }
    
        public Order()
        {
            this.status = Status.ready;
        }
    
    
    
}
