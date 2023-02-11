package com.library.borrow.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation {

    private Long id;
    private Long userId;
    private Long resourceId;
}
