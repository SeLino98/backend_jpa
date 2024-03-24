package com.domain.controller;

import com.domain.dto.request.ArticleReqDto;
import com.domain.service.ArticleService;
import com.global.model.BaseResponseBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@Slf4j
@Tag(name = "Article ", description = "관련 api ")
@RestController
@Getter
@RequiredArgsConstructor
@RequestMapping("/api/article")
@Validated
public class CryController {

    private final ArticleService articleService;
    @PostMapping(value = "/regist", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    @Operation(summary = "게시글 등록", description = "게시글을 등록합니다.")
    @ApiResponse(responseCode = "201", description = "성공 /n/n Success 반환")
    public ResponseEntity<? extends BaseResponseBody> articleSave(
            @Valid @RequestPart(value = "articleReqDto") ArticleReqDto articleReqDto,
            @RequestPart(value = "mainImage") MultipartFile mainImage) {
        return articleService.saveArticle(articleReqDto, mainImage);
    }
}
