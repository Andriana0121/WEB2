package coffee;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal){
        if(banknoteNominal == 5 || banknoteNominal == 10){
            return true;
        }
        return false;
    }

    private String choose(Integer option){
        if(option == 1){
            return "Latte";
        } else if(option == 2){
            return "Cappuccino";
        }else if(option == 3){
            return "Expresso";
        }else if(option == 4){
            return "Americano";
        }
        return "Incorrect option";
    }

    private void showInfo(String message){
        System.out.println(message);
    }

    private String done(String coffeeType){
        return coffeeType;
    }

    private String Sugar(Integer sugars) {
        if (sugars == 1) {
            return "Coffee with sugar!";
        } else if (sugars == 2) {
            return "Coffee without sugar!";
        }
        return "Incorrect option";
    }
    private String Milk(Integer milks){
        if(milks == 1){
            return "Coffee with milk!";
        }else if (milks == 2){
            return "Coffe without milk";
        }
        return "Incorrect option";
    }

    public void prepare(){
        String coffeeType = "";
        String sugar = "";
        String milk = "";
        this.showInfo("Please insert banknote");
        if(this.pay(5)){
            this.showInfo("Please chose type of coffee");
            coffeeType = this.choose(3);
            this.showInfo("Your coffee" + coffeeType + "Do you want to add sugar?");
            sugar = this.Sugar(2);
            this.showInfo("Your coffee" + coffeeType + "Do you want to add milk?");
            milk = this.Milk(1);
            this.showInfo("Your choice is: " + coffeeType + " " + sugar + " " + milk);
            this.showInfo("Preparing...");
            this.showInfo(
                    "Done: " + this.done(coffeeType + " " + sugar + " " + milk)
            );
        } else {
            this.showInfo("Please insert correct banknote");
        }
    }
}