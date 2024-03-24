package com.domain.service;

import com.domain.dto.request.ArticleReqDto;
import com.global.model.BaseResponseBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    //게시글 저장
    ResponseEntity<BaseResponseBody> saveArticle(ArticleReqDto article, MultipartFile image);


    //게시글 조회
    ResponseEntity<BaseResponseBody> searchArticle(Long articleId);


}
