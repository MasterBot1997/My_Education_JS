package houmWork.h6;

public class NoteBook {
    private String brand; // Имя ноутбука
    private String model; // Модель ноутбука
    private Integer sizeDisplay; // Размер дисплея
    private String cpuManufacturer; // Производитель процессора
    private Integer cpuModel; // Модель процессора
    private Integer memorySize; // объем памяти
    private String gpu;
    private Integer ram; // Оперативная память
    private String os;
    private String color;

    // Конструктор
    public NoteBook(String brand, String model,
            Integer sizeDisplay, String cpuManufacturer, Integer cpuModel, Integer memorySize,
            String gpu, Integer ram, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.sizeDisplay = sizeDisplay;
        this.cpuManufacturer = cpuManufacturer;
        this.cpuModel = cpuModel;
        this.memorySize = memorySize;
        this.gpu = gpu;
        this.ram = ram;
        this.os = os;
        this.color = color;

    }

    // Преобразование в строку для печати
    @Override
    public String toString() {
        return String.format("%s %s %d %s %d %d %s %d %s %s",
                brand, model, sizeDisplay, cpuManufacturer, cpuModel,
                memorySize, gpu, ram, os, color);
    }

    // Геттеры
    public String getbrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Integer getSizeDp() {
        return sizeDisplay;
    }
    public String getCpuMan() {
        return cpuManufacturer;
    }
    public Integer getCpuModel() {
        return cpuModel;
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
