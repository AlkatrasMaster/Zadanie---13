public class ElectricBus extends Bus {

    private final double minimalTankFuullnessRate;
    public ElectricBus(double consumptionRate, double minimalTankFuullnessRate) {
        super(consumptionRate);
        this.minimalTankFuullnessRate = minimalTankFuullnessRate;
    }

    @Override
    public int powerRevers() {
        double remainingRate = getTankFullnessRate() - minimalTankFuullnessRate;
        if (remainingRate <= 0) {
            return 0;
        }

        return (int) (remainingRate / getConsumptionRate());
    }
}
