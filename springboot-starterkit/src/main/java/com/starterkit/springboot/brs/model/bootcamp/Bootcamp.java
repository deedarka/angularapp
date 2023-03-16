package com.starterkit.springboot.brs.model.bootcamp;

import com.starterkit.springboot.brs.model.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embedded;
import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "bootcamp")
public class Bootcamp {
    @Id
    String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    String name;
    Date startDate;
    Date endDate;
    String bannerSmallImage;
    String bannerLargeImage;
    String bannerVideoLink;
    String description;
    String longHtml;
    @DBRef
    List<User> users;
    @DBRef
    List<Technology> technologyStack;
    @Embedded
    List<Session> sessions;
}
