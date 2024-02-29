public class ElectricBus extends Bus {

    private final double minimalTankFuullnessRate;
    public ElectricBus(double consumptionRate, double minimalTankFuullnessRate) {
        super(consumptionRate);
        this.minimalTankFuullnessRate = minimalTankFuullnessRate;
    }
}
