package com.busaridwan.testpractice.designpatterns.builder;

public class House {
    private String type;
    private String wall;
    private String floor;

    private House(HouseBuilder builder){

    }

    public String getType() {
        return type;
    }

    public String getWall() {
        return wall;
    }

    public String getFloor() {
        return floor;
    }
    public static class HouseBuilder{
        private String type;
        private String wall;
        private String floor;

        public HouseBuilder type(String type){
            this.type = type;
            return this;
        }
        public HouseBuilder wall(String wall){
            this.wall = wall;
            return this;
        }
        public HouseBuilder floor(String floor){
            this.floor = floor;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}
