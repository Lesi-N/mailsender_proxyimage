package proxyimage;

import lombok.Getter;


public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
    public void loadFromDisk(){
        System.out.println(fileName + " loaded");
    }
}
