package fitnessCenterChallenge.service;

import fitnessCenterChallenge.models.Item;
import fitnessCenterChallenge.models.Member;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private List<String> logList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm");

    public void buy(Item item, Member member) {
        // To do validations
        logList.add(LocalDateTime.now().format(formatter) + ": " + member.getName() + " bought " + item.getName() + ": " + item.getValue());
        member.setBalance(member.getBalance() + item.getValue());
    }

    public void printLogs() {
        for (String item : logList) {
            System.out.println(item);
        }
    }
}
