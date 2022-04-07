package com.genspark.SpringBootAssign1.Service;

import com.genspark.SpringBootAssign1.Dao.ImageDao;
import com.genspark.SpringBootAssign1.Entity.Image;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class ImageServiceImpl implements ImageService{


    private final ImageDao imageDao;

    public ImageServiceImpl( ImageDao imageDao) {

        this.imageDao = imageDao;
    }

    @Override
    @Transactional
    public void saveImageFile(int imageId, MultipartFile file) {

        try {
            Image image = imageDao.findById(imageId).get();
            Byte[] byteObjects = new Byte[file.getBytes().length];

            int i = 0;
            for (byte b : file.getBytes()){
                byteObjects[i++] = b;
            }

            image.setBytes(byteObjects);
            imageDao.save(image);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
