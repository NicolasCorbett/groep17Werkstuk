const drivers = [
    {age: 19, name: "Liam", speed: 20},
    {age: 25, name: "Alex", speed: 30},
    {age: 27, name: "Nick", speed: 400},
    {age: 32, name: "Kiki", speed: 50},
    {age: 17, name: "Nico", speed: 90},
    {age: 36, name: "Jeroen", speed: 2000},
    {age: 29, name: "Niels", speed: 70},
    {age: 20, name: "Arno", speed: 35},
    {age: 45, name: "Pim", speed: 25},
    {age: 15, name: "Rob", speed: 55},
    {age: 20, name: "Brent", speed: 60},
    {age: 24, name: "Toto", speed: 120},
    {age: 21, name: "Robbe<3", speed: 69420}
   ];

/////////////////////////////////////////////////////////////

   const speedObservations = {
    slow:           'below 90km/h',
    intermediate:   'exceeding 90km/h',
    high:           'zooming faster than 110km/h'
};

function getSpeed(km){
    if (km >= 110){
        return 'high';
    }else if (km >= 90){
        return 'intermediate';
    }else{
        return 'slow';
    }
}

function raceObservation(speedObservations){
        return function(driver){
            const driverName = driver.name;
            const speed = getSpeed(driver.speed);
            const speedObservation = speedObservations[speed];
            return `${driverName} drove past at a ${speed} speed, ${speedObservation}`;
        };
}
const driverObservations = drivers.map(raceObservation(speedObservations));
console.log(driverObservations); 
/*
logging to the console is een noodzakelijke side-effect 
t.o.v. de gebruiker. We wachten echter zo lang mogelijk
met het aanpassen v.d. state, tot na we alle bewerkingen op
de data gedaan hebben.
*/  

//////////////////////////////////////////////////////////////////////////////////////////////

const skillLevel = {
    beginner:{
         maxSpeed: 90,
         drifting: false
    },
    regular: {
         maxSpeed: 110,
         drifting: true
    },
    expert:  {
         maxSpeed: "no limit",
         drifting: true
    }
 };
 
 function getLevel(level){
     if(level >= 110){
         return 'expert';
     }else if (level >= 90){
         return 'regular';
     }else{
         return 'beginner';
     }
 }
 
 function addSkillset(skillsets){
     return function(driver){
         const speed = getLevel(driver.speed);
         const skillset = skillsets[speed];
         const driverWithSkill = {
             ...driver,
             maxSpeed: skillset.maxSpeed,
             drifting: skillset.drifting
        };
        return driverWithSkill;
     };
     
 }
 
 const driversWithSkillset = drivers.map(addSkillset(skillLevel));
 console.log(driversWithSkillset); //zie comment line 45-50

 ////////////////////////////////////////////////////////////////////////////////

 const a = { 
    a: ""
};
/*
    deze const wordt gebruikt om de partiële applicatie addSpeed
    mogelijk te maken. Verder heeft deze echter geen echte functionaliteit.
*/

function addSpeed(a){
    return function (driver){
        const b = a;
        const moddedDrivers = {
            ...driver,
            setSpeed: function(number){
                this.speed = number;
            }
        };
        moddedDrivers.setSpeed(350);
        return moddedDrivers;
    };
}

const oneDriver = drivers.filter(driver => driver.name === "Liam");
console.log(oneDriver);

const SpeedSet = oneDriver.map(addSpeed(a));
console.log(SpeedSet);