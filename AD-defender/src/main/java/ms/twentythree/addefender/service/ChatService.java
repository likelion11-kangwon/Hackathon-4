package ms.twentythree.addefender.service;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatgptService chatgptService;

    public String getChatResponse(String prompt) {
        // ChatGPT 에게 질문을 던진다.
        return chatgptService.sendMessage(prompt);
    }
}
