public class TrafficLight {

    enum Light {
        RED,
        YELLOW, 
        GREEN
    }

    public static void main(String[] args) {
        // Iterate through the enum values using an enhanced for loop

        //Enhanced for loop for enum ( (Enum Name) (nickname ) : (Enum name.values) ) 
        for (Light light : Light.values()) {
            System.out.println(light);
    }
}

    public char[] getLight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLight'");
    }

    public void next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }
}
