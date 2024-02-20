package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight() {
        double height = (Math.random() * 50 + 150);
        height = Math.floor(height * 10) / 10;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight() {
        double weight = (Math.random() * 70 + 30);
        weight = Math.floor(weight * 10) / 10;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void createBmi() {
        double bmi = weight / (height / 100 * height / 100);
        this.bmi = bmi;
    }

    public double getBmi() {
        return this.bmi;
    }

    public void createBodyMass() {
        String bodyMass = "";
        if (bmi < 18.5) {
            bodyMass = "저체중";
        } else if (bmi < 23) {
            bodyMass = "정상";
        } else if (bmi < 25) {
            bodyMass = "위험체중";
        } else if (bmi < 30) {
            bodyMass = "1단계 비만";
        } else {
            bodyMass = "2단계 비만";
        }
        this.bodyMass = bodyMass;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

}
