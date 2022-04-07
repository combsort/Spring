package com.genspark.SpringBootAssign1.Entity;


import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class Image {

    private int imageId;
    @Lob
    private Byte[] bytes;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Byte[] getBytes() {
        return bytes;
    }

    public void setBytes(Byte[] bytes) {
        this.bytes = bytes;
    }
}
