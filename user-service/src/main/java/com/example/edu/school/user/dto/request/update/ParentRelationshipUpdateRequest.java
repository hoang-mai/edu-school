package com.example.edu.school.user.dto.request.update;

import com.example.edu.school.user.model.ParentRelationship;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

/*
    Chỉ admin, assistant, teacher mới có quyền cập nhật mối quan hệ giữa phụ huynh và học sinh
 */

@Getter
public class ParentRelationshipUpdateRequest {

    @NotNull(message = "Mã học sinh không được để trống")
    private Long studentId;

    @NotNull(message = "Mã phụ huynh không được để trống")
    private Long parentId;

    @NotNull(message = "Mối quan hệ không được để trống")
    private ParentRelationship parentRelationship;
}
