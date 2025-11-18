package micgrz.krzysbackend.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(String content) {
        Message message = new Message(content);
        return messageRepository.save(message);
    }
}
