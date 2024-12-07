package com.vivek.service.rest;

import com.vivek.service.services.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class EchoResource {
    @Autowired
    MessageServiceImpl messageService;
   /* @GetMapping("/message")
    public ResponseEntity getMessage(){
        Map<String,String> map = new HashMap<>();
        map.put("code","SUCCESS_MESSAGE");
        map.put("message","Success");
        return ResponseEntity.ok().body(map);
    }

}*/
 /*  @GetMapping("/unique-message")
   public ResponseEntity getUniqueMessage() {
       Set<Map<String, String>> uniqueMessage = new HashSet<>();
       List<Map<String,String>> msg = new ArrayList<>();

       Map<String, String> message1 = new HashMap<>();
       message1.put("Code", "SUCCESS_MESSAGE");
       message1.put("message", "Success");

       uniqueMessage.add(message1);

       Map<String, String> message2 = new HashMap<>();
       message2.put("Code", "Success");
       message2.put("message", "Success Again");

       uniqueMessage.add(message2);

       return ResponseEntity.ok().body(uniqueMessage);
   }
}
*/
@GetMapping("/Notification-Log")
public ResponseEntity getNotificationLog(){
    List<Map<String,String>> notifications = new ArrayList<>();

    addUniqueNotification(notifications,"Event-Reminder","Reminder: Upcoming event tomorrow.");
    addUniqueNotification(notifications, "PAYMENT_OVERDUE", "Payment is overdue for your last order.");
    addUniqueNotification(notifications, "EVENT_REMINDER", "Reminder: Upcoming event tomorrow.");
    addUniqueNotification(notifications, "EVENT_REMINDER", "Reminder: Upcoming event tomorrow.");

    return ResponseEntity.ok().body(notifications);
}
private void addUniqueNotification(List<Map<String,String>> notifications,String code, String message){
    for(Map<String,String> notification : notifications){
        if(notification.get("code").equals(code) && notification.get("message").equals(message)){
            return;
        }
    }
    Map<String,String> newNotifiction = new HashMap<>();
    newNotifiction.put("code",code);
    newNotifiction.put("message",message);
    notifications.add(newNotifiction);
}
}
