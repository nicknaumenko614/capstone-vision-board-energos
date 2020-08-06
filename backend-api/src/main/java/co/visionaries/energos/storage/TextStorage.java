package co.visionaries.energos.storage;

import co.visionaries.energos.entities.Image;
import co.visionaries.energos.entities.Text;
import co.visionaries.energos.repositories.TextRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TextStorage {
    private TextRepository textRepo;

    public TextStorage(TextRepository textRepo) {
        this.textRepo = textRepo;
    }

    public Collection<Text> getAllTexts (){
        return (Collection <Text>) textRepo.findAll();
    }

    public Text retrieveTextById(long textId) {
        return textRepo.findById(textId).get();
    }

    public Text saveText(Text text) {
        return textRepo.save(text);
    }

    public void deleteText(long textId) {
        textRepo.deleteById(textId);
    }
}
