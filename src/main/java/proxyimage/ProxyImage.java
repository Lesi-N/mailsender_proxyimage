package proxyimage;

import lombok.Getter;

@Getter
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String file){
        this.fileName = file;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);

        }
        realImage.display();
    }
}
