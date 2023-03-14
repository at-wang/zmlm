package com.example.zmlmmessage.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class UserMessage {
    @Id
    private Integer id;
    private String toUserId;
    private String fromUserId;
    private String content;
    private Date sendTime;
    private Date createTime;
    private String whetherRead;
    private String imageUrl;
}
