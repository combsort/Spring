package com.genspark.SpringBootAssign1.Service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void saveImageFile(int imageId, MultipartFile file);

}
