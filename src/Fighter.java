public class Fighter {

    private int speed;
    private int height;
    private int rockets;
    private String engineVolume;  //Объем двигателя
    private String typeOfEngine;  //тип двигателя
    private String nameFighter;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRockets() {
        return rockets;
    }

    public void setRockets(int rockets) {
        this.rockets = rockets;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getNameFighter() {
        return nameFighter;
    }

    public void setNameFighter(String nameFighter) {
        this.nameFighter = nameFighter;
    }

    // взлет
    // пуск ракеты
    // посадка

    public void lunchRocket() {
            System.out.println(nameFighter + " - rocket launched");

    }

    public void flyUp(){
        System.out.println(nameFighter  + "fighter in the air ");
    }

    public void fighterDown(){
        System.out.println(nameFighter + " fighter coming down");
    }

    public static void main(String[] args) {
        Fighter cy15 = new Fighter();
        Fighter f14 = new Fighter();

        cy15.speed = 2;
        cy15.height = 3;
        cy15.rockets = 6;
        cy15.engineVolume = "--";
        cy15.typeOfEngine = "---";
        cy15.nameFighter = "Cy-15";

        f14.speed = 2;
        f14.height = 3;
        f14.rockets = 6;
        f14.engineVolume = "--";
        f14.typeOfEngine = "---";
        f14.nameFighter = "F-14";



        cy15.lunchRocket();
        f14.lunchRocket();
        f14.lunchRocket();
        f14.lunchRocket();
        f14.lunchRocket();
        f14.lunchRocket();
        f14.lunchRocket();
        f14.lunchRocket();

    }


   /* public Fighter(int speed, int height, int rockets, String engineVolume, String typeOfEngine, String nameFighter) {
        this.speed = speed;
        this.height = height;
        this.rockets = rockets;
        this.engineVolume = engineVolume;
        this.typeOfEngine = typeOfEngine;
        this.nameFighter = nameFighter;
    }*/

/*    Fighter fighter1 = new Fighter(23, 200, 4, "2,2","we","Cy-15"
    );
    Fighter fighter2 = new Fighter(23, 200, 4, "2,2","we","Cy-15"
    );*/


}
