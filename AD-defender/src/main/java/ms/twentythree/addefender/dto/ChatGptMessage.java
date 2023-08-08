package ms.twentythree.addefender.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ChatGptMessage implements Serializable {
    private String role;      // 메시지의 역할 (발신자, 수신자 등)
    private String content;   // 메시지 내용

    // 추가적인 필드들을 필요에 따라 정의할 수 있음
    // 타임스탬프, 메시지 유형 등을 추가할 수 있음
}

