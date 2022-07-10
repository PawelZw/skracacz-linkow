package link;

import com.example.linkshortener.LinkDto;

public interface LinkService {
    LinkDto createLink(LinkDto linkDto);

    String getLink(LinkDto linkDto );


}
