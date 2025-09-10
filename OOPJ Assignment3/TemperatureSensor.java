import java.util.Scanner;

class TemperatureSensor {
    private int temperature;

    public void setTemperature(int t) {
        if (t >= 0 && t <= 100) {
            this.temperature = t;
        } else {
            System.out.println("Temperature out of range");
        }
    }

    public int getTemperature() {
        return temperature;
    }
}

 class 	Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureSensor sensor = new TemperatureSensor();

        int t = sc.nextInt();
        sensor.setTemperature(t);

        if (t >= 0 && t <= 100) {
            System.out.println("Temperature = " + sensor.getTemperature());
        }
    }
}

