package com.yedam.tfprj.client.community.service.qna;

import lombok.Data;

@Data
public class CliQnaVO {
    private int     qNo;
    private String  title;
    private String  wdate;
    private int     views;
    private String  details;
    private String  writer;
    private int     cNo;
    private String  cdate;
    private String  cdetails;
    private String  cwriter;
}
