package EasyTask;

public class Car extends Vehicle {

    private String _brand;

    private String _model;

    private  double _speed;

    public double get_speed() {
        return _speed;
    }

    public double increaseSpeed(double speed){
        _speed+=speed;
        return _speed;
    }

    public double deacreseSpeed(double speed){
        _speed-=speed;
        return _speed;
    }

    public void set_speed(double _speed) {
        this._speed = _speed;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public String get_brand() {
        return _brand;
    }

    public void set_brand(String _brand) {
        this._brand = _brand;
    }

    @Override
    public void fuelType() {
        System.out.println("Car fuel");
    }
}
