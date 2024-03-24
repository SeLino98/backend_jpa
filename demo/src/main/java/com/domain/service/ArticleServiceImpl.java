package com.domain.service;

import com.domain.dto.request.ArticleReqDto;
import com.global.model.BaseResponseBody;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ArticleServiceImpl implements ArticleService{

    @Override
    public ResponseEntity<BaseResponseBody> saveArticle(ArticleReqDto article, MultipartFile image) {
        return null;
    }

    @Override
    public ResponseEntity<BaseResponseBody> searchArticle(Long articleId) {
        return null;
    }
}
