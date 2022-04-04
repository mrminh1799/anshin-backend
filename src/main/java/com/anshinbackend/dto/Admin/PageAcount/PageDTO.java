package com.anshinbackend.dto.Admin.PageAcount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageDTO {
    Integer currentPage;
    Integer numRec;
    Integer totalPage;
    Long totalRecord;
    List<AcountDTO> content;
}
