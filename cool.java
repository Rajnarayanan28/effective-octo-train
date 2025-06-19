class Car{
    String engine;
    int exist = 0;
    String[] vEngines = {"V2", "V3", "V4", "V5", "V6","V8", "V10", "V12", "V16", "V18","V20", "V24"};
    Car(String engine){
        this.engine = engine;
        for (int i = 0; i < vEngines.length ;i++){
            if(vEngines[i].equals(engine)){
                exist = 1;
            }
        }
        if( exist == 1 ){
            System.out.println("Engine Exists");
        }
    }

}

class Main{
    public static void main(String args[]){
        Car car = new Car("V2");
    }
}