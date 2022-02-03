package az.com.bk.Service;

import az.com.bk.Repository.CardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{

 private CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }


}
