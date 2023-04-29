package houmWork.h6;

public class NoteBook {
    private String brand; // Имя ноутбука
    private String model; // Модель ноутбука
    private Integer sizeDisplay; // Размер дисплея
    private String cpu; // Производитель процессора
    private Integer memorySize; // объем памяти
    private String gpu;
    private Integer ram; // Оперативная память
    private String os;
    private String color;

    // Конструктор
    public NoteBook(String brand, String model,
            Integer sizeDisplay, String cpu, Integer memorySize,
            String gpu, Integer ram, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.sizeDisplay = sizeDisplay;
        this.cpu = cpu;
        this.memorySize = memorySize;
        this.gpu = gpu;
        this.ram = ram;
        this.os = os;
        this.color = color;

    }

    // Преобразование в строку для печати
    @Override
    public String toString() {
        return String.format("%s %s %d %s %d %s %d %s %s",
                brand, model, sizeDisplay, cpu,
                memorySize, gpu, ram, os, color);
    }

    // Геттеры
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Integer getSizeDp() {
        return sizeDisplay;
    }
    public String getCpu() {
        return cpu;
    }

    public Integer getMemorySize() {
        return memorySize;
    }
    public String getGpu() {
        return gpu;
    }
    public Integer getRam() {
        return ram;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }

}
