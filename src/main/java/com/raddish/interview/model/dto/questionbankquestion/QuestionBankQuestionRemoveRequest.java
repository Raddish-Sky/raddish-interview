package com.raddish.interview.model.dto.questionbankquestion;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除题库题目关联请求
 *
 */
@Data
public class QuestionBankQuestionRemoveRequest implements Serializable {

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private String questionId;


    private static final long serialVersionUID = 1L;
}