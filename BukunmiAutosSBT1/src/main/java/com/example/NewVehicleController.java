package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@RestController
@RequestMapping(value = "/new/BAcars")

public class NewVehicleController {


    NewVehicle krem1 = new NewVehicle();
    NewVehicle krem2 = new NewVehicle();
    NewVehicle krem3 = new NewVehicle();

    NewVehicle krem4 = new NewVehicle();
    NewVehicle krem5 = new NewVehicle();
    NewVehicle krem6 = new NewVehicle();


    ArrayList<NewVehicle> allBAVehicles = new ArrayList<>();
    int i;

    NewVehicleController() {
        krem1.setBrandName("Mercedes");
        krem1.setCarId(i = i + 1);
        krem1.setCarColour("Beige");
        krem1.setHasAutoBreaking(true);
        krem1.setNumberOfDoors(4);
        krem1.setGearType("Manual");
        krem1.setNumberOfWheels(4);
        krem1.setEngineCapacity(2500);
        krem1.setMaximumSpeed(250);

        krem2.setBrandName("Porsche");
        krem2.setCarId(i = i + 1);
        krem2.setCarColour("Blue");
        krem2.setHasAutoBreaking(false);
//      krem2.setNumberOfDoors(0);
        krem2.setGearType("Automatic");
        krem2.setNumberOfWheels(2);
        krem2.setEngineCapacity(2000);
        krem2.setMaximumSpeed(222);

        krem3.setBrandName("Fatosh");
        krem3.setCarId(i = i + 1);
        krem3.setCarColour("Magenta");
        krem3.setHasAutoBreaking(false);
        krem3.setNumberOfDoors(1);
        krem3.setGearType("Manual");
        krem3.setNumberOfWheels(3);
        krem3.setEngineCapacity(1200);
        krem3.setMaximumSpeed(100);

        krem4.setBrandName("Porsche");
        krem4.setCarId(i = i + 1);
        krem4.setCarColour("Green");
        krem4.setHasAutoBreaking(true);
        krem4.setNumberOfDoors(4);
        krem4.setGearType("Automatic");
        krem4.setNumberOfWheels(4);
        krem4.setEngineCapacity(2200);
        krem4.setSelfDrivingMaxSpeed(140);

        krem5.setBrandName("Tesla");
        krem5.setCarId(i = i + 1);
        krem5.setCarColour("Red");
        krem5.setHasAutoBreaking(false);
//      aIset2.setNumberOfDoors(0);
        krem5.setGearType("Automatic");
        krem5.setNumberOfWheels(2);
        krem5.setEngineCapacity(1800);
        krem5.setSelfDrivingMaxSpeed(240);

        krem6.setBrandName("Tesla Truck");
        krem6.setCarId(i = i + 1);
        krem6.setCarColour("Black");
        krem6.setHasAutoBreaking(true);
        krem6.setNumberOfDoors(2);
        krem6.setGearType("Manual");
        krem6.setNumberOfWheels(8);
        krem6.setEngineCapacity(5000);
        krem6.setSelfDrivingMaxSpeed(230);


        allBAVehicles.add(krem1);
        allBAVehicles.add(krem2);
        allBAVehicles.add(krem3);
        allBAVehicles.add(krem4);
        allBAVehicles.add(krem5);
        allBAVehicles.add(krem6);
    }


    @GetMapping("/getAllVehicles")
    public ArrayList listAllCars() {


        return allBAVehicles;
    }

    @GetMapping("/get4PlusDoorVehicles")
    public ArrayList listCarsWithFourPlusDoors() {
        ArrayList<NewVehicle> fourDoorPlusVehicles = new ArrayList<>();
        NewVehicle fourDoorPlusVehicleObject = new NewVehicle();

        for (int j = 0; j < allBAVehicles.size(); j++) {
            fourDoorPlusVehicleObject = allBAVehicles.get(j);
            if (fourDoorPlusVehicleObject.getNumberOfDoors() > 3) {
                fourDoorPlusVehicles.add(fourDoorPlusVehicleObject);
            }
        }
        return fourDoorPlusVehicles;
    }

    @GetMapping("/getVehicleById")
    public NewVehicle listCarsWithId(@RequestBody int carId) {// I chose not to use Path Variable or Request Param. It's pretty easy
        NewVehicle vehicleByIdClass = new NewVehicle();

            vehicleByIdClass = allBAVehicles.get(carId-1);
        return vehicleByIdClass;
    }

    ///{carType}@PathVariable("carType") String carType,
    @PostMapping("/addNewVehicle")
    public NewVehicle addVehicle(@RequestBody NewVehicle newNewVehicle) {// I chose not to use Path Variable or Request Param. It's pretty easy

        //  if (carType=="Kremlin") {
        //        Kremlin newKremlin = new Kremlin();
        //      newKremlin = (Kremlin) newVehicle;
        //   allBAVehicles.add(newVehicle);
        //  } else if (carType=="AIset") {
        //    AIset newAIset = new AIset();
        //    newAIset = (AIset) newVehicle;
        //if(carType.equals("Kremlin")){
        //  Kremlin newKremlin = (Kremlin) newVehicle();
        newNewVehicle.setCarId(i = i + 1);
        allBAVehicles.add(newNewVehicle);
        // } else { }

        return newNewVehicle;
    }

    @PutMapping("/updateExistingVehicle/{carId}")
    public NewVehicle updateVehicle(@RequestParam("brandName") String brandName,
                                  /*  @RequestParam(name="carColour",required=false) String carColour,
                                    @RequestParam(name="hasAutoBreaking",required=false) Boolean hasAutoBreaking,
                                    @RequestParam(name="numberOfDoors",required=false) int numberOfDoors,
                                    @RequestParam(name="gearType",required=false) String gearType,
                                    @RequestParam(name="numberOfWheels",required=false) int numberOfWheels,
                                    @RequestParam(name="engineCapacity",required=false) int engineCapacity,
                                    @RequestParam(name="selfDrivingMaxSpeed",required=false) int selfDrivingMaxSpeed,
                                    @RequestParam(name="maximumSpeed",required=false) int maximumSpeed,*/
                                    @PathVariable("carId") int carId) {

        allBAVehicles.get(carId-1).setBrandName(brandName);
      /*  allBAVehicles.get(carId-1).setCarColour(carColour);
        allBAVehicles.get(carId-1).setHasAutoBreaking(hasAutoBreaking);
        allBAVehicles.get(carId-1).setNumberOfDoors(numberOfDoors);
        allBAVehicles.get(carId-1).setGearType(gearType);
        allBAVehicles.get(carId-1).setNumberOfWheels(numberOfWheels);
        allBAVehicles.get(carId-1).setEngineCapacity(engineCapacity);
        allBAVehicles.get(carId-1).setSelfDrivingMaxSpeed(selfDrivingMaxSpeed);
        allBAVehicles.get(carId-1).setMaximumSpeed(maximumSpeed);*/
        return allBAVehicles.get(carId-1);
    }


    @PutMapping("/updateMaxSpeedOfAllVehicles")
    public ArrayList<NewVehicle> updateMaxSpeedOfAllVehicles(@RequestParam("maximumSpeed") int maximumSpeed) {

        for (int j = 0; j < allBAVehicles.size(); j++) {
            allBAVehicles.get(j).setMaximumSpeed(maximumSpeed);
        }
        return allBAVehicles;
    }
        @DeleteMapping("/deleteVehicleById/{carId}")
        public ArrayList<NewVehicle> deleteVehicle (@PathVariable("carId") int carId){
            allBAVehicles.remove(carId-1);
            return allBAVehicles;
        }

}
