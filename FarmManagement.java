public class FarmManagement {
    private String name;
    private boolean swim;
    private boolean walk;

    public FarmManagement(String name) {
        this.name = name;
        if (name == "Pig") {
            this.swim = false;
            this.walk = true;
        }

        if (name == "Duck") {
            this.swim = true;
            this.walk = true;
        }

        if (name == "Fish") {
            this.swim = true;
            this.walk = false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public boolean isWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    public void display() {
        String pos = "";
        if (swim == true && walk == false) {
            pos = "can swim";
        } else if (swim == false && walk == true) {
            pos = "can walk";
        } else if (swim == true && walk == true) {
            pos = "can walk and swim";
        }
        System.out.println(name + " " + pos);
    }
}




