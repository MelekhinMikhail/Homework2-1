public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = (brand.isEmpty() || brand.equals(" ") || brand == null) ? "default" : brand;
        this.model = (model.isEmpty() || model.equals(" ") || model == null) ? "default" : model;
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
        this.color = (color.isEmpty() || color.equals(" ") || color == null) ? "белый" : color;
        this.productionYear = (productionYear <= 0) ? 2000 : productionYear;
        this.productionCountry = (productionCountry.isEmpty() || productionCountry.equals(" ") || productionCountry == null) ? "default" : productionCountry;
    }

    public void info() {
        System.out.println("Марка: "+this.getBrand()+"; "+
                           "Модель: "+this.getModel()+"; "+
                           "Объем двигателя: "+this.getEngineVolume()+" л; "+
                           "Цвет: "+this.getColor()+"; "+
                           "Год выпуска: "+this.getProductionYear()+"; "+
                           "Страна производства: "+this.getProductionCountry());
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }
}
