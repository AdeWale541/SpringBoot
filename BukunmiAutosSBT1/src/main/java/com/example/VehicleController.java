package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/BAcars")

public class VehicleController {

    Kremlin krem1= new Kremlin();
    Kremlin krem2= new Kremlin();
    Kremlin krem3= new Kremlin();

    AIset aIset1 = new AIset();
    AIset aIset2 = new AIset();
    AIset aIset3 = new AIset();


    ArrayList <Vehicle> allBAVehicles= new ArrayList<>();
    int i;

    VehicleController(){
        krem1.setBrandName("Mercedes");
        krem1.setCarId(i=i+1);
        krem1.setCarColour("Beige");
        krem1.setHasAutoBreaking(true);
        krem1.setNumberOfDoors(4);
        krem1.setGearType("Manual");
        krem1.setNumberOfWheels(4);
        krem1.setEngineCapacity(2500);
        krem1.setMaximumSpeed(250);

        krem2.setBrandName("Porsche");
        krem2.setCarId(i=i+1);
        krem2.setCarColour("Blue");
        krem2.setHasAutoBreaking(false);
//      krem2.setNumberOfDoors(0);
        krem2.setGearType("Automatic");
        krem2.setNumberOfWheels(2);
        krem2.setEngineCapacity(2000);
        krem2.setMaximumSpeed(222);

        krem3.setBrandName("Fatosh");
        krem3.setCarId(i=i+1);
        krem3.setCarColour("Magenta");
        krem3.setHasAutoBreaking(false);
        krem3.setNumberOfDoors(1);
        krem3.setGearType("Manual");
        krem3.setNumberOfWheels(3);
        krem3.setEngineCapacity(1200);
        krem3.setMaximumSpeed(100);

        aIset1.setBrandName("Porsche");
        aIset1.setCarId(i=i+1);
        aIset1.setCarColour("Green");
        aIset1.setHasAutoBreaking(true);
        aIset1.setNumberOfDoors(4);
        aIset1.setGearType("Automatic");
        aIset1.setNumberOfWheels(4);
        aIset1.setEngineCapacity(2200);
        aIset1.setSelfDrivingMaxSpeed(140);

        aIset2.setBrandName("Tesla");
        aIset2.setCarId(i=i+1);
        aIset2.setCarColour("Red");
        aIset2.setHasAutoBreaking(false);
//      aIset2.setNumberOfDoors(0);
        aIset2.setGearType("Automatic");
        aIset2.setNumberOfWheels(2);
        aIset2.setEngineCapacity(1800);
        aIset2.setSelfDrivingMaxSpeed(240);

        aIset3.setBrandName("Tesla Truck");
        aIset3.setCarId(i=i+1);
        aIset3.setCarColour("Black");
        aIset3.setHasAutoBreaking(true);
        aIset3.setNumberOfDoors(2);
        aIset3.setGearType("Manual");
        aIset3.setNumberOfWheels(8);
        aIset3.setEngineCapacity(5000);
        aIset3.setSelfDrivingMaxSpeed(230);


        allBAVehicles.add(krem1);
        allBAVehicles.add(krem2);
        allBAVehicles.add(krem3);
        allBAVehicles.add(aIset1);
        allBAVehicles.add(aIset2);
        allBAVehicles.add(aIset3);
    }


    @GetMapping("/getAllVehicles")
    public ArrayList listAllCars(){


        return allBAVehicles;
    }

    @GetMapping("/get4PlusDoorVehicles")
    public ArrayList listCarsWithFourPlusDoors(){
        ArrayList<Vehicle> fourDoorPlusVehicles= new ArrayList<>();
        Vehicle fourDoorPlusVehicleObject = new Vehicle();

        for(int j=0;j<allBAVehicles.size();j++) {
            fourDoorPlusVehicleObject = allBAVehicles.get(j);
            if (fourDoorPlusVehicleObject.getNumberOfDoors()>3) {
                fourDoorPlusVehicles.add(fourDoorPlusVehicleObject);
            }
        }
      return  fourDoorPlusVehicles;
        }

    @GetMapping("/getVehicleById")
    public Vehicle listCarsWithId(@RequestBody int carId){// I chose not to use Path Variable or Request Param. It's pretty easy
        ArrayList<Vehicle> fourDoorPlusVehicles= new ArrayList<>();
        Vehicle vehicleByIdClass = new Vehicle();

        for(int j=0;j<allBAVehicles.size();j++) {
            vehicleByIdClass = allBAVehicles.get(j);
            if (vehicleByIdClass.getCarId()== carId) {
               break;
            }
        }
        return  vehicleByIdClass;
    }
///{carType}@PathVariable("carType") String carType,
    @PostMapping("/addNewVehicle/{carType}")
    public ArrayList addVehicle(@PathVariable("carType") String carType,@RequestBody Vehicle newVehicle){// I chose not to use Path Variable or Request Param. It's pretty easy

      //  if (carType=="Kremlin") {
    //        Kremlin newKremlin = new Kremlin();
      //      newKremlin = (Kremlin) newVehicle;
         //   allBAVehicles.add(newVehicle);
      //  } else if (carType=="AIset") {
        //    AIset newAIset = new AIset();
        //    newAIset = (AIset) newVehicle;
        if(carType.equals("Kremlin")){
          //  Kremlin newKremlin = (Kremlin) newVehicle();
        newVehicle.setCarId(i=i+1);
            //         allBAVehicles.add(newKremlin);
        } else { }

        return allBAVehicles;
    }

 /*   @PutMapping ("/updateExistingVehicle")
    public ArrayList<Vehicle> updateVehicle(@RequestBody Vehicle newVehicle){// I chose not to use Path Variable or Request Param. It's pretty easy

        allBAVehicles.add(newVehicle);
        newVehicle.setCarId(i=i+1);
        return allBAVehicles;
    }
    @PostMapping("/saveCar")
    public Result saveCar(@RequestBody Cars newCar){






     allCars.add(newCar);

     Result newResult = new Result();
     newResult.setAddedCar(newCar);
     newResult.setStatusCode(204);
     newResult.setStatusMessage("Successful");
     return newResult ;
    }

    @GetMapping("/getAllCars")
    public ArrayList listCars(){


        return allCars;
    }*/

   /* @DeleteMapping("/DeleteCar")
    public ArrayList DeleteCars(@RequestBody Cars newCar){
        allCars.remove(newCar);

        return allCars;
    }*/
}
