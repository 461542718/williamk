package com.dejie.community.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你要找的问题不存在，换个试试？"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"未登录，请先登录"),
    SYS_ERROR(2004,"服务太热了，要不然待会再试试~"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"评论不存在了，换个试试？"),
    COMMENT_IS_EMPTY(2007,"评论内容不能为空~")
    ;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getcode() {
        return code;
    }

    private Integer code;
    private String message;


    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

}
